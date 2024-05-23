import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest1 {
    private final String sex;
    private final boolean expected;
    private Lion lion;
    private Feline feline;

    public LionTest1(String sex, boolean expected) throws Exception {
        this.sex = sex;
        this.expected = expected;
        this.feline = new Feline();
        this.lion = new Lion(sex, feline);
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void lionMaleTest() {
        assertEquals(expected, lion.doesHaveMane());
    }
}
