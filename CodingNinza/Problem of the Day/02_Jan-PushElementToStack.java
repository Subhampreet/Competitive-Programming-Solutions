 public static Stack<Integer> insertAtBottom(Stack<Integer> stack, int x) {
        // Check if the stack is empty
        if (stack.isEmpty()) {
            stack.push(x);
            return stack;
        }

        // Create a temporary stack to store popped elements
        Stack<Integer> temp = new Stack<>();

        // Pop all elements from the original stack and push them to temp
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        // Push the new element to the bottom of the original stack
        stack.push(x);

        // Push back the elements from temp to the original stack
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return stack;
}