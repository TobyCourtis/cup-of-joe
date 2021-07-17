import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class DotCom {

    private ArrayList<String> locationCells;
    private String name;

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

    public String getName(){
        return this.name;
    }

    public void setName(String nameIn){
        this.name = nameIn;
    }

    public void setLocationCells(ArrayList<String> locationsInput){
        this.locationCells = locationsInput;
    }

}