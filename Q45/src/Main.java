public class Main {
    /**
     * Simulates a battle between two players.
     * 
     * @param p1 the first player
     * @param p2 the second player
     * @return the player who wins the battle
     */
    public static Player battle(Player p1, Player p2) {
        // Loop until one of the players' health points drop to 0 or below
        while (p1.getHp() > 0 && p2.getHp() > 0) {
            // Player 1 attacks Player 2
            System.out.format("%s used %s\n", p1.getName(), p1.getFinisher());
            p2.setHp(p1.getHp() - 50);
            System.out.format("\n%s health ==> %dhp\n", p2.getName(), p2.getHp());

            // Player 2 attacks Player 1
            System.out.format("%s used %s\n", p2.getName(), p2.getFinisher());
            p1.setHp(p1.getHp() - 50);
            System.out.format("\n%s health ==> %dhp\n", p1.getName(), p1.getHp());
        }

        // Return the player with the higher health points
        return p1.getHp() >= p2.getHp() ? p1 : p2;
    }

    /**
     * Simulates battles between pairs of players in an array.
     * 
     * @param arr the array of players
     */
    public static void battleArr(Player[] arr) {
        // Array to keep track of the number of battles each player has participated in
        int[] count = new int[arr.length];
        int index1, index2;
        int times = (int) arr.length / 2;

        // Loop to simulate battles
        for (int i = 0; i < times; i++) {
            // Select the first player for the battle
            do { 
                index1 = (int) (Math.random() * arr.length);
            } while (count[index1] != 0);

            count[index1]++;

            // Select the second player for the battle
            do { 
                index2 = (int) (Math.random() * arr.length);
            } while (count[index2] != 0);

            count[index2]++;

            // Simulate the battle and print the result
            System.out.println(battle(arr[index1], arr[index2]));
        }
    }

    /**
     * Finds the player with the maximum health points in an array.
     * 
     * @param arr the array of players
     * @return the player with the maximum health points
     */
    public static Player getMaxHP(Player[] arr) {
        // Initialize the player with the maximum health points
        Player maxP = arr[0];
        int maxHP = arr[0].getHp();

        // Loop through the array to find the player with the maximum health points
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getHp() >= maxHP) {
                maxHP = arr[i].getHp();
                maxP = arr[i];
            }
        }

        return maxP;
    }

    public static void main(String[] args) {
        // Initialize an array of players
        Player[] players = {
            new Player("Joe Biden", 'M', "kid touching, dementia", "confusion attack", 80),
            new Player("Elon Musk", 'M', "summon robot army, spaceX missile attack", "mind control chip", 250),
            new Player("P Diddy", 'M', "race card, sex trafficking, 70 dildos", "1000 bottles of baby oil", 150),
            new Player("Kobe Bryant", 'M', "super jump, basketball to the face", "helicopter crash", 50),
            new Player("Karen", 'F', "second amendment, crying and yelling for no reason, calling the police", "assault charges", 100),
            new Player("Donald Trump", 'M', "racism, being super orange, being dumb", "nuclear war", 500)
        };

        // Simulate battles between the players
        battleArr(players);
    }
}
