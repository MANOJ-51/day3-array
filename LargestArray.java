public class LargestArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int large = array[0];
        for (int i = 0; i < array.length; i++) {
            if (large<array[i]) {
                large = array[i];
            }
        }
        System.out.println(large);
    }
}