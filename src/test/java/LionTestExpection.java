import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class LionTestExpection {


    private Feline feline;

    @Test(expected = Exception.class)
    public void exceptionMessageErrorTest() throws Exception {
        new Lion("null", feline);
    }
}
