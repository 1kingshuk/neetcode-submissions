class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        var strs = new ArrayList<String>();
        int i = 0;
        while (i<str.length()) {
            int index = str.indexOf("#", i);
            int strLength = Integer.valueOf(str.substring(i,index));
            i=index+1;
            strs.add(str.substring(i, i+strLength));
            i+=strLength;
        }
        return strs;
    }
}
