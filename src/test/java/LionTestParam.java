import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTestParam {

    private Feline feline;
    private Lion lion;
    private final String lionMale;
    private final boolean expected;


    public LionTestParam(String lionMane, boolean expected) throws Exception {
        this.lionMale = lionMane;
        this.expected = expected;
        this.feline = feline;
        this.lion = new Lion(lionMale, feline);

    }

    @Parameterized.Parameters
    public static Object[][] gethasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getLionMale(){
        Assert.assertEquals(expected, lion.doesHaveMane());
    }

}
