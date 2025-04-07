package GuesserGame;

import java.util.Scanner;

class Guesser{
    int Guessernum;
    public int GuesserNumb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser guess a number: ");
        int Guessernum = sc.nextInt();
        return Guessernum;
    }
}

class Player{
    int Playernum;
    public int PlayerNumb(){
        Scanner sc = new Scanner(System.in);
        int Playernum = sc.nextInt();
        return Playernum;
    }
}

class Umpire{
    int guessernum;
    int playernum1;
    int playernum2;
    int playernum3;

    public void CollectNumFromGuesser(){
        Guesser Gu = new Guesser();
        guessernum=Gu.GuesserNumb();
    }

    public void CollectNiumFromPlayers(){
        System.out.println("Player 1 guess a number: ");
        Player player1 = new Player();
        playernum1 = player1.PlayerNumb();

        System.out.println("Player 2 guess a number: ");
        Player player2 = new Player();
        playernum2 = player2.PlayerNumb();

        System.out.println("Player 3 guess a number: ");
        Player player3 = new Player();
        playernum3 = player3.PlayerNumb();

    }

    public void Compare(){

        if(guessernum==playernum1){
            if(guessernum==playernum2 && guessernum==playernum3){
                System.out.println("All players won the game");
            } else if (guessernum==playernum2) {
                System.out.println("Player 1 and Player 2 won the game");
            } else if(guessernum==playernum3){
                System.out.println("Player 1 and Player 3 won the game");
            }else{
                System.out.println("player 1 won the game");
            }
        }
        else if(guessernum==playernum2){
            if(guessernum==playernum3){
                System.out.println("player 2 and Player 3 won the game");
            }else{
                System.out.println("Player 2 won the game");
            }
        }
        else if(guessernum==playernum3){
            System.out.println("Player 3 won the game");
        }
        else {
            System.out.println("All players lost the game");
        }
    }

}




public class MyGuesserGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.println("-----Game started-----");
            Umpire Um = new Umpire();
            Um.CollectNumFromGuesser();
            Um.CollectNiumFromPlayers();
            Um.Compare();
            System.out.println("-----Game over-----");
            System.out.println("Do you want to play again? (yes/no) ");
            ch = sc.nextLine().trim().toLowerCase();
        } while(ch.equals("yes"));
            System.out.println("Thanks for playing !");

    }
}
