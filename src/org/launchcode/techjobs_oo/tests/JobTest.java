package org.launchcode.techjobs_oo.tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    private Job aJob;
    private Job anotherJob;
    private Job aCompleteJob;
    private Job aJobInBrazil;
    private Job sameJobInBrazil;

    @Before
    public void createJobs() {
        aJob = new Job();
        anotherJob = new Job();
        aCompleteJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        aJobInBrazil = new Job("Front End Developer", new Employer("Vale"), new Location("São Paulo"), new PositionType("Software developer"), new CoreCompetency("SpringBoot must rock!"));
        sameJobInBrazil = new Job("Front End Developer", new Employer("Vale"), new Location("São Paulo"), new PositionType("Software developer"), new CoreCompetency("SpringBoot must rock!"));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(aJob.getId(), anotherJob.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(aCompleteJob instanceof Job);
        assertEquals("Product tester", aCompleteJob.getName());
        assertEquals("ACME", aCompleteJob.getEmployer().getValue());
        assertEquals("Desert", aCompleteJob.getLocation().getValue());
        assertEquals("Quality control", aCompleteJob.getPositionType().getValue());
        assertEquals("Persistence", aCompleteJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(aJobInBrazil.equals(sameJobInBrazil));
    }

    






}