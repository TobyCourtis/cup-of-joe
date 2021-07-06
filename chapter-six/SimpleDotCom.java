import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class SimpleDotCom {

    private ArrayList<String> locationCells;
    private int numOfHits;

    public static void main(String[] args){
        int numberOfGuesses = 0;
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        Random rand = new Random();
        int randomVal = rand.nextInt(5); // exclusive of top number
        
        ArrayList<String> locations = new ArrayList<String>();
        locations.add(String.valueOf(randomVal));
        locations.add(String.valueOf(randomVal+1));
        locations.add(String.valueOf(randomVal+2));
        
        simpleDotCom.setLocationCells(locations);

        boolean alive = true;

        while (alive){
            System.out.print("Please enter a number: ");
            Scanner scan = new Scanner(System.in);
            String guess = scan.next();
            numberOfGuesses++;

            String result = simpleDotCom.checkYourself(guess);

            System.out.println("That's a " + result);

            if (result == "kill"){
                alive = false;
            }
        }

        System.out.println("Well done - you took " + numberOfGuesses + " guesses!");
    }

    public String checkYourself(String guessInput){
        String result = "miss";
        
        int index = locationCells.indexOf(guessInput);

        if (index >= 0 ) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        return result;
    }

    public void setLocationCells(ArrayList<String> locationsInput){
        this.locationCells = locationsInput;
    }

}

// prep code for simpledotcom:

//1 declare int variable numOfGuesses 
//2 create new simple dot com object
//3 create random value 0-4
//4 setLocations int[] between randomVal, randomVal+1, randomVal+2
//5 declare var alive = True
//6 while alive
//7 get user guess
//8 check guess and print result
//9 if result == kill then alive = False
//10 print No. guesses
