/**
 * Created by GHTL on 20/01/2017.
 */
public class Rack {
    private int[] balls;

    public int[] getBalls() {
        if(balls == null) {
            return new int[0];
        }
        return balls;
    }
}