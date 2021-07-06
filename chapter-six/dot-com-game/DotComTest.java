import java.util.ArrayList;

public class DotComTest {
    
    public static void main(String[] args) {
        DotComTest test = new DotComTest();

        test.checkKillIfLocationsEmpty();
        test.checkHitIfLocationsNotEmpty();
        test.checkMiss();
    }

    private void checkKillIfLocationsEmpty(){
        DotCom victim = new DotCom();
        

        ArrayList<String> locations = new ArrayList<String>(){{
            add("A5");
        }};
        victim.setLocationCells(locations);

        String result = victim.checkYourself("A5");

        if (result == "kill"){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    private void checkHitIfLocationsNotEmpty(){
        DotCom victim = new DotCom();
        

        ArrayList<String> locations = new ArrayList<String>(){{
            add("A4");
            add("A5");
        }};
        victim.setLocationCells(locations);

        String result = victim.checkYourself("A5");

        if (result == "hit"){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    private void checkMiss(){
        DotCom victim = new DotCom();
        

        ArrayList<String> locations = new ArrayList<String>(){{
            add("A4");
            add("A5");
        }};
        victim.setLocationCells(locations);

        String result = victim.checkYourself("A6");

        if (result == "miss"){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
