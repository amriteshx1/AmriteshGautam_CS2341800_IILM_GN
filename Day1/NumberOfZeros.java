class Main {
    static int countZeros(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 0};
        System.out.println(countZeros(arr));
    }
}
