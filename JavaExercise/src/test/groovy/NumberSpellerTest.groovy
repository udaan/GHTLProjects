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
        Assert.assertEquals("five", numberSpeller.spellOut(5))
    }

    @Test
    public void 'should spell zero'() {
        Assert.assertEquals("zero", numberSpeller.spellOut(0))
    }

    @Test
    public void 'should spell one billion'() {
        Assert.assertEquals("one billion", numberSpeller.spellOut(1000_000_000))
    }
}
