import { useState, useEffect, useRef } from 'react';
import { User, Key, VoteIcon, CheckCircle, AlertTriangle, Camera, FileText, ChevronLeft, ChevronRight, LogOut } from 'lucide-react';

// Main Application
export default function VotingApp() {
  const [currentStep, setCurrentStep] = useState('login');
  const [user, setUser] = useState(null);
  const [error, setError] = useState('');
  const [notification, setNotification] = useState('');
  const [candidates, setCandidates] = useState([]);
  const [selectedCandidate, setSelectedCandidate] = useState(null);
  const [idVerified, setIdVerified] = useState(false);
  const [faceVerified, setFaceVerified] = useState(false);
  const [voteCasted, setVoteCasted] = useState(false);
  const [capturedImage, setCapturedImage] = useState(null);
  const [showCamera, setShowCamera] = useState(false);
  const videoRef = useRef(null);
  const canvasRef = useRef(null);

  // Mock candidates data
  useEffect(() => {
    setCandidates([
      { id: 1, name: "Candidate A", party: "Party X", votes: 0 },
      { id: 2, name: "Candidate B", party: "Party Y", votes: 0 },
      { id: 3, name: "Candidate C", party: "Party Z", votes: 0 },
      { id: 4, name: "Candidate D", party: "Party W", votes: 0 }
    ]);
  }, []);

  // Mock login function
  const handleLogin = (voterID, password) => {
    // In a real app, this would validate against an API
    if (voterID && password) {
      setUser({ voterID, name: "Demo Voter" });
      setCurrentStep('idVerification');
      setNotification('Login successful! Please verify your ID document');
    } else {
      setError('Invalid voter ID or password');
    }
  };

  // Mock ID verification
  const handleIdVerification = (idFile) => {
    // In a real app, this would send the ID to a verification service
    setIdVerified(true);
    setCurrentStep('faceVerification');
    setNotification('ID Verified! Please complete facial verification');
  };

  // Initialize webcam for facial recognition
  const initCamera = async () => {
    try {
      const stream = await navigator.mediaDevices.getUserMedia({ video: true });
      if (videoRef.current) {
        videoRef.current.srcObject = stream;
      }
      setShowCamera(true);
      setError('');
    } catch (err) {
      setError('Could not access camera. Please check permissions.');
    }
  };

  // Capture image for facial recognition
  const captureImage = () => {
    if (videoRef.current && canvasRef.current) {
      const context = canvasRef.current.getContext('2d');
      const { videoWidth, videoHeight } = videoRef.current;
      
      canvasRef.current.width = videoWidth;
      canvasRef.current.height = videoHeight;
      
      context.drawImage(videoRef.current, 0, 0, videoWidth, videoHeight);
      const imageDataUrl = canvasRef.current.toDataURL('image/png');
      
      setCapturedImage(imageDataUrl);
      setShowCamera(false);
      
      // Stop the video stream
      const stream = videoRef.current.srcObject;
      if (stream) {
        const tracks = stream.getTracks();
        tracks.forEach(track => track.stop());
      }
      
      // In a real app, you would send this image for verification against the ID
      setTimeout(() => {
        setFaceVerified(true);
        setCurrentStep('voting');
        setNotification('Face verification successful! You may now cast your vote');
      }, 2000);
    }
  };

  // Mock vote casting function
  const castVote = () => {
    if (!selectedCandidate) {
      setError('Please select a candidate');
      return;
    }
    
    // In a real app, this would send the vote to the blockchain
    setVoteCasted(true);
    setCurrentStep('confirmation');
    setNotification('Your vote has been recorded on the blockchain!');
    
    // Generate mock transaction ID for the blockchain
    const mockTxHash = "0x" + Array(40).fill(0).map(() => 
      Math.floor(Math.random() * 16).toString(16)).join('');
    
    return mockTxHash;
  };

  // Log out user
  const logout = () => {
    setUser(null);
    setIdVerified(false);
    setFaceVerified(false);
    setVoteCasted(false);
    setSelectedCandidate(null);
    setCapturedImage(null);
    setCurrentStep('login');
    setError('');
    setNotification('');
  };

  // Render different components based on current step
  const renderStep = () => {
    switch (currentStep) {
      case 'login':
        return <LoginForm onLogin={handleLogin} error={error} />;
      case 'idVerification':
        return <IDVerification onVerify={handleIdVerification} />;
      case 'faceVerification':
        return (
          <FaceVerification 
            onInitCamera={initCamera}
            onCapture={captureImage}
            showCamera={showCamera}
            capturedImage={capturedImage}
            videoRef={videoRef}
            canvasRef={canvasRef}
            verified={faceVerified}
          />
        );
      case 'voting':
        return (
          <VotingForm 
            candidates={candidates}
            selectedCandidate={selectedCandidate}
            onSelectCandidate={setSelectedCandidate}
            onCastVote={castVote}
            error={error}
          />
        );
      case 'confirmation':
        return <Confirmation onLogout={logout} />;
      default:
        return <LoginForm onLogin={handleLogin} error={error} />;
    }
  };

  return (
    <div className="bg-gray-100 min-h-screen">
      {/* Header */}
      <header className="bg-blue-600 text-white p-4 shadow">
        <div className="container mx-auto flex justify-between items-center">
          <h1 className="text-2xl font-bold flex items-center gap-2">
            <VoteIcon size={24} />
            Secure Blockchain Voting System
          </h1>
          {user && (
            <div className="flex items-center gap-4">
              <span className="flex items-center gap-2">
                <User size={16} />
                {user.name}
              </span>
              <button 
                onClick={logout}
                className="bg-blue-700 hover:bg-blue-800 px-3 py-1 rounded flex items-center gap-1"
              >
                <LogOut size={16} />
                Logout
              </button>
            </div>
          )}
        </div>
      </header>

      {/* Progress indicator */}
      {user && (
        <div className="container mx-auto mt-6 mb-8">
          <div className="flex justify-between items-center">
            <StepIndicator 
              steps={['Login', 'ID Verification', 'Face Verification', 'Vote', 'Confirmation']}
              currentStep={currentStep}
              stepMap={{
                login: 0,
                idVerification: 1,
                faceVerification: 2,
                voting: 3,
                confirmation: 4
              }}
            />
          </div>
        </div>
      )}

      {/* Main content */}
      <main className="container mx-auto px-4 py-8">
        {notification && (
          <div className="bg-green-100 border border-green-400 text-green-700 px-4 py-3 rounded mb-6 flex items-center gap-2">
            <CheckCircle size={20} />
            {notification}
          </div>
        )}

        <div className="bg-white rounded-lg shadow-lg p-6 max-w-3xl mx-auto">
          {renderStep()}
        </div>
      </main>

      {/* Footer */}
      <footer className="bg-gray-800 text-white text-center py-4 mt-auto">
        <div className="container mx-auto">
          <p>© 2025 Secure Blockchain Voting System. All rights reserved.</p>
          <p className="text-sm text-gray-400 mt-1">Powered by Blockchain Technology</p>
        </div>
      </footer>
    </div>
  );
}

// Login Form Component
function LoginForm({ onLogin, error }) {
  const [voterID, setVoterID] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    onLogin(voterID, password);
  };

  return (
    <div>
      <h2 className="text-xl font-semibold mb-6 flex items-center gap-2">
        <User size={20} />
        Voter Login
      </h2>
      
      <form onSubmit={handleSubmit} className="space-y-4">
        {error && (
          <div className="bg-red-100 border border-red-400 text-red-700 px-4 py-3 rounded flex items-center gap-2">
            <AlertTriangle size={20} />
            {error}
          </div>
        )}
        
        <div className="space-y-2">
          <label htmlFor="voterID" className="block text-sm font-medium text-gray-700">Voter ID</label>
          <input
            id="voterID"
            type="text"
            value={voterID}
            onChange={(e) => setVoterID(e.target.value)}
            placeholder="Enter your Voter ID"
            className="w-full px-4 py-2 border border-gray-300 rounded-md focus:ring-blue-500 focus:border-blue-500"
            required
          />
        </div>
        
        <div className="space-y-2">
          <label htmlFor="password" className="block text-sm font-medium text-gray-700">Password</label>
          <input
            id="password"
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            placeholder="Enter your password"
            className="w-full px-4 py-2 border border-gray-300 rounded-md focus:ring-blue-500 focus:border-blue-500"
            required
          />
        </div>
        
        <button 
          type="submit" 
          className="w-full bg-blue-600 hover:bg-blue-700 text-white font-semibold py-2 px-4 rounded-md transition flex items-center justify-center gap-2"
        >
          <Key size={18} />
          Login to Vote
        </button>
      </form>
      
      <div className="mt-6 text-center text-sm text-gray-600">
        <p>Demo credentials:</p>
        <p>Voter ID: DEMO123 | Password: password</p>
      </div>
    </div>
  );
}

// ID Verification Component
function IDVerification({ onVerify }) {
  const [selectedFile, setSelectedFile] = useState(null);
  const [previewUrl, setPreviewUrl] = useState(null);
  const [isUploading, setIsUploading] = useState(false);

  const handleFileChange = (e) => {
    const file = e.target.files[0];
    if (file) {
      setSelectedFile(file);
      const reader = new FileReader();
      reader.onloadend = () => {
        setPreviewUrl(reader.result);
      };
      reader.readAsDataURL(file);
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (selectedFile) {
      setIsUploading(true);
      // Simulate upload delay
      setTimeout(() => {
        onVerify(selectedFile);
        setIsUploading(false);
      }, 2000);
    }
  };

  return (
    <div>
      <h2 className="text-xl font-semibold mb-6 flex items-center gap-2">
        <FileText size={20} />
        Voter ID Verification
      </h2>
      
      <div className="bg-blue-50 p-4 rounded-md mb-6">
        <p className="text-blue-700">
          Please upload a clear image of your government-issued voter ID card for verification.
        </p>
      </div>

      <form onSubmit={handleSubmit} className="space-y-6">
        <div className="border-2 border-dashed border-gray-300 rounded-md p-6 text-center">
          <input
            type="file"
            id="idDocument"
            accept="image/*"
            onChange={handleFileChange}
            className="hidden"
          />
          
          {!previewUrl ? (
            <label htmlFor="idDocument" className="cursor-pointer block">
              <div className="space-y-3">
                <FileText className="mx-auto text-gray-400" size={48} />
                <p className="text-gray-600">Click to upload your ID document</p>
                <p className="text-sm text-gray-500">Supported formats: JPG, PNG</p>
              </div>
            </label>
          ) : (
            <div className="space-y-4">
              <img 
                src={previewUrl} 
                alt="ID Preview" 
                className="max-h-64 mx-auto rounded border"
              />
              <label htmlFor="idDocument" className="text-blue-600 hover:text-blue-800 cursor-pointer">
                Choose a different file
              </label>
            </div>
          )}
        </div>

        <button 
          type="submit" 
          disabled={!selectedFile || isUploading}
          className={`w-full py-2 px-4 rounded-md transition flex items-center justify-center gap-2 ${
            selectedFile && !isUploading 
            ? 'bg-blue-600 hover:bg-blue-700 text-white' 
            : 'bg-gray-300 text-gray-500 cursor-not-allowed'
          }`}
        >
          {isUploading ? (
            <>
              <div className="animate-spin h-5 w-5 border-2 border-white border-t-transparent rounded-full"></div>
              Verifying...
            </>
          ) : (
            <>
              <CheckCircle size={18} />
              Verify ID Document
            </>
          )}
        </button>
      </form>

      <div className="mt-6 text-center text-sm text-gray-600">
        <p>For demo purposes, any image will pass verification</p>
      </div>
    </div>
  );
}

// Face Verification Component
function FaceVerification({ 
  onInitCamera, 
  onCapture, 
  showCamera, 
  capturedImage, 
  videoRef, 
  canvasRef,
  verified
}) {
  return (
    <div>
      <h2 className="text-xl font-semibold mb-6 flex items-center gap-2">
        <Camera size={20} />
        Facial Verification
      </h2>
      
      <div className="bg-blue-50 p-4 rounded-md mb-6">
        <p className="text-blue-700">
          Please complete facial verification to confirm your identity matches your ID document.
        </p>
      </div>

      <div className="space-y-6">
        {verified ? (
          <div className="text-center py-8">
            <div className="inline-flex items-center justify-center w-16 h-16 bg-green-100 rounded-full mb-4">
              <CheckCircle size={32} className="text-green-600" />
            </div>
            <h3 className="text-lg font-medium text-green-800">Face Verification Successful</h3>
            <p className="text-green-600 mt-2">Your identity has been confirmed.</p>
          </div>
        ) : capturedImage ? (
          <div className="space-y-4 text-center">
            <div>
              <img 
                src={capturedImage} 
                alt="Captured" 
                className="max-h-64 mx-auto border rounded"
              />
            </div>
            <p className="text-gray-700">Verifying your face against ID document...</p>
            <div className="flex justify-center">
              <div className="animate-spin h-8 w-8 border-4 border-blue-500 border-t-transparent rounded-full"></div>
            </div>
          </div>
        ) : showCamera ? (
          <div className="space-y-4">
            <div className="relative border rounded overflow-hidden">
              <video 
                ref={videoRef} 
                className="w-full h-auto" 
                autoPlay 
                playsInline
              />
            </div>
            <canvas ref={canvasRef} className="hidden" />
            
            <div className="flex justify-center">
              <button
                onClick={onCapture}
                className="bg-blue-600 hover:bg-blue-700 text-white font-medium py-2 px-6 rounded-full flex items-center gap-2"
              >
                <Camera size={18} />
                Capture Image
              </button>
            </div>
          </div>
        ) : (
          <div className="text-center py-8">
            <div className="inline-flex items-center justify-center w-16 h-16 bg-gray-100 rounded-full mb-4">
              <Camera size={32} className="text-gray-600" />
            </div>
            <h3 className="text-lg font-medium text-gray-800">Start Camera for Verification</h3>
            <p className="text-gray-600 mt-2">We need to verify that you are the registered voter.</p>
            
            <button
              onClick={onInitCamera}
              className="mt-6 bg-blue-600 hover:bg-blue-700 text-white font-medium py-2 px-6 rounded-full flex items-center gap-2 mx-auto"
            >
              <Camera size={18} />
              Start Camera
            </button>
          </div>
        )}
      </div>

      <div className="mt-6 text-center text-sm text-gray-600">
        <p>For demo purposes, any face capture will pass verification</p>
      </div>
    </div>
  );
}

// Voting Form Component
function VotingForm({ candidates, selectedCandidate, onSelectCandidate, onCastVote, error }) {
  return (
    <div>
      <h2 className="text-xl font-semibold mb-6 flex items-center gap-2">
        <VoteIcon size={20} />
        Cast Your Vote
      </h2>
      
      {error && (
        <div className="bg-red-100 border border-red-400 text-red-700 px-4 py-3 rounded mb-6 flex items-center gap-2">
          <AlertTriangle size={20} />
          {error}
        </div>
      )}

      <p className="text-gray-700 mb-6">
        Select one candidate from the list below to cast your vote. Once submitted, your vote cannot be changed.
      </p>

      <div className="space-y-4 mb-6">
        {candidates.map(candidate => (
          <div 
            key={candidate.id}
            className={`border rounded-md p-4 cursor-pointer transition ${
              selectedCandidate === candidate.id 
              ? 'border-blue-500 bg-blue-50' 
              : 'border-gray-300 hover:border-gray-400'
            }`}
            onClick={() => onSelectCandidate(candidate.id)}
          >
            <div className="flex items-center">
              <div className={`w-5 h-5 rounded-full border flex items-center justify-center ${
                selectedCandidate === candidate.id 
                ? 'border-blue-600' 
                : 'border-gray-400'
              }`}>
                {selectedCandidate === candidate.id && (
                  <div className="w-3 h-3 rounded-full bg-blue-600"></div>
                )}
              </div>
              <div className="ml-3">
                <p className="font-medium">{candidate.name}</p>
                <p className="text-sm text-gray-600">{candidate.party}</p>
              </div>
            </div>
          </div>
        ))}
      </div>

      <div className="bg-yellow-50 p-4 rounded-md mb-6">
        <p className="text-yellow-700 text-sm">
          <strong>Important:</strong> Your vote will be recorded on the blockchain and cannot be altered once submitted.
          The blockchain ensures your vote remains secure and tamper-proof.
        </p>
      </div>

      <button 
        onClick={onCastVote}
        className="w-full bg-green-600 hover:bg-green-700 text-white font-semibold py-3 px-4 rounded-md transition flex items-center justify-center gap-2"
      >
        <VoteIcon size={18} />
        Cast My Vote
      </button>
    </div>
  );
}

// Confirmation Component
function Confirmation({ onLogout }) {
  // Generate a mock blockchain transaction hash
  const txHash = "0x" + Array(40).fill(0).map(() => 
    Math.floor(Math.random() * 16).toString(16)).join('');

  return (
    <div className="text-center py-4">
      <div className="inline-flex items-center justify-center w-20 h-20 bg-green-100 rounded-full mb-6">
        <CheckCircle size={40} className="text-green-600" />
      </div>
      
      <h2 className="text-2xl font-bold text-green-800 mb-2">
        Vote Successfully Cast!
      </h2>
      
      <p className="text-gray-700 mb-6">
        Your vote has been securely recorded on the blockchain and cannot be altered.
        Thank you for participating in this election.
      </p>
      
      <div className="bg-gray-100 rounded-md p-4 mb-8 max-w-lg mx-auto">
        <p className="text-sm text-gray-700 mb-1">Blockchain Transaction Hash:</p>
        <p className="font-mono text-xs break-all bg-white p-2 rounded border">{txHash}</p>
        <p className="text-xs text-gray-500 mt-2">
          You can use this hash to verify your vote on the blockchain explorer.
        </p>
      </div>
      
      <button 
        onClick={onLogout}
        className="bg-blue-600 hover:bg-blue-700 text-white font-medium py-2 px-6 rounded-md transition flex items-center gap-2 mx-auto"
      >
        <LogOut size={18} />
        Finish and Exit
      </button>
    </div>
  );
}

// Step Indicator Component
function StepIndicator({ steps, currentStep, stepMap }) {
  const currentStepIndex = stepMap[currentStep];
  
  return (
    <div className="w-full">
      <div className="flex justify-between items-center">
        {steps.map((step, index) => (
          <div key={index} className="flex flex-col items-center relative">
            <div className={`w-10 h-10 rounded-full flex items-center justify-center ${
              index < currentStepIndex
                ? 'bg-green-500 text-white'
                : index === currentStepIndex
                ? 'bg-blue-600 text-white'
                : 'bg-gray-300 text-gray-600'
            }`}>
              {index < currentStepIndex ? (
                <CheckCircle size={20} />
              ) : (
                index + 1
              )}
            </div>
            <p className={`text-xs mt-2 ${
              index === currentStepIndex
                ? 'text-blue-600 font-medium'
                : 'text-gray-500'
            }`}>
              {step}
            </p>
            
            {/* Connector line */}
            {index < steps.length - 1 && (
              <div className="absolute top-5 left-10 w-full h-0.5 bg-gray-300">
                <div 
                  className="h-full bg-green-500" 
                  style={{ width: index < currentStepIndex ? '100%' : '0%' }}
                ></div>
              </div>
            )}
          </div>
        ))}
      </div>
    </div>
  );
}