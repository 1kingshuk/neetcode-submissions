class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        List<Integer> numsList = Arrays.stream(nums).boxed().toList();
        for (int i=0; i<nums.length; i++) {
            if(numsList.contains(target-nums[i])) {
                for (int j=0; j<nums.length; j++) {
                    if (target-nums[i]==nums[j] && i!=j) {
                        indices[0]=Math.min(i,j);
                        indices[1]=Math.max(i,j);
                    }
                }
            }
        }
        return indices;
    }
}
