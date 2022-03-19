import org.junit.Test;

import static org.junit.Assert.*;

public class youngphysicistTest {

    @Test
    public void sumOfForces() {
        youngphysicist x= new youngphysicist();

        int number_of_forces=3;
        int [][]forces= {{4,1,7},{-2,4,-1},{1,-5,-3}};
        assertEquals(false,x.sumOfForces(number_of_forces,forces));
    }
}