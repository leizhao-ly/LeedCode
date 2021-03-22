package stack;

public class QueueWithStack {
    private MyStack stack1=new MyStack();
    private MyStack stack2=new MyStack();

    public void push(int val){
        stack1.push(val);
    }

    public int pop() throws Exception {
        if(stack2.getTop() >0){
            //说明右栈中还有值
            return stack2.pop();
        }
        if(stack1.getTop() > 0){
            //说明这个里面有值，需要统一的进行放在右边的栈中
            while (stack1.getTop()>0){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        return Integer.MAX_VALUE;
    }
}
