package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    // FIELDS
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // CONSTRUCTORS
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    // METHODS AND HASH


    @Override // create array to hold job, loop through and store, if empty -> print "Data Not Available"
    public String toString() {
        String[] jobPosting = {this.name, this.employer.getValue(), this.location.getValue(), this.positionType.getValue(), this.coreCompetency.getValue()};
        for (int i = 0; i < jobPosting.length; i++) {
            if(jobPosting[i].equals(""))
                jobPosting[i] = "Data Not Available";
        }
    
        return  "\nId: " + id + "\n" +
                "Name: " + jobPosting[0] + "\n" +
                "Employer: " + jobPosting[1] + "\n" +
                "Location: " + jobPosting[2] + "\n" +
                "Position Type: " + jobPosting[3] + "\n" +
                "Core Competency: " + jobPosting[4] + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    // GETTERS AND SETTERS


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
