package udemy;

public class Ceiling {
    private final int width;
    private final int length;
    private String color;

    public Ceiling(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }
}
