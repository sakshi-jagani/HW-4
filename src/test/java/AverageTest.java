
import junit.framework.*;


public class AverageTest extends TestCase {


    public AverageTest(String average) {
        super(average);
    }


    public void testaverage() {
        assertEquals(2, Average.average(3,new int[]{1,2,3}));
    }

    public void testaverage1() {
        assertEquals(0, Average.average(-1,new int[]{1,2,3}));
    }

    public void testaverage2() {
        assertEquals(0, Average.average(5,new int[]{1,2,-3}));
    }

    public void testaverage3() {
        assertEquals(0, Average.average(-1,new int[]{}));
    }

    public void testaverage4() {
        assertEquals(1, Average.average(5,new int[]{1}));
    }

    public void testaverage5() {
        assertEquals(0, Average.average(0,new int[]{123,123}));
    }

    public void testaverage6() {
        assertEquals(9700, Average.average(40,new int[]{12,33,34,232,133,142,543,5342,133,43231,43342,23232}));
    }

    public static TestSuite suite()
    {
        { return new TestSuite (AverageTest.class); }

    }

}