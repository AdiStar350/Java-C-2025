public class Main {
    /**
     * Finds and prints pairs of games that have at least 3 players and a combined price less than 200.
     *
     * @param arr the array of games to search through
     * @complexity O(n^2)
     */
    public static void giftForTwins(Game[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getNumPlayers() >= 3 && arr[j].getNumPlayers() >= 3 && arr[i].getPrice() + arr[j].getPrice() < 200) {
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                }
            }
        }
    }

    /**
     * Counts how many games in the array can be replaced by the specified game.
     *
     * @param arr the array of games to search through
     * @param myGame the game to compare with
     * @return the number of games that can be replaced by myGame
     * @complexity O(n)
     */
    public static int replace(Game[] arr, Game myGame) {
        int cnt = 0;

        for (Game g : arr) {
            if (myGame.canReplace(g)) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Game[] arr = {
            new Game("Game1", 8, 6, 25.5),
            new Game("Game2", 8, 4, 300.5),
            new Game("Game3", 8, 3, 10.5),
            new Game("Game4", 8, 8, 122.5)
        };

        Game myGame = new Game("Rep", 8, 4, 122.5);

        System.out.println(replace(arr, myGame));

        giftForTwins(arr);
    }
}
