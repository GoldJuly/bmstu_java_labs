import java.util.Objects;

public class Key {
    private boolean isTuned;
    private boolean isPressed;

    public Key() {
        this.isTuned = false;
        this.isPressed = false;
    }

    public void setTuned(boolean isTuned) {
        this.isTuned = isTuned;
    }

    public void play() {
        if (isTuned) {
            System.out.println("Key is playing...");
        } else {
            System.out.println("Key is not tuned, cannot play.");
        }
    }

    public void press() {
        System.out.println("Key is pressed.");
        this.isPressed = true;
    }


    @Override
    public String toString() {
        return "Key{" +
                "isTuned=" + isTuned +
                ", isPressed=" + isPressed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return isTuned == key.isTuned && isPressed == key.isPressed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTuned, isPressed);
    }
}
