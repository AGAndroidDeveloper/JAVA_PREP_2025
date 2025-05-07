public class Wall {
    double width;
    double height;

    public Wall() {
        System.out.println("empty constructor called");
    }

    public Wall(double width, double height) {
        if (width < 0) this.width = 0;
        else this.width = width;
        if (height < 0) this.height = 0;
        else this.height = height;
        System.out.println("constructor called");
    }

    public void setHeight(double height) {
        if (height < 0) this.height = 0;
        else this.height = height;
    }

    public void setWidth(double width) {
        if (width < 0) this.width = 0;
        else this.width = width;
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double getArea() {
        return width * height;
    }
}
