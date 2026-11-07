class MinStack {
    private final Deque<int[]> stack = new ArrayDeque<>();

    public MinStack() {

    }
    
    public void push(int value) {
             int min = stack.isEmpty() ? value : Math.min(value, stack.peek()[1]);
    stack.push(new int[]{value, min});
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */