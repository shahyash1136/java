public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        /*
         * nissan.make = "Nissan";
         * nissan.price = 10000;
         * nissan.year = 2020;
         * nissan.color = "Green";
         */

        Car nissan2 = new Car(nissan);

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        Car dodge = new Car("Dodge", 11000, 2019, "Blue");
        /*
         * dodge.make = "Dodge";
         * dodge.price = 11000;
         * dodge.year = 2019;
         * 
         * 
         * 
         * 
         * * nissan.setColor("Jet Blac
         * 
         * 
         * nissan.setPrice(nissan.getPrice() / 2
         * ;
         * dodge.setPrice(dodge.getPrice() / 2);
         */

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
                ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
                ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
    }
}