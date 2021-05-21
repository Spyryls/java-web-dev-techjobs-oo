package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;

    @Before
    public void createJobObjects() {

        test_job1 = new Job("Brewer Friend", new Employer("Frank n' Steins"), new Location("St. Louis"), new PositionType("Kitchen"), new CoreCompetency("Salty Attitude"));
        test_job2 = new Job("Painter Guy", new Employer("Paint Ninja Painting"), new Location("St. Louis"), new PositionType("Muralist"), new CoreCompetency("Hiding EasterEggs"));
        test_job3 = new Job("Painter Guy", new Employer("Paint Ninja Painting"), new Location("St. Louis"), new PositionType("Muralist"), new CoreCompetency("Hiding EasterEggs"));
        test_job4 = new Job("A Good, Good Dog", new Employer(""), new Location("St. Louis"), new PositionType("Animal Companion"), new CoreCompetency("Being a gud, widdle, wovey, boogie-boo!"));
    }

    @Test // test that ids are different
    public void testSettingJobId() {
        assertTrue(test_job1.getId() != test_job2.getId());
    }

    @Test // test that each field is present
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job1.getName().contains("Brewer Friend"));
        assertEquals("Paint Ninja Painting", test_job2.getEmployer().getValue());
        assertNotNull(test_job2.getLocation());
        assertNotNull(test_job1.getPositionType());
        assertNotNull(test_job1.getCoreCompetency());
    }

    @Test // test that two similar jobs have different ids
    public void testJobsEquality() {
        assertNotEquals(test_job2, test_job3);
        assertNotEquals(test_job2, test_job3);
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

    @Test
    public void testEmptyJobField() {
        assertTrue(test_job4.getEmployer().toString().contains("Data Not Available"));
    }

}
