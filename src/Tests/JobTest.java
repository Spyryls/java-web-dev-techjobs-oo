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

        test_job1 = new Job("Brewer Friend", new Employer("Frank n' Steins"), new Location("St. Louis"), new PositionType("Kitchen"), new CoreCompetency("Salty Attitude"));
        test_job2 = new Job("Painter Guy", new Employer("Paint Ninja Painting"), new Location("St. Louis"), new PositionType("Muralist"), new CoreCompetency("Hiding EasterEggs"));
        test_job3 = new Job("Painter Guy", new Employer("Paint Ninja Painting"), new Location("St. Louis"), new PositionType("Muralist"), new CoreCompetency("Hiding EasterEggs"));
    }

    @Test // test that ids are different
    public void testSettingJobId() {
        assertTrue(test_job1.getId() != test_job2.getId());
//        System.out.println(test_job1.getId());
//        System.out.println(test_job2.getId());
    }

    @Test // test that each field is present
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job1.getName().contains("Brewer Friend"));
        assertTrue(test_job2.getEmployer() instanceof Employer);
        assertTrue(test_job2.getLocation() instanceof Location);
        assertTrue(test_job1.getPositionType() instanceof PositionType);
        assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test // test that two similar jobs have different ids
    public void testJobsEquality() {
        assertFalse(test_job2.equals(test_job3));
    }

    @Test // test that the posting has all job elements and that blank lines separate them
    public void testSpacingBetweenJobElements() {
        String pGuy = test_job2.toString();
        assertTrue(pGuy.contains("Name: Painter Guy\n"));
        assertTrue(pGuy.contains("Employer: Paint Ninja Painting\n"));
        assertTrue(pGuy.contains("Location: St. Louis\n"));
        assertTrue(pGuy.contains("Position Type: Muralist\n"));
        assertTrue(pGuy.contains("Core Competency: Hiding EasterEggs\n"));
    }

}
