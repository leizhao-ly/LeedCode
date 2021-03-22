package stack;

public class test {
    public static void main(String[] args) throws Exception {
        QueueWithStack withStack=new QueueWithStack();
        withStack.push(1);
        withStack.push(2);
        withStack.push(5);
        int val1=withStack.pop();
        int val2=withStack.pop();
        int val3=withStack.pop();
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    }
}
