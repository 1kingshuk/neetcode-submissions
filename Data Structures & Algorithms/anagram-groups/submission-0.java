class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (String str : strs) {
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sortedStr = new String(strArray);
            anagramsMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramsMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}
