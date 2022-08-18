// Remove Consecutive Duplicates
// You are provided with an array containing multiple consecutive repetations at places. The task is to simplify the array.
// Simplification here means to remove consecutive same elements and replace them with single repetitive consecutive number.
// Input: 10, 10, 20, 20, 20, 30, 40, 10
// Output: 10 20 30 40 10

import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);                
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 20, 30, 40, 10};
        ArrayList<Integer> result = removeConsecutiveDuplicates(arr);
        for(int i : result) {
            System.out.print(i + " ");

        }
    }
}