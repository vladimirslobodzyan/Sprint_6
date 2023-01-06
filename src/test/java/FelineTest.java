import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    //Проеряем метод eatMeat класса Feline
    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFelineFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Кошачьи - хищники",expectedFelineFood, feline.eatMeat());
    }

    //Проверяем метод getFamily класса Feline
    @Test
    public  void  testGetFamily() {
        Feline feline = new Feline();
        String felineAnimal = "Кошачьи";
        Assert.assertEquals("Это семейство Кошачьи",felineAnimal, feline.getFamily());
    }

    //Проверяем метод getKittens класса Feline
    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int fellineKittens = 1;
        Assert.assertEquals("У кошачьх 1 котенок",fellineKittens, feline.getKittens());
    }
}
