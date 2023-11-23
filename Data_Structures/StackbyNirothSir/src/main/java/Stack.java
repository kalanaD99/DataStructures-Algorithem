public class Stack {
    private int[] elementData;
    private int nextIndex;

    //constructor through array size ek select krnawa
    public Stack(int size) {
        elementData = new int[size];
        nextIndex = 0;
    }
    public void push(int data){
        if (isFull()){
            System.out.println("Stack is full...");
        }
        elementData[nextIndex]=data;
        ++nextIndex;
    }


    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex-1 ; i >=0 ; i--){
            System.out.print(elementData[i] +", ");
        }
        System.out.println(isEmpty() ? "Empty]" : "\b\b]");
    }

    public int pop() {
        if (isEmpty()){
            System.out.println("Stack is Empty ");
        }
       return elementData[nextIndex--];
    }

    public int size() {
        return nextIndex;
    }
    public boolean isEmpty(){
        return nextIndex == 0;
    }
    public boolean isFull(){
        return nextIndex >= elementData.length;
    }

    public void clear() {
        nextIndex = 0;
    }

    public int peek() {
      return elementData[nextIndex-1];
    }

    public int poll() {
        return elementData[--nextIndex] ;
    }
}

