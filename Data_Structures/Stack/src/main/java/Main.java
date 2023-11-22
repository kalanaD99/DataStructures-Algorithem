public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // data index capacity

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peek = stack.peek();
        System.out.println("Peek"+ peek);

        stack.push(40);
        System.out.println("Peek"+ stack.peek());

        stack.push(50);
        System.out.println("Peek"+ stack.peek());

        System.out.println("pop :"+stack.pop());//50
        System.out.println("pop :"+stack.pop());//40

        stack.printStack();//[10 20 30]

        stack.push(400);

        stack.printStack();// [10 20 30 400]

        stack.push(400);
        stack.printStack();//[10,20,400,500]

        stack.push(600);
        stack.printStack();//[10,20,400,500,600]

        stack.push(700);
        stack.printStack();//[10,20,400,500,600,700]

        System.out.println("size: " + stack.size());

        System.out.println("Popped: " + stack.pop());

        System.out.println("size: " + stack.size());
    }
}
