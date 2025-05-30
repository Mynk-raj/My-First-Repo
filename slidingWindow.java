public class slidingWindow {
    public static void main(String arg[]) {
        int arr[] = { 3, 2, 4, 5, 9, 1, 10 };
        int size = 3;

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // add next element and deleteing previous element
        int max = sum;
        for (int i = 1; i <= arr.length - size; i++) {
        
            sum = sum - arr[i - 1] + arr[i + size - 1];
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);

    }
}