import com.example.AlexLion;
import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    private String sex = "Самец";
    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        AlexLion alexLion = new AlexLion(sex, feline);
        Assert.assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void testGetFriends() throws Exception {
        AlexLion alexLion = new AlexLion(sex, feline);
        List<String> expected = List.of("Мелман", "Глория", "Марти");
        Assert.assertEquals(expected, alexLion.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception{
        AlexLion alexLion = new AlexLion(sex, feline);
        Assert.assertEquals("Нью-Йорский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void testMethodClassLionGetHaveMane() throws Exception{
        AlexLion alexLion = new AlexLion(sex, feline);
        assertTrue(alexLion.doesHaveMane());
    }
}
