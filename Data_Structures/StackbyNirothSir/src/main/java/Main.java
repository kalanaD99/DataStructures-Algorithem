public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(100);
        System.out.println("Size of the indexes  : "+ stack.size());
        //push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printStack();

       /* stack.pop();
        //printStack
        stack.printStack();

        stack.pop();
        //printStack
        stack.printStack();
        stack.push(80);
        stack.push(90);
        stack.printStack();
        System.out.println("Size of the indexes  : "+ stack.size());

        stack.clear();
        System.out.println("Size of the indexes  : "+ stack.size());
        stack.printStack();
        stack.pop();*/

        int topElement;
        topElement = stack.peek();
        System.out.println("Top Element of the Stack : "+ topElement);
        System.out.println("After calling peek");
        stack.printStack();
        System.out.println();

        stack.poll();
        System.out.println("Top Element of the Stack : "+ topElement);
        System.out.println("After calling poll");
        stack.printStack();

    }
}
