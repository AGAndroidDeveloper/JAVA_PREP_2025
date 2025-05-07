public class Floor {
    private double width = 0;
    private double length = 0;

    public Floor(double width, double length) {
        if (width > 0) this.width = width;
        if (length > 0) this.length = length;
    }

    public double getArea() {
        return width * length;
    }


}
