import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by GHTL on 20/01/2017.
 */
class NumberSpellerTest {

    private def numberSpeller

    @Before
    public void setUp() {
        numberSpeller = new NumberSpeller()
    }

    @Test
    public void 'should return number in words'() {
        Assert.assertEquals("zero", numberSpeller.spellOut(0))
        Assert.assertEquals("five", numberSpeller.spellOut(5))
    }
}
