public class StackArrayMain {

    public static void main(String[] args) {
        StackArray stack = new StackArray(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(70);

        stack.display();

        System.out.println("Peak: " + stack.peak());

        stack.pop();

        stack.display();
        stack.pop();
        stack.display();

        System.out.println("Peak: " + stack.peak());
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();

    }

}
