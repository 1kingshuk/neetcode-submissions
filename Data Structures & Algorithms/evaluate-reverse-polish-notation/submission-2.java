class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();
        int eval = 0;
        if (1 == tokens.length) {
            eval = Integer.valueOf(tokens[0]);
        }
        for (String token: tokens) {
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                int j = Integer.valueOf(stack.pop());
                int i = Integer.valueOf(stack.pop());
                eval = switch(token) {
                    case ("+") -> i+j;
                    case ("-") -> i-j;
                    case ("*") -> i*j;
                    case ("/") -> i/j;
                    default -> throw new IllegalArgumentException("Unknown operator");
                };
                stack.push(String.valueOf(eval));
            } else {
                stack.push(token);
            }
        }
        return eval;
    }
}
