package stack;

public class MyStack {
    private static  final int STACK_SIZE=10;
    private int[] data;
    private int top = 0;
    private int size;

    public int getSize() {
        return size;
    }

    public int getTop() {
        return top;
    }
    public MyStack(){
        data=new int[STACK_SIZE];
    }
    public MyStack(int size) {
        this.data = new int[size];
        this.size = size;
    }

    //往里面放
    public void push(int val) {
        if (size == top + 1) {
            int[] newData = new int[size * 2+1];
            System.arraycopy(data, 0, newData, 0, top);
            data = newData;
        }
        data[top++] = val;

    }

    //往外面拿
    public int pop() throws Exception {
        if (top <= 0) {
            throw new Exception();
        }
        return data[--top];
    }
}

