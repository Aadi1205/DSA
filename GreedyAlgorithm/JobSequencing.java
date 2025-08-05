package GreedyAlgorithm;

import java.util.*;

public class JobSequencing {

    // Job class to store job info
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    // Function to perform job sequencing and return maximum job IDs
    public static List<Integer> getMaxJobs(List<Job> jobs) {
        // Step 1: Sort jobs by descending profit
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        List<Integer> sequence = new ArrayList<>();
        int time = 0;

        // Step 2: Select jobs greedily by deadline
        for (Job job : jobs) {
            if (job.deadline > time) {
                sequence.add(job.id); 
                time++;               
            }
        }

        return sequence;
    }

    public static void main(String[] args) {
        int[][] jobsInfo = {
            {4, 20}, {1, 10}, {1, 40}, {1, 30}
        };

       
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1])); // id, deadline, profit
        }

       
        List<Integer> result = getMaxJobs(jobs);

        
        System.out.println("Max jobs: " + result.size());
        System.out.print("Job IDs: " + result);
        
    }
}
