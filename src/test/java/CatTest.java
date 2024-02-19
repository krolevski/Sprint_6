import com.example.Cat;
import com.example.Feline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        cat.getSound();
    }

    @Test
    public void testGetFood() throws Exception{
        Cat cat = new Cat(feline);
        cat.getFood();
    }
}
