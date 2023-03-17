public class Photo {
    private String name;

    public Photo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Photo)) {
            return false;
        }
        Photo other = (Photo) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "name='" + name + '\'' +
                '}';
    }
}