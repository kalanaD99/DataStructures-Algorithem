public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(100);
        //push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        stack.printStack();
        stack.pop();
        //printStack
        stack.printStack();

        stack.pop();
        //printStack
        stack.printStack();
        stack.push(80);
        stack.push(90);
        stack.printStack();
    }
}
