package org.launchcode.techjobs_oo;

import java.util.ArrayList;

public class Main {
    

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new Location("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new Location("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new Location("Taste"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        for (Job job : jobs){
            System.out.println(job);
        }

        System.out.println(job1.toString());
    }

}
