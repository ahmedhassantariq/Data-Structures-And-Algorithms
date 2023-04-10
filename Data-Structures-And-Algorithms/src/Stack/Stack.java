package Stack;

public class Stack {
    private char stack[];
    private int top = -1;

    public Stack() {
        this.stack = new char[10];
    }

    public void push(char c){
        if(top <stack.length-1) {
            top++;
            this.stack[top] = c;
        }else{
            System.out.println("Stack.Stack is Full");
        }
    }

    public char pop(){
        char temp = ' ';
        if(top>-1) {
            temp = this.stack[top];
            this.stack[top] = ' ';
            top--;
        }
        return temp;
    }

    public char peek(){
        char temp = ' ';
        if(top >-1){
            temp = stack[top];
        }
        return temp;
    }

    public boolean isEmpty(){
        return (top==-1);
    }
}
