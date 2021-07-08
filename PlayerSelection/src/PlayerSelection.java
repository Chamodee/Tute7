import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {

    ArrayList<String> Players = new ArrayList<String>();

    public PlayerSelection(){}

    public void addPlayer(){

    }

    public void viewPlayers(){
    }

    void displayTwoBestBatmans(){

    }

    void displayTwoBestBowlers(){}

    void displayBestKeeper(){}

    public static void main(String[] args) {

        PlayerSelection a= new PlayerSelection();


        for(;;){
            System.out.println("");
            System.out.println("Enter an 'A' to Add a player");
            System.out.println("Enter a 'V' to View all players");
            System.out.println("Enter a 'B' to Display two best batmans");
            System.out.println("Enter a 'C' to Display two best bowlers");
            System.out.println("Enter a 'D' to Display the best Keeper");
            System.out.println("");

            Scanner input=new Scanner(System.in);
            System.out.print("Enter the letter :");
            String x=input.nextLine();
            switch (x){
                case "A":
                case "a":
                    a.addPlayer();
                    continue;

                case "V":
                case "v":
                    a.viewPlayers();
                    continue;

                case "B":
                case "b":
                    a.displayTwoBestBatmans();
                    continue;

                case "C":
                case "c":
                    a.displayTwoBestBowlers();
                    continue;

                case "D":
                case "d":
                    a.displayBestKeeper();
                    continue;

                default:
                    System.out.println("Invalid!");
            }
        }

    }

}
