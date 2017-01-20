import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by GHTL on 20/01/2017.
 *
 * number in words - courtesy google
 */
class NumberSpellerTest {

    private def numberSpeller

    @Before
    public void setUp() {
        numberSpeller = new NumberSpeller()
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
    public void 'should spell number in hundreds of million'() {
        Assert.assertEquals("nine hundred million", numberSpeller.spellOut(900_000_000))
        Assert.assertEquals("eight hundred fifty million", numberSpeller.spellOut(850_000_000))
        Assert.assertEquals("six hundred twenty-four million", numberSpeller.spellOut(624_000_000))
        Assert.assertEquals("seven hundred eleven million", numberSpeller.spellOut(711_000_000))
        Assert.assertEquals("one hundred five million", numberSpeller.spellOut(105_000_000))
    }

    @Test
    public void 'should spell number in hundreds of thousand'() {
        Assert.assertEquals("nine hundred thousand", numberSpeller.spellOut(900_000))
        Assert.assertEquals("eight hundred fifty thousand", numberSpeller.spellOut(850_000))
        Assert.assertEquals("six hundred twenty-four thousand", numberSpeller.spellOut(624_000))
        Assert.assertEquals("seven hundred eleven thousand", numberSpeller.spellOut(711_000))
        Assert.assertEquals("one hundred five thousand", numberSpeller.spellOut(105_000))
    }

    @Test
    public void 'should spell number in hundreds'() {
        Assert.assertEquals("nine hundred", numberSpeller.spellOut(900))
        Assert.assertEquals("eight hundred fifty", numberSpeller.spellOut(850))
        Assert.assertEquals("six hundred twenty-four", numberSpeller.spellOut(624))
        Assert.assertEquals("seven hundred eleven", numberSpeller.spellOut(711))
        Assert.assertEquals("one hundred five", numberSpeller.spellOut(105))
        Assert.assertEquals("five hundred forty-two", numberSpeller.spellOut(542))
    }

    @Test
    public void 'should spell number in tens'() {
        Assert.assertEquals("ninety", numberSpeller.spellOut(90))
        Assert.assertEquals("eighty-five", numberSpeller.spellOut(85))
        Assert.assertEquals("twenty-four", numberSpeller.spellOut(24))
        Assert.assertEquals("eleven", numberSpeller.spellOut(11))
        Assert.assertEquals("ten", numberSpeller.spellOut(10))
    }

    @Test
    public void 'should spell number in ones'() {
        Assert.assertEquals("nine", numberSpeller.spellOut(9))
        Assert.assertEquals("one", numberSpeller.spellOut(1))
    }

    @Test
    public void 'should spell numbers with digits in almost all places'() {
        Assert.assertEquals("nine hundred million three hundred twelve", numberSpeller.spellOut(900_000_312))
        Assert.assertEquals("nine hundred million five hundred forty-six thousand three hundred twelve", numberSpeller.spellOut(900_546_312))
        Assert.assertEquals("nine hundred million five hundred forty-six thousand two hundred", numberSpeller.spellOut(900_546_200))
        Assert.assertEquals("nine hundred million seven hundred thousand two hundred", numberSpeller.spellOut(900_700_200))
        Assert.assertEquals("nine hundred million two hundred", numberSpeller.spellOut(900_000_200))
        Assert.assertEquals("seven hundred thousand two hundred", numberSpeller.spellOut(700_200))
        Assert.assertEquals("seven hundred twelve thousand two hundred ninety-six", numberSpeller.spellOut(712_296))
        Assert.assertEquals("one million forty-nine thousand eight hundred seventy-five", numberSpeller.spellOut(1_049_875))
    }

    @Test
    public void 'should spell a number in thousands'() {
        Assert.assertEquals('one thousand five hundred forty-two', numberSpeller.spellOut(1542))
        Assert.assertEquals('three thousand', numberSpeller.spellOut(3000))
    }

    @Test
    public void 'should spell a number in ten thousands'() {
        Assert.assertEquals('twenty-three thousand two hundred twelve', numberSpeller.spellOut(23212))
        Assert.assertEquals('ten thousand one hundred two', numberSpeller.spellOut(10102))
    }
}