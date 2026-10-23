
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc[] itemsOrdered;
    private int qtyOrdered;

    public Cart() {
        itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        qtyOrdered = 0;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Invalid DVD.");
            return;
        }

        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        if (dvdList == null) {
            return;
        }

        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    public void addDigitalVideoDisc(
            DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }

                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;

                System.out.println("The disc has been removed.");
                return;
            }
        }

        System.out.println("The disc was not found in the cart.");
    }

    public double totalCost() {
        double total = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }

        return total;
    }

    public void printCart() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%d. %s - %.2f%n",
                    i + 1,
                    itemsOrdered[i].getTitle(),
                    itemsOrdered[i].getCost());
        }

        System.out.printf("Total Cost is: %.2f%n", totalCost());
    }
}

