import java.util.Scanner;
class Guesser{
    private int gnum;
    int guessNum(int low,int high){
        System.out.println("Guesser Please guess a number between"+low+" to "+high +":");
        Scanner sc=new Scanner(System.in);
        gnum=sc.nextInt();
        if(gnum>=low && gnum<=high){
        return gnum;
    }
        else{
            System.out.println("Please guess a valid number within the range specified");
            return guessNum(low,high);
        }

    }
}
class Player{
    private int pnum;
    int predictNum(int low,int high){
        System.out.println("Player predict a number between"+low+" to "+high +":");
        Scanner sc=new Scanner(System.in);
        pnum=sc.nextInt();
        if(pnum>=low && pnum<=high){
        return pnum;
    }
        else{
            System.out.println("Please predict a valid number within the range specified");
            return predictNum(low,high);
        }
    }
}
class Umpire{
    private int numfromGuesser;
    private int numfromPlayer1;
    private int numfromPlayer2;
    private int numfromPlayer3;
    void collectnumfromGuesser(){
        Guesser g=new Guesser();
        numfromGuesser=g.guessNum(1,100);
    }
    void collectnumfromPlayers(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numfromPlayer1=p1.predictNum(1,100);
        numfromPlayer2=p2.predictNum(1,100);
        numfromPlayer3=p3.predictNum(1,100);
    }
    void compare(){
        if(numfromGuesser==numfromPlayer1 && numfromGuesser==numfromPlayer2 && numfromGuesser==numfromPlayer3){
        System.out.println("All three Players Guessed correctly.");
        System.exit(0);}
        if(numfromGuesser==numfromPlayer1){
        System.out.println("Player1 wins!");
        System.exit(0);}
        if(numfromGuesser==numfromPlayer2){
        System.out.println("Player2 wins!");
        System.exit(0);}
        if(numfromGuesser==numfromPlayer3){
        System.out.println("Player3 wins!");
        System.exit(0);}
        else if(numfromGuesser!=numfromPlayer1 &&numfromGuesser!=numfromPlayer2)
        System.out.println("Game Lost! Try Again");
    }
}
public class NumberGuessingGame{
    public static final int CHANCES=3;
    public static void main(String args[]){
        Umpire u=new Umpire();
        int i=1;
        while (i<=CHANCES){
            u.collectnumfromGuesser();
            u.collectnumfromPlayers();
            u.compare();
            i++;
        }
    }
}
