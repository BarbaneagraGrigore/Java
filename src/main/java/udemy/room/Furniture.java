package udemy.room;

public class Furniture {
    private final Chair chair;
    private Bed bed;

    public Furniture(Chair chair) {
        this.chair = chair;
    }

    public Furniture(Chair chair, Bed bed) {
        this.chair = chair;
        this.bed = bed;
    }

    public Bed getBed() {
        return bed;
    }
}
