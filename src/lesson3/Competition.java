package lesson3;

public class Competition {

    public static void main(String[] args) {
        int[] teamA = {2, 3, 4, 7, 1};
        int[] teamB = {1, 3, 5, 6, 1};

        int winsOfteamA = 0;
        int winsOfteamB = 0;
        for (int i = 0; i <teamA.length; i++) {
            if (teamA[i] > teamB[i]) {
                winsOfteamA++;
            } else {
                winsOfteamB++;
            }
        }

        if (winsOfteamA > winsOfteamB) {
            System.out.println("Winner is team A");
        } else {
            System.out.println("Winner is team B");
        }
    }
}
