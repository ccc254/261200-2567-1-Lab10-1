public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (shape1 != null) {shape1.draw();}
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (shape2 != null) {shape2.draw();}
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (shape3 != null) {shape3.draw();}
        Shape shape0 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        if (shape0 != null) {shape0.draw();}
        Shape shape4 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        if (shape4 != null) {shape4.draw();}
        Shape shape5 = ShapeFactory.getShape(ShapeFactory.TYPE_RECTANGLE);
        if (shape5 != null) {shape5.draw();}
        Shape shape6 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        if (shape6 != null) {shape6.draw();}
        Shape shape7 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        if (shape7 != null) {shape7.draw();}
        Shape shape8 = ShapeFactory.getShape(ShapeFactory.TYPE_SQUARE);
        if (shape8 != null) {shape8.draw();}
    }
}
