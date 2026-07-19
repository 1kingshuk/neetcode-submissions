class Solution {
    public int longestConsecutive(int[] nums) {
        int sequenceLength = 1;
        int temp = 1;
        if (nums.length==0) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue;
            } else {
                if (nums[i + 1] - nums[i] == 1) {
                    temp++;
                } else {
                    temp=1;
                }
            }
            sequenceLength = Math.max(sequenceLength,temp);
        }
        return sequenceLength;
    }
}
