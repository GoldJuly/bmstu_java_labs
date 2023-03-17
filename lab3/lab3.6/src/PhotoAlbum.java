import java.util.ArrayList;
import java.util.Objects;

public class PhotoAlbum {
    private String albumName;
    private ArrayList<Photo> photos;

    public PhotoAlbum(String albumName) {
        this.albumName = albumName;
        this.photos = new ArrayList<>();
    }

    public void setPhotoName(int index, String photoName) {
        this.photos.get(index).setName(photoName);
    }

    public void addPhoto(Photo photo) {
        this.photos.add(photo);
    }

    public void printNumPhotos() {
        System.out.println("The number of photos in the album \"" + this.albumName + "\" is " + this.photos.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoAlbum that = (PhotoAlbum) o;
        return Objects.equals(albumName, that.albumName) && Objects.equals(photos, that.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumName, photos);
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" +
                "albumName='" + albumName + '\'' +
                ", photos=" + photos +
                '}';
    }
}