import org.junit.Before
import org.junit.Test

/**
 * Created by GHTL on 20/01/2017.
 */
class RackTest {
    private def rack

    @Before
    public void setUp() {
        rack = new Rack()
    }
    @Test
    public void 'should sort the balls as they are added'() {
        assert [] == rack.getBalls()

        rack.addBallAndSort(9)
        assert [9] == rack.getBalls()

        rack.addBallAndSort(45)
        assert [9, 45] == rack.getBalls()
    }
}
