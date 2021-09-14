package udemy.room;

public class Floor {
    private int length;
    private int width;
    private String color;

    public Floor(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public String getColor() {
        return color;
    }
}
