package lesson3;

public class Competition {

    public static void main(String[] args) {
        int[] teamA = {2, 3, 4, 7, 1};
        int[] teamB = {1, 3, 5, 6, 1};

        int winsOfTeamA = 0;
        int winsOfTeamB = 0;
        for (int i = 0; i <teamA.length; i++) {
            int i1 = teamA[i] > teamB[i] ? winsOfTeamA++ : winsOfTeamB++;
        }

        System.out.println((winsOfTeamA > winsOfTeamB) ? "Winner is Team A" : "Winner is Team B");

    }
}
