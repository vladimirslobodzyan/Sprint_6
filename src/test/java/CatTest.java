import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

// Проверяем метод getSound класса Cat
    @Test
    public void testCatGetSound () {
        Cat cat = new Cat(feline);
        String catSound = cat.getSound();
        Assert.assertEquals("Кошка должна говорить - Мяу","Мяу", catSound);
    }

// Прверяем метод getFood класса Cat
    @Test
    public  void testGetFood () throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedCatFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Кошки - хищники",expectedCatFood, cat.getFood());
    }
}