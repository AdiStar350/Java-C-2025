public class Main {

    /**
     * Generates 4 random engines and adds them to the specified plane.
     * 
     * @param p the plane to which engines will be added
     */
    public static void gen4RandEngines(Plane p) {
        while (p.getNumOfEngines() < 4) {
            p.addEngine(new Engine((int) (Math.random() * 1000) + 1, (int) (Math.random() * 2) + 2000));
        }
    }

    /**
     * Adds engines to all planes in the specified array.
     * 
     * @param arr the array of planes
     */
    public static void addEnginesToAllPlanes(Plane[] arr) {
        for (Plane p : arr) {
            gen4RandEngines(p);
        }
    }

    /**
     * Displays information of all planes in the specified array.
     * 
     * @param arr the array of planes
     */
    public static void displayInfo(Plane[] arr) {
        for (Plane p : arr) {
            System.out.println(p.toString() + "\n");
        }
    }

    /**
     * Gets the numbers of all engines in the specified array of planes.
     * 
     * @param arr the array of planes
     * @return an array of engine numbers
     */
    public static int[] getAllEngNum(Plane[] arr) {
        int[] engNumArr = new int[arr.length * 4];
        int index = 0;

        for (Plane p : arr) {
            for (Engine e : p.getEngines()) {
                engNumArr[index++] = e.getNumber();
            }
        }

        return engNumArr;
    }

    /**
     * Checks if there are any duplicate engine numbers in the specified array of planes.
     * 
     * @param arr the array of planes
     * @return true if there are duplicate engine numbers, false otherwise
     */
    public static boolean isSameEngineNum(Plane[] arr) {
        int[] engNumArr = getAllEngNum(arr);

        for (int i = 0; i < engNumArr.length; i++) {
            for (int j = i + 1; j < engNumArr.length; j++) {
                if (engNumArr[i] == engNumArr[j]) {
                    return true;
                }
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        Plane[] planesArr = {
            new Plane("Boeing", "747"),
            new Plane("Airbus", "A380"),
            new Plane("Cessna", "172"),
            new Plane("Gulfstream", " G650"),
            new Plane("Concorde", "T720")
        };

        addEnginesToAllPlanes(planesArr);

        displayInfo(planesArr);

        System.out.println(isSameEngineNum(planesArr));
    }
}
