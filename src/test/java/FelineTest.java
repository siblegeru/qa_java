import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    List<String> meatFood = List.of("Животные", "Птицы", "Рыба");
    private Feline feline;

    @Before
    public void setFeline(){
        feline = new Feline();
    }


    @Test
    public void eatMeatTest() throws Exception {
        List<String> animalGetFood = meatFood;
        Assert.assertEquals("Должно быть: Животные, Птицы, Рыба", animalGetFood, feline.eatMeat());
    }

    @Test
    public void getFamilyTest(){
        String actualResult = feline.getFamily();
        Assert.assertEquals("Кошачьи", actualResult);
    }

    @Test
    public void getKittensTest(){
        int countKittens = feline.getKittens(2);
        Assert.assertEquals(countKittens, feline.getKittens(2));
    }

    @Test
    public void getKittens1Test(){
        int countKittens = feline.getKittens(1);
        Assert.assertEquals(countKittens, feline.getKittens());
    }


}