package GuesserGame;

import java.util.Scanner;

class Guesser {
    int GuesserNum;

    public int GuesserNumb() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser, kindly guess a number:");
        GuesserNum = scan.nextInt();
        return GuesserNum;
    }
}

class Player {
    int PlayerNum;

    public int PlayerNumb() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player, kindly guess a number:");
        PlayerNum = scan.nextInt();
        return PlayerNum;
    }
}

class Umpire {
    int Guessernum;
    int Playernum1, Playernum2, Playernum3;

    public void CollectNumFromGuesser() {
        Guesser gu = new Guesser();
        Guessernum = gu.GuesserNumb();
    }

    public void CollectNumFromPlayers() {
        Scanner scan = new Scanner(System.in);
        Playernum1 = new Player().PlayerNumb();
        Playernum2 = new Player().PlayerNumb();
        Playernum3 = new Player().PlayerNumb();
        scan.close();
    }

    public void Compare() {
        if (Guessernum == Playernum1 && Guessernum == Playernum2 && Guessernum == Playernum3) {
            System.out.println("All players won the game!");
        } else if (Guessernum == Playernum1 && Guessernum == Playernum2) {
            System.out.println("Player 1 and Player 2 won the game!");
        } else if (Guessernum == Playernum1 && Guessernum == Playernum3) {
            System.out.println("Player 1 and Player 3 won the game!");
        } else if (Guessernum == Playernum2 && Guessernum == Playernum3) {
            System.out.println("Player 2 and Player 3 won the game!");
        } else if (Guessernum == Playernum1) {
            System.out.println("Only Player 1 won the game!");
        } else if (Guessernum == Playernum2) {
            System.out.println("Only Player 2 won the game!");
        } else if (Guessernum == Playernum3) {
            System.out.println("Only Player 3 won the game!");
        } else {
            System.out.println("No one won the game.");
        }
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("---------Game Started---------");
        Umpire umpire = new Umpire();
        umpire.CollectNumFromGuesser();
        umpire.CollectNumFromPlayers();
        umpire.Compare();
        System.out.println("----------Game Over----------");
    }
}
