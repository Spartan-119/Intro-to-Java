public class FixedStack implements IntStack{
    private int stck[];
    private int tos; // stands for Top of Stack

    // allocate and initialize stack
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // push an item onto the stack
    public void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("The stack is full.");
        else
            stck[++tos] = item;
    }

    // pop an item from the stack

    @Override
    public int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow!");
            return 0;
        }
        else
            return stck[tos--];
    }
}
