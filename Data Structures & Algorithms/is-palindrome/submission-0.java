class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String alphanumericRegex = "^[a-zA-z0-9]+$";
        for (char c : s.toCharArray()) {
            String part = String.valueOf(c);
            if (part.matches(alphanumericRegex)) {
                sb.append(part);
            }
        }
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }
}
