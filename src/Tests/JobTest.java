package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;

    @Before
    public void createJobObjects() {

        test_job1 = new Job("Braut Griller", new Employer("Frank n' Steins"), new Location("St. Louis"), new PositionType("Kitchen"), new CoreCompetency("Salty Attitude"));
        test_job2 = new Job("Painter Guy", new Employer("Paint Ninja Painting"), new Location("St. Louis"), new PositionType("Muralist"), new CoreCompetency("Hiding EasterEggs"));
        test_job3 = new Job("Painter Guy", new Employer("Paint Ninja Painting"), new Location("St. Louis"), new PositionType("Muralist"), new CoreCompetency("Hiding EasterEggs"));
    }

    @Test
    public void testSettingJobId() {
        assertTrue(test_job1.getId() != test_job2.getId());
        System.out.println(test_job1.getId());
        System.out.println(test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job1.getId() == 1);
        assertTrue(test_job1.getName().equals("Braut Griller"));
        if (test_job2.getEmployer() instanceof Employer);
        if (test_job2.getLocation() instanceof Location);
        if (test_job1.getPositionType() instanceof PositionType);
        if (test_job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsEquality() {
        assertFalse(test_job2.equals(test_job3));
}

}
