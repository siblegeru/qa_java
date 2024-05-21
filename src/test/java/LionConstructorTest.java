import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionConstructorTest {

    private Lion lion;
    private Feline feline;
    private final String lionMale;
    private final boolean actualResult;
    private final boolean expected;



    public LionConstructorTest(String lionMale, boolean expected, boolean actualResult) throws Exception {
        this.lionMale = lionMale;
        this.expected = expected;
        this.actualResult = actualResult;
        this.lion = new Lion(lionMale, feline);
        this.feline = feline;
    }

    @Parameterized.Parameters
    public static Object[][] gethasMane() {
        return new Object[][]{
                {"Самец", true, true},
                {"Самка", false, false},
        };
    }


    @Test
    public void exceptionMessageErrorTest() {
        lion.doesHaveMane();
        Assert.assertEquals(lionMale, expected, actualResult);
    }
}
