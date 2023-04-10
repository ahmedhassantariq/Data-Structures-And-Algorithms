package InfixToPostfix;

import Stack.Stack;

public class ItoP {

    static String infixToPostfix(String equation){
        String output = "";
        Stack stack = new Stack();


        for (int i=0;i<equation.length();i++){

            char c = equation.charAt(i);

            if(Character.isLetterOrDigit(c)){
                output+=c;
            }else if(c=='('){
                stack.push(c);
            }else if(c==')'){
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output += stack.peek();
                    stack.pop();
                }
                if(!stack.isEmpty()){stack.pop();}

        } else {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                    output += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return null;
            output += stack.peek();
            stack.pop();
        }

        return output;

    }



    private static int prec(char o){
        switch (o) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

}
