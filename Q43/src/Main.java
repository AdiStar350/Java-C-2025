public class Main {
    public static boolean updatePriceByTax(Smartphone s) {
        if (!s.isTaxForSmartphone()) {
            s.setPrice(s.getPrice() * (1 + s.getRad() / 100));
            s.setIsTaxed(true);
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        // Create a default smartphone
        Smartphone s1 = new Smartphone();
        
        // Create a smartphone with specified values
        Smartphone s2 = new Smartphone("Apple", "13", "bluetooth, wifi, nfc", 1.1f, 2000.0f);

        // Apply tax to the second smartphone
        s2.isTaxForSmartphone();

        // Print the details of both smartphones
        System.out.println(s1);
        System.out.println();
        System.out.println(s2);

        // Check if the second smartphone is already taxed and print the appropriate message
        if (s2.isTaxForSmartphone()) {
            System.out.println("Updated!");
        } else {
            System.out.println("Already updated!");
        }

        if (updatePriceByTax(s2)) {
            System.out.println("Updated!");
        } else {
            System.out.println("Already updated!");
        }
    }
}
