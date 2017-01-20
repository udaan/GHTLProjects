/**
 * Created by GHTL on 20/01/2017.
 *
 * When a number is added to a list, insert it as per the sorting logic (more like insertion sort algorithm)
 */
public class Rack {
    private int[] balls;
    private int[] originalSortedList = new int[60];
    private int currentSize;

    public int[] getBalls() {
        if (balls == null) {
            return new int[0];
        }
        return balls;
    }

    public void addBallAndSort(int number) {
        if (currentSize == 0) {
            originalSortedList[0] = number;
            balls = new int[++currentSize];
            balls[0] = number;
        } else {
            int position = currentSize;
            for (int i = currentSize - 1; i >= 0; i--) {
                if (number < originalSortedList[i]) {
                    originalSortedList[i + 1] = originalSortedList[i];
                    position = i;
                } else {
                    break;
                }
            }

            originalSortedList[position] = number;
            currentSize++;
            balls = new int[currentSize];

            System.arraycopy(originalSortedList, 0, balls, 0, currentSize);
        }
    }
}