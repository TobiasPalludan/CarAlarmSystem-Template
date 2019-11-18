public class CarAlarmSystem implements ICarAlarmSystem {
    private boolean opened = false;
    private boolean closed = true;
    private boolean locked = false;
    private boolean unlocked = true;
    private boolean flash = false;
    private boolean sound = false;
    private boolean armed = false;

    @Override
    public boolean opened() {
        return opened;
    }

    @Override
    public boolean closed() {
        return closed;
    }

    @Override
    public boolean locked() {
        return locked;
    }

    @Override
    public boolean unlocked() {
        return unlocked;
    }

    @Override
    public boolean flash() {
        return flash;
    }

    @Override
    public boolean sound() {
        return sound;
    }

    @Override
    public boolean armed() {
        return armed;
    }

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public void close() {

    }

    @Override
    public void open() {

    }

    @Override
    public void tick() {

    }
}
