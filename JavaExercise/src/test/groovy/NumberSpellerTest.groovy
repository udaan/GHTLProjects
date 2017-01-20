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

    @Test
    // number to word conversion - courtesy google
    public void 'should spell number in hundreds of million'() {
        Assert.assertEquals("nine hundred million", numberSpeller.spellOut(900_000_000))
        Assert.assertEquals("eight hundred fifty million", numberSpeller.spellOut(850_000_000))
    }
}
