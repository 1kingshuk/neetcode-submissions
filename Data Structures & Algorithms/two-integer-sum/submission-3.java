class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] indices = new int[2];
        for (int i=0; i<nums.length; i++) {
            int diff = target-nums[i];
            if (numMap.containsKey(diff)) {
                indices[0]=Math.min(numMap.get(diff),i);
                indices[1]=Math.max(numMap.get(diff),i);
                break;
            } else {
                numMap.put(nums[i],i);
            }
        }
        return indices;
    }
}
