
class SimpleDotComTestDrive {

    public static void main(String[] args){
        System.out.println("\nRunning SimpleDotComTestDrive:\n");
        
        checkYourselfTest();
    }

    public static void checkYourselfTest(){
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        int[] locations = {1,2,3};
        simpleDotCom.setLocationCells(locations);

        String guess = "3";

        String result = simpleDotCom.checkYourself(guess);

        String testOutput = "failed";
        if ( result == "Hit"){
            testOutput = "passed";

        }

        System.out.println(testOutput);
    }
}