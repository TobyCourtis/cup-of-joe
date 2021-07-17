import java.util.ArrayList;
import java.util.Scanner;

public class DotComBust {

    private ArrayList<DotCom> allDotComs = new ArrayList<DotCom>();
    // private GameHelper gameHelper = new GameHelper();
    private int numGuesses = 0;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();

        game.setUpGame();
        game.startPlaying();
    }

    public void setUpGame(){
        // hardcoded locations so I don't have to implement the large helper class
        DotCom first = new DotCom();
        ArrayList<String> locations = new ArrayList<String>(){{
            add("A1");
            add("A2");
            add("A3");
        }}  ;
        first.setName("tobycourtis.com");
        first.setLocationCells(locations);

        DotCom second = new DotCom();
        ArrayList<String> locations2 = new ArrayList<String>(){{
            add("B1");
            add("B2");
            add("B3");
        }};
        second.setName("dumbstats.com");
        second.setLocationCells(locations2);

        DotCom third = new DotCom();
        ArrayList<String> locations3 = new ArrayList<String>(){{
            add("C1");
            add("C2");
            add("C3");
        }};
        third.setName("doge.com");
        third.setLocationCells(locations3);
        
        allDotComs.add(first);
        allDotComs.add(second);
        allDotComs.add(third);
    }

    public void startPlaying(){
        while (!allDotComs.isEmpty()){
            System.out.print("Please enter a number: ");
            Scanner scan = new Scanner(System.in);
            String guess = scan.next();

            checkUserGuess(guess);
        }

        finishGame();
    }

    public void checkUserGuess(String guess){
        String result = "miss";

        numGuesses++;
        for (DotCom dotCom : allDotComs){
            result = dotCom.checkYourself(guess);

            if (result == "hit"){
                break;
            }

            if (result == "kill"){
                allDotComs.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame(){
        if (numGuesses <= 15){
            System.out.println("You took " + numGuesses + " guesses, nice!!!!");    
        } else {
            System.out.println("You took " + numGuesses + " guesses, unlucky m8");    
        }
    }
}