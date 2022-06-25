package com.Behavioral.Interpreter;

public class AndExpression implements Expression{

    Expression expression=null;
    Expression expression1=null;

    public AndExpression(Expression expression, Expression expression1) {
        this.expression = expression;
        this.expression1 = expression1;
    }

    @Override
    public boolean interpret(String context) {
        return expression.interpret(context) && expression1.interpret(context);
    }
}
