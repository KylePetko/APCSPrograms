public class FlexArrayDriver{

    public static void main(String[] args) {
        FlexArrayPrimitive test = new FlexArrayPrimitive( 90);

        FlexArrayRectangle rectangle = new FlexArrayRectangle();




        rectangle.append(new Rectangle(1,3));
        rectangle.append(new Rectangle(6,9));
        rectangle.append(new Rectangle(1,3));

        System.out.println(rectangle.toString());
        System.out.println(test.toString());






    }
}
