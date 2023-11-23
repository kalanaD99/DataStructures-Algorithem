public class Stack {
    private int[] elementData;
    private int nextIndex;

    //constructor through array size ek select krnawa
    public Stack(int size) {
        elementData = new int[size];
        nextIndex = 0;
    }
    public void push(int data){
        elementData[nextIndex]=data;
        ++nextIndex;
    }


    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex-1 ; i >=0 ; i--){
            System.out.print(elementData[i] +", ");
        }
        System.out.println("\b\b]");
    }

    public int pop() {
       return elementData[nextIndex--];
    }
}

