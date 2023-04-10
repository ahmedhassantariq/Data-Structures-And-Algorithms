package InfixToPostfix;

import java.util.Stack;

public class PFE {

    private Stack stack;

    public PFE(){
        stack = new Stack<>();

    }

    public float pfe(String infix){
        int result=0;

        for(int i=0; i<infix.length();i++){
            char c = infix.charAt(i);
            System.out.println("Character: "+c);
            if(Character.isLetterOrDigit(c)){

                stack.push(Character.getNumericValue(c));
                System.out.println("Peeking: "+stack.peek());
            } else {
                int o2 = (int) stack.pop();
                int o1 = (int) stack.pop();
                switch (c){
                    case '*':
                        result = o1*o2;
                        stack.push(result);
                        System.out.println(result);
                        break;
                    case'/':
                        result = o1/o2;
                        stack.push(result);
                        System.out.println(result);
                        break;
                    case'+':
                        result = o1+o2;
                        stack.push(result);
                        System.out.println(result);
                        break;
                    case'-':
                        result = o1-o2;
                        stack.push(result);
                        System.out.println(result);
                        break;
                    default:
                        result = 0;
                        break;
                }

            }
        }



        return result;
    }
}
