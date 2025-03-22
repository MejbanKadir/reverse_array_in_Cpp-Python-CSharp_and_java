using System;

class Program {
    static void ReverseArray(int[] arr) {
        int start = 0;
        int end = arr.Length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    static void Main() {
        int[] array = {1, 2, 3, 4, 5};
        
        Console.Write("Original array: ");
        Console.WriteLine(string.Join(" ", array));
        
        ReverseArray(array);
        
        Console.Write("Reversed array: ");
        Console.WriteLine(string.Join(" ", array));
    }
}