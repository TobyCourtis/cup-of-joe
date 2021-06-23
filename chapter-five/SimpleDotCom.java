import java.util.Arrays;

class SimpleDotCom {

    private int[] locationCells;

    public static void main(String[] args){
        System.out.println("Entry point");
    }

    // Hit Miss Kill
    public String checkYourself(String guessInput){
        for (int i = 0; i < locationCells.length; i++){
            if(locationCells[i] == Integer.parseInt(guessInput)){
                return "Hit";
            }
        }
        return "Miss";
    }

    public void setLocationCells(int[] locationsInput){
        this.locationCells = locationsInput;
    }
}