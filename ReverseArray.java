public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        reverseArray(array);
        
        System.out.print("\nReversed array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}