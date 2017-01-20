/**
 * Created by GHTL on 20/01/2017.
 *
 * When a number is added to a list, insert it as per the sorting logic (more like insertion sort algorithm)
 */
public class Rack {
    private int[] balls;
    private int[] originalSortedballs = new int[60];
    private int currentSize;

    public int[] getBalls() {
        if(balls == null) {
            return new int[0];
        }
        return balls;
    }

    public void addBallAndSort(int number) {
        if(currentSize == 0) {
            originalSortedballs[0] = number;
            //balls = originalSortedballs;
            balls = new int[++currentSize];
            balls[0] = number;
        }
    }
}