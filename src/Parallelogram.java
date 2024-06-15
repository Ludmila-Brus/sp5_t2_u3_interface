public abstract class Parallelogram implements Figure {

    private final double height; // высота
    private final double width; // ширина

    public Parallelogram(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // класс будет содержать только обычный метод
    // для нахождения площади
    @Override
    public double getArea() { //
        return height * width;
    }
}