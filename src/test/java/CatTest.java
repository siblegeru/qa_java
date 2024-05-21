import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    List<String> kindFood = List.of("Животные", "Птицы", "Рыба");
    Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setCat(){
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest(){
        String actualSound = cat.getSound();
        Assert.assertEquals("Мяу", actualSound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(kindFood);
        List<String> actualFood = cat.getFood();
        List<String> expectedkindFood = kindFood;
        Assert.assertEquals("Должны получить: Животные, Птицы, Рыба", expectedkindFood, actualFood);
    }

}
