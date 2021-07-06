import java.util.ArrayList;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

public class DotComBustTest {
    
    private static void main(String[] args) {
        // run tests
        setUpGameTest();
    }

    private void setUpGameTest(){
        DotComBust victim = new DotComBust();

        
        victim.setUpGame(locations);

        
    }
}
