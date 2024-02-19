import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LionTest {
    Feline feline = new Feline();
    Lion lion = new Lion(feline);

    @Test
    public void testGetKittens() {
        System.out.println(lion.getKittens());
    }

    @Test
    public void testDoesHaveMan() {
        System.out.println(lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        System.out.println(lion.getFood());
    }

    @Test()
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Котенок");
            lion.doesHaveMane();
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
