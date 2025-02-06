public class StackLinkedListMain {

    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(70);

        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println(stack.pop());

        stack.display();
        stack.pop();
        stack.display();

        System.out.println("Peek: " + stack.peek());
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.display();
    }

}
