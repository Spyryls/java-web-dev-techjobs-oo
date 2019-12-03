package org.launchcode.techjobs_oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        Job job4 = new Job("A Good, Good Dog", new Employer(""), new Location("St. Louis"), new PositionType("Animal Companion"), new CoreCompetency("Being a gud, widdle, wovey, boogie-boo!"));
        Job job5 = new Job("Painter Guy", new Employer("Paint Ninja Painting"), new Location("St. Louis"), new PositionType("Muralist"), new CoreCompetency("Hiding EasterEggs"));
        Job job6 = new Job("Brewer Friend", new Employer("Frank n' Steins"), new Location("St. Louis"), new PositionType("Kitchen"), new CoreCompetency("Salty Attitude"));


        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
        jobs.add(job5);
        jobs.add(job6);

        for (Job job : jobs){
            System.out.println(job);
        }
    }

}
