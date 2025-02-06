public class StackLinkedList<T> {

    private Node<T> top;


    public StackLinkedList(){
        this.top = null;
    }

    // isEmpty
    public boolean isEmpty(){
        return top == null;
    }

    // push
    public void push(T data){
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            top = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;
    }
    //display
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        Node<T> temp = top;
        while(temp != null){
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }



    // pop
    public T pop() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    // peak
    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }
        return top.data;
    }
}
