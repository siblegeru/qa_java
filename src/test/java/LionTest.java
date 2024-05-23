import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lion;
    boolean hasMane;
    List<String> foodList = List.of("Животные", "Птицы", "Рыба");

    @Mock
    Feline feline;

    private String sex;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void doesHaveManeTestMan() throws Exception {
        lion = new Lion("Самец", feline);
        boolean actualResalt = lion.doesHaveMane();
        Assert.assertEquals(true, actualResalt);

    }
    @Test
    public void doesHaveManeTestGirl() throws Exception {
        lion = new Lion("Самка", feline);
        boolean actualResalt = lion.doesHaveMane();
        Assert.assertEquals(false, actualResalt);

    }

    @Test
    public void getKittensTest(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualCount = lion.getKittens();
        int expectedCount = feline.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getEatMeatTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(foodList);
        List<String> actualList = lion.getFood();
        List<String> expectedList = feline.getFood("Хищник");
        Assert.assertEquals(expectedList, actualList);
    }

}

