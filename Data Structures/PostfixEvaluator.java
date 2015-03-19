// Author : Enes Kemal Ergin
/*
	PostfixEvaluator.java class
*/
package jss2;	
import jss2.ArrayStack.*;
import java.util.StringTokenizer;

public class PostfixEvaluator{

	private final char ADD = '+';

	private final char SUBTRACT = '-';

	private final char MULTIPLY = '*';

	private final char DIVIDE = '/';

	private ArrayStack<Integer> stack;

	// Constructor
	public PostfixEvaluator(){
		stack = new ArrayStack<Integer>();
	}

	// Evaluates given postfix expression
	// if operand is encountered pushed into stack
	// if operator is encountered pops two operands
	// Result pushed into the stack
	public int evaluate(String expr){
		int op1, op2, result = 0;
		String token;
		StringTokenizer tokenizer = new StringTokenizer (expr);
		while (tokenizer.hasMoreTokens())
		{
			token = tokenizer.nextToken();
			if (isOperator(token))
			{
				op2 = (stack.pop()).intValue();
				op1 = (stack.pop()).intValue();
				result = evalSingleOp (token.charAt(0), op1, op2);
				stack.push (new Integer(result));
			}
		else
			stack.push (new Integer(Integer.parseInt(token)));
		}
		return result;
	}

	// Checks if the specified token is operator
	private boolean isOperator (String token)
	{
		return ( token.equals("+") || token.equals("-") ||
				token.equals("*") || token.equals("/") );
	}

	private int evalSingleOp (char operation, int op1, int op2)
	{
		int result = 0;
		switch (operation)
		{
			case ADD:
				result = op1 + op2;
				break;
			case SUBTRACT:
				result = op1 - op2;
				break;
			case MULTIPLY:
				result = op1 * op2;
				break;
			case DIVIDE:
				result = op1 / op2;
		}
		return result;
	}
}