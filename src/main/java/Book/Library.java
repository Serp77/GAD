package Book;

import Product.Product;

public class Library {
    public static void main(String[] args) {
        Book dog = new Book("Dog", 50);
        Book cat = new Book("Cat", 40);
        Book maus = new Book("Maus", 20);
        Book code = new Book("Clean code", 30);

        Book[] bk = new Book[4];

        bk[0] = dog;
        bk[1] = cat;
        bk[2] = maus;
        bk[3] = code;

        for (int index = 0; index < bk.length; index++) {
            Book b = bk[index];
            System.out.println(b.getName() + " - " + b.getCount());
        }
        System.out.println("Replace 0 and 3.");
        Book temp = bk[0];
        bk[0] = bk[3];
        bk[3] = temp;
        for (int index = 0; index < bk.length; index++) {
            Book b = bk[index];
            System.out.println(b.getName() + " - " + b.getCount());
        }
        System.out.println("Shown only Clean code");
        for (int index = 0; index < bk.length; index++) {
            Book b = bk[index];
            if (b.getCount() == 30) {
                System.out.println(b.getName() + " - " + b.getCount());
            }
        }
    }
}
