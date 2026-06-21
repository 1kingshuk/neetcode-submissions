class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.putIfAbsent(num, 0);
            countMap.put(num, countMap.get(num)+1);
        }
        
        List<Integer> list = new ArrayList<>(countMap.keySet());
        list.sort((a, b) -> countMap.get(b) - countMap.get(a));
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}