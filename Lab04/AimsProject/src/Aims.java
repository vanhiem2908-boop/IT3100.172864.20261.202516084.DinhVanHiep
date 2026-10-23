
public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King", "Animation",
                "Roger Allers", 87, 19.95);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars", "Science Fiction",
                "George Lucas", 124, 24.95);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladin", "Animation",
                "Ron Clements", 90, 18.99);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("\nCart after adding DVDs:");
        cart.printCart();

        cart.removeDigitalVideoDisc(dvd2);

        System.out.println("\nCart after removing Star Wars:");
        cart.printCart();
    }
}
