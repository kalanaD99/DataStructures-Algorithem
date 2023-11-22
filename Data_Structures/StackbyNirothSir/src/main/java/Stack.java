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
        nextIndex++;
    }


}

