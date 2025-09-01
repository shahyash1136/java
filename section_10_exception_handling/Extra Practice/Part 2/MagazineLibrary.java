import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        return new Magazine(this.magazines.get(index));
    }

    public void setMagazine(Magazine magazines, int index) {
        this.magazines.set(index, new Magazine(magazines));
    }

    public void addMagazine(Magazine newMagazine) {
        this.magazines.add(new Magazine(newMagazine));
    }

}
