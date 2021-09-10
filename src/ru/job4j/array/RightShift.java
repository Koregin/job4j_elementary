package ru.job4j.array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        while (count > 0) {
            shift(nums);
            count--;
        }
    }

    private static void shift(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = temp;
    }
}
