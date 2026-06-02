class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index
        //add value and index in map
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }
        //calc difference
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            //if diff 
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }
}
