import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Integer> data = new ArrayList<Integer>();
        for (int i = 10; i > 0; i--) {
            data.add(i);
        }
        final int result = descentBinarySearch(2, data);
        System.out.println(result);

    }
    public static int descentBinarySearch(int item, List<Integer> data) {
        int low = data.size();
        int high = 0;
        while (high <= low) {
            final int mid = Math.round((low + high) / 2);
            final int guess = data.get(mid);
            if (guess == item) return mid;
            if (guess < item) low = mid - 1;
            else high = mid + 1;
        }
        return -1;
    }
}
