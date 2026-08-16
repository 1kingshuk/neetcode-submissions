class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        var numSet = new HashSet<Integer>();
        int longestSubsequence = 0;
        for (int num : nums) {
            numSet.add(num);
        }

        for (Integer num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentLength++;
                    currentNum = currentNum+1;
                }
                longestSubsequence = Math.max(longestSubsequence, currentLength);
            }
        }
        return longestSubsequence;
    }
}
