package CoustomStack;

public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack<String> stack = new CustomStack<>();
        stack.push("r");
        stack.push("o");
        stack.push("w");
        stack.push("s");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
