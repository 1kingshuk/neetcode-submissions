class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> temp;
    
    public MinStack() {
        stack = new ArrayDeque<>();
        temp = new ArrayDeque<>();
    }
    
    public void push(int val) {
        Integer minimum = null;
        if (temp.isEmpty()) {
            minimum = val;
        } else {
            minimum = Math.min(temp.peek(), val);
        }
        temp.push(minimum);
        stack.push(val);
    }
    
    public void pop() {
        temp.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return temp.peek();
    }
}
