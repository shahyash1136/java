public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        printArea(2.3, 3.6, area1);
        String englishExplanaation = explainArea("English");
        System.out.println(englishExplanaation);

    }

    public static double calculateArea(double lenght, double width) {
        if (lenght < 0 || width < 0) {
            System.out.println("Invalid dimension");
            System.exit(0);
        }
        double area = lenght * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
                return "Language not availabe";
        }

    }

    public static void printArea(double lenght, double width, double area) {
        System.out.println(
                "A rectange with a length of " + lenght + " and a width of " + width + " has an area of " + area);
    }

}

/*
 * English "Area equals length * width"
 * 
 * French "La surface est egale a la longueur * la largeur"
 * 
 * Spanish "area es igual a largo * ancho"
 */