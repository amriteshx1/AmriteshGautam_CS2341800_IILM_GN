public class CountGreaterThan10 {
    public static void main(String[] args) {

        int[] arr = {5, 12, 8, 20, 15, 3, 25};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}
