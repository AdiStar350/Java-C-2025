public class Main {
    public static void playingOrFighting(Pet p1, Pet p2) {
        if (p1.getType().equals(p2.getType())) {
            System.out.format("%s and %s are playing.\n", p1.getName(), p2.getName());
        } else {
            System.out.format("%s and %s are fighting.\n", p1.getName(), p2.getName());
        }
    }

    public static float getVaccinatedPercentage(Pet[] arr) {
        float cnt = 0f;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isVaccinated()) {
                cnt++;
            }
        }

        return (cnt / arr.length) * 100;
    }

    public static void isVaccineNeeded(Pet[] arr) {
        if (getVaccinatedPercentage(arr) < 50f) {
            for (int i = 0; i < arr.length; i++) {
                arr[i].vaccinate();
            }
        }
    }


    public static void main(String[] args) {
        Pet[] arr = {
            new Pet("dog", "Zoe", 2021, true),
            new Pet("dog", "Evie", 2022, false),
            new Pet("cat", "Ollie", 2023, false),
            new Pet("cat", "Maple", 2023, true),
            new Pet("rabbit", "Bob", 1999, false),
            new Pet("rabbit", "Steve", 2024, false)
        };

        playingOrFighting(arr[0], arr[1]);

        isVaccineNeeded(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
