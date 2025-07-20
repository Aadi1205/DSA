// use of static keyword

package OOPS.polymorphism;

public class StaticKeyword {
    public static void main(String[] args) { // main method is static because 
        Student s1 = new Student();
        s1.schoolName = "RCP";

        Student s2 = new Student();
        System.out.println(s2.schoolName); // it will print RCP because of static keyword

        Student s3 = new Student();
        // s3.schoolName = "ABC"; // if we change school name of s3 then it will change for all the objects of Student class
    }
}

class Student {
    String name;
    int roll;
    // avoid excess memory use
    static int returnPercentage(int math, int phy, int chem) { // static function because method for calc percentage is always same
        return (math + phy + chem) / 3;
    }

    static String schoolName; // use static because it is common for all students

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}
