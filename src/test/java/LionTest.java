import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    //Проверяем медот getFood класса Lion
    @Test
    public  void testLionGetFood () throws Exception {
        Lion lion = new Lion (feline, "Самец");
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    //Проверяем Exception класса Lion
    @Test
    public  void testLionClassException() {
        try {
            new Lion(feline, "Некто");
        } catch (Exception exception) {
            Assert.assertEquals("Лев-хищник","Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    //Проверяем метод getKittens класса Lion
    @Test
    public void testLionGetKittens() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    //Положительная проверка метода doesHaveMane класса Lion
    @Test
    public void testPositiveLionDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        assertTrue(lion.doesHaveMane());
    }

    //Отрицательная проверка метода doesHaveMane класса Lion
    @Test
    public void testNegativeLionDoesHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        assertFalse(lion.doesHaveMane());
    }
}
