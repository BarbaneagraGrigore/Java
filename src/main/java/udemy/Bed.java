package udemy;

public class Bed {
    private final String type;
    private final String model;
    private final Dimensions dimensions;

    public Bed(String type, String model, Dimensions dimensions) {
        this.type = type;
        this.model = model;
        this.dimensions = dimensions;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void make(){
        System.out.println("Making bed");
    }
}
