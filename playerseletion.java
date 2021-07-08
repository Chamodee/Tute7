import java.util.*;

public class playerseletion {

    public static void main(String[] args) {

        String decision =" ";
        String[] player = new String[11];

        for (int x = 0; x < 11; x++) {
            player[x] = "empty";
        }

        Scanner input = new Scanner(System.in);
        System.out.println("add a player enter A");
        System.out.println("view a player enter V");
        System.out.println("exit the program EXT");
        System.out.println("Enter number code or letter code");

        decision = input.nextLine();

        while (!decision.equals("EXT")) {


            if (decision.equals("A")) {
                add(player);

            } else if (decision.equals("V")) {
                view(player);


            } else if (decision.equals("EXT")) {
                System.out.println("Exit program ...............");
                break;

            } else {
                System.out.println("please enter the right number code or letter code");

            }
            System.out.println("Enter number code or letter code");

            decision = input.nextLine();
        }
    }
    public static void add(String booth[]) {
        Scanner input = new Scanner(System.in);

        int playernum = 0;
        String aa = "";
        String bb = "";
        String cc = "";
        String dd = "";
        String ss = "  ";

        while (playernum < 6) {
            System.out.println("Enter booth number between (0-11) else type any number to exit ");
            playernum = input.nextInt();

            if (playernum < 6) {

                if (booth[playernum].equals("empty")) {
                    input.nextLine();

                    System.out.println("enter name of player no." + playernum + " of player");
                    aa = input.nextLine();

                    System.out.println("enter age of player no." + playernum + " of player");
                    bb = input.nextLine();

                    System.out.println("enter type of player no." + playernum + " of player");
                    cc = input.nextLine();

                    System.out.println("enter statistics of player no." + playernum + " of player");
                    dd = input.nextLine();

                    booth[playernum] = aa + ss + bb + ss + cc + ss + dd;

                }
            }
            System.out.println("process finished");

        }
    }
    public static void view(String player[]){
        int x = 0 ;
        while(x < 11){
            System.out.println("player" + x + " is "+ player[x] +" for now");
            x++;
        }
    }
    

}