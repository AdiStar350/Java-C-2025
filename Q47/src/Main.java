public class Main {
    /**
     * Displays information about each phone in the array.
     * 
     * @param arr the array of phones
     */
    public static void displayInfo(Phone[] arr) {
        for (Phone p : arr) {
            System.out.println(p.toString() + "\n");
        }
    }

    /**
     * Finds the most common operating system among the phones in the array.
     * 
     * @param arr the array of phones
     * @return the name of the most common operating system
     */
    public static String getMaxOS(Phone[] arr) {
        String maxOS = "";
        int maxCnt = 0;

        for (Phone p1 : arr) {
            String currentOS = p1.getOs().getName();
            int cnt = 0;

            for (Phone p2 : arr) {
                if (currentOS.equals(p2.getOs().getName())) {
                    cnt++;
                }
            }

            if (cnt >= maxCnt) {
                maxOS = currentOS;
                maxCnt = cnt;
            }
        }

        return maxOS;
    }

    /**
     * Finds the phone with the maximum storage capacity in the array.
     * 
     * @param arr the array of phones
     * @return the phone with the maximum storage capacity
     */
    public static Phone getMaxStorage(Phone[] arr) {
        Phone maxPhone = new Phone();
        int maxStorage = 0;

        for (Phone p : arr) {
            if (p.getStorage() >= maxStorage) {
                maxPhone = p;
                maxStorage = p.getStorage();
            }
        }

        return maxPhone;
    }

    public static void main(String[] args) {
        Phone[] arr = {
            new Phone("Apple", 256, new OS("IOS", "17.6")),
            new Phone("Samsung", 512, new OS("Android", "19.3")),
            new Phone("Sony", 128, new OS("Android", "15.8")),
            new Phone("Google", 64, new OS("Android", "15.8")),
            new Phone("Apple", 1000, new OS("IOS", "18.1"))
        };

        displayInfo(arr);

        System.out.println(getMaxOS(arr));

        System.out.println(getMaxStorage(arr));
    }
}
