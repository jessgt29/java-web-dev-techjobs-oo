package org.launchcode.techjobs_oo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private Location coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, Location coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

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

    public Location getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(Location coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){
        if (name == null && employer == null && location == null && positionType == null && coreCompetency == null){
            return "OOPS! This job does not seem to exist.";
        }
        else {
            HashMap<String, Object> displayJob = new HashMap<>();
            displayJob.put("Name: ", name);
            displayJob.put("Employer: ", employer);
            displayJob.put("Location: ", location);
            displayJob.put("Position Type: ", positionType);
            displayJob.put("Core Competency: ", coreCompetency);

            String result = "\nID: " + id;
            for (Map.Entry<String, Object> properties : displayJob.entrySet())
            {
                result += "\n" + properties.getKey();
                if(properties.getValue().toString() == ""){ //used toString because value was Object type;
                    result += "Data not available";
                }else{
                    result += properties.getValue();
                }
            }
            result += "\n";
            return result;
        }
    }
}
