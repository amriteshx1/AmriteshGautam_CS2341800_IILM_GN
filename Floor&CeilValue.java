class Main {
    static void floorAndCeil(int[] arr, int x) {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) {
            if (num <= x) {
                floor = num;
            }

            if (num >= x) {
                ceil = num;
                break;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        floorAndCeil(arr, 6);
    }
}
