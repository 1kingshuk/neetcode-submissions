class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > 1) {
                return true;
            }
        }
        return false;
    
    }
}