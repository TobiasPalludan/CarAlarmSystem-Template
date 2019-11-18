import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarAlarmSystemTest {
    private ICarAlarmSystem cas;

    // --------------------- Setup and helper functions ---------------------

    /**
     * will setup a new CarAlarmSystem before each test is run.
     */
    @Before
    public void setUp() {
        cas = new CarAlarmSystem();
    }

    /**
     * Can be used to easily pass time.
     * @param ticksToPass The number of ticks that should be simulated.
     */
    private void passTime(int ticksToPass) {
        for (int i = 0; i < ticksToPass; i++) {
            cas.tick();
        }
    }

    /**
     * Helper function for triggering the alarm with minimal time passed.
     */
    private void triggerAlarm() {
        cas.lock();
        passTime(2);
        cas.open();
    }

    /**
     * Assumes the vehicle is opened, and checks the assumption.
     */
    private void assertOpened() {
        Assert.assertTrue(cas.opened());
        Assert.assertFalse(cas.closed());
    }

    /**
     * Assumes the vehicle is closed, and checks the assumption.
     */
    private void assertClosed() {
        Assert.assertFalse(cas.opened());
        Assert.assertTrue(cas.closed());
    }

    /**
     * Assumes the vehicle is locked, and checks the assumption.
     */
    private void assertLocked() {
        Assert.assertTrue(cas.locked());
        Assert.assertFalse(cas.unlocked());
    }

    /**
     * Assumes the vehicle is unlocked, and checks the assumption.
     */
    private void assertUnlocked() {
        Assert.assertFalse(cas.locked());
        Assert.assertTrue(cas.unlocked());
    }

    /**
     * Assumes the vehicle is sounding the alarm, and checks the assumption.
     */
    private void assertAlarm() {
        Assert.assertTrue(cas.flash());
        Assert.assertTrue(cas.sound());
    }

    /**
     * Assumes the vehicle is not sounding the alarm, and checks the assumption.
     */
    private void assertNoAlarm() {
        Assert.assertFalse(cas.flash());
        Assert.assertFalse(cas.sound());
    }

    /**
     * Assumes the vehicle is armed, and checks the assumption.
     */
    private void assertArmed() {
        Assert.assertTrue(cas.armed());
    }

    /**
     * Assumes the vehicle is not armed, and checks the assumption.
     */
    private void assertNotArmed() {
        Assert.assertFalse(cas.armed());
    }

    // --------------------- Tests ---------------------

    @Test
    public void testNoInput() {

        // Default states should be that the vehicle is closed, unlocked, not armed, and no alarm sounding.
        assertClosed();
        assertUnlocked();
        assertNotArmed();
        assertNoAlarm();
    }

    @Test
    public void testOpenDoor_Opens() {
        cas.open();

        // Due to the "competent programmer hypothesis" we shouldn't test for side-effects.
        assertOpened();
    }

}