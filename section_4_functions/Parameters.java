public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.5);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.2);
    }

    public static void calculateArea(double lenght, double width) {
        System.out.println("Area: " + (lenght * width));
    }
}
