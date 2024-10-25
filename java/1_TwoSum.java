class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for(int i = 0; i<nums.length; i++) {
            int number = nums[i];
            int searchedNumber = target - number;
            if (numsMap.containsKey(searchedNumber) && (numsMap.get(searchedNumber) != i)) {
                result[0] = numsMap.get(searchedNumber);
                result[1] = i;
            }
             numsMap.put(number, i);
        }

        return result;
    }
}