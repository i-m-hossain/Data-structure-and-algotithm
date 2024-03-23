package org.example;

public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        Integer lowest = Integer.MAX_VALUE;
        Integer secondLowest = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] <= lowest) {
                lowest = nums[i];
            } else if (nums[i] <= secondLowest) {
                secondLowest = nums[i];
            } else if (nums[i] > lowest && nums[i] > secondLowest) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        IncreasingTriplet increasingTriplet = new IncreasingTriplet();
        boolean result = increasingTriplet.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13});
        System.out.println(result);
    }
}
