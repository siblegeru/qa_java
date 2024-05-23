import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;


public class LionTestExpection {


    private static final String EXTENDID_ERROR = "Используйте допустимые значения пола животного - самей или самка";
    private Feline feline;

    @Test
    public void exceptionMessageErrorTest() throws Exception {
        Exception exception = Assert.assertThrows(Exception.class,
                () -> new Lion("null", feline));
                Assert.assertEquals(EXTENDID_ERROR, exception.getMessage());
    }
}
