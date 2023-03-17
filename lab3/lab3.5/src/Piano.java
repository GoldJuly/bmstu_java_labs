import java.util.Arrays;
import java.util.Objects;

public class Piano {
    private String brand;
    private int numKeys;
    private Key[] keys;

    public Piano(String brand, int numKeys) {
        this.brand = brand;
        this.numKeys = numKeys;
        this.keys = new Key[numKeys];
        for (int i = 0; i < numKeys; i++) {
            this.keys[i] = new Key();
        }
    }

    public void tune() {
        System.out.println("Tuning " + this.brand + " piano...");
        for (Key key : keys) {
            key.setTuned(true);
        }
    }

    public void play() {
        System.out.println("Playing " + this.brand + " piano...");
        for (Key key : keys) {
            key.play();
        }
    }

    public void pressKey(int keyNum) {
        System.out.println("Pressing key " + keyNum + " on " + this.brand + " piano...");
        keys[keyNum].press();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piano piano = (Piano) o;
        return numKeys == piano.numKeys && Objects.equals(brand, piano.brand) && Arrays.equals(keys, piano.keys);
    }

    @Override
    public String toString() {
        return "Piano{" +
                "brand='" + brand + '\'' +
                ", numKeys=" + numKeys +
                ", keys=" + Arrays.toString(keys) +
                '}';
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(brand, numKeys);
        result = 31 * result + Arrays.hashCode(keys);
        return result;
    }
}