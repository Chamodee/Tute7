import java.util.Scanner;
public class Player {
    private String player_name;
    private int player_age;
    private String player_type;
    private String player_statistics;

    public Player(String player_name, int player_age, String player_type,String player_statistics){
        this.player_name=player_name;
        this.player_age=player_age;
        this.player_type=player_type;
        this.player_statistics=player_statistics;
    }

    Scanner input=new Scanner(System.in);

    public void battingAverage(){
        System.out.println("Enter the bating average of"+player_name+":");
        double avg_bating=input.nextDouble();
    }

    public void bowlingAverage(){
        System.out.println("Enter the bowling average of"+player_name+":");
        double avg_bowl=input.nextDouble();
    }

    public void playerDetails(){

        System.out.println("Player's name: "+player_name);
        System.out.println("Player's age: "+player_age);
        System.out.println("Player's type: "+player_type);

    }

    public void bestPerformance(){
        System.out.println(player_name+"has the best performance in the past 15 matches ");
    }

    public void playerType(){
        System.out.println("Select player type");
        System.out.println("1. Spin bowler");
        System.out.println("2. Seam bowler");
        System.out.println("3. Batsman");
    }

}










