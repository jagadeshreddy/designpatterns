package org.designpatterns.behavioural.interpreter;

import java.util.Stack;

public class InterpreterMain {

    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(new AdditionExpression(stack.pop(), stack.pop()));
            } else if (token.equals("-")) {
                stack.push(new SubtractionExpression(stack.pop(), stack.pop()));
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "2 3 +";
        Expression ans = parse(expression);
        System.out.println(ans.interept());
    }
}
