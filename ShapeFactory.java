public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;

    private static final int MAX_PER_SHAPE = 2;
    private static final int MAX_TOTAL_SHAPES = 5;
    private static int totalCount = 0;
    private static int circleCount = 0;
    private static int rectangleCount = 0;
    private static int squareCount = 0;

    public static Shape getShape(int type) {
        if (totalCount >= MAX_TOTAL_SHAPES) {
            System.out.println("---Total Limit---");
            return null;
        }
    switch (type) {
        case TYPE_CIRCLE:
            if(circleCount < MAX_PER_SHAPE) {
                circleCount++;
                totalCount++;
                return new Circle();
            }else{
                System.out.println("---Circle Limit---");
                return null;
            }
        case TYPE_RECTANGLE:
            if(rectangleCount < MAX_PER_SHAPE) {
                rectangleCount++;
                totalCount++;
                return new Rectangle();
            }else{
                System.out.println("---Rectangle Limit---");
                return null;
            }
        case TYPE_SQUARE:
            if(squareCount < MAX_PER_SHAPE) {
                squareCount++;
                totalCount++;
                return new Square();
            }else{
                System.out.println("---Square Limit---");
                return null;
        }
        default:
            return null;
        }
    }
}