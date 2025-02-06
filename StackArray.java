public class StackArray {


    private final int  arr[];

    private final int maxSize;

    private int top;


    public StackArray(int size){
        this.maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    //push
    public void push(int data){
        if(top == maxSize - 1){
            System.out.println("Stack is full !!");
            return;
        }
        top ++;
        arr[top] = data;
    }

    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty !");
            return -1;
        }
        int popElement = arr[top];
        top--;
        return popElement;
    }

    //display
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty !");
            return;
        }

        for(int i=top; i>=0 ; i--){
            System.out.print(arr[i] + " \t ");
        }
        System.out.println();
    }
    //peek
    public int peak(){
       if(isEmpty()){
           System.out.println("Stack is empty !");
           return -1;
       }
        return arr[top];
    }


}
