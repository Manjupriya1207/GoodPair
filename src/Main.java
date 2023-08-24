import java.util.HashSet;

public class Main {
    public static int hasGoodPair(int[] A, int B) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : A) {
            if (set.contains(B - num)) {
                return 1; // A good pair exists
            }
            set.add(num);
        }

        return 0; // No good pair found
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int B1 = 7;
        int result1 = hasGoodPair(A1, B1);
        System.out.println(result1); // Output: 1

        int[] A2 = {1, 2, 4};
        int B2 = 4;
        int result2 = hasGoodPair(A2, B2);
        System.out.println(result2); // Output: 0

        int[] A3 = {1, 2, 2};
        int B3 = 4;
        int result3 = hasGoodPair(A3, B3);
        System.out.println(result3); // Output: 1
    }
}
