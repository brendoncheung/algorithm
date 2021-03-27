public class TwoStackAlgorithm {

	/**
	 * Ignore LEFT parenthesis
	 * Push operand into operand stack
	 * Push operator into operator stack
	 * When RIGHT parenthesis, pop operator and apply the first two operand and push back to the stack
	 */

	Stack<Character> operator = new Stack<Character>(); //operand stack
	Stack<Double> operand = new Stack<Double>(); //operator stack
	public Double evaluate(String s) {

		for(char c : s.toCharArray()) {

			if(c == '(');
			else if (c == '+') operator.push('+');
			else if (c == '-') operator.push('-');
			else if (c == '*') operator.push('*');
			else if (c == '/') operator.push('/');
			else if (c == ')') {
				Character op = operator.pop();
				Double d = operand.pop();
				if(op == '+') d = operand.pop() + d;
				else if (op == '-') d = operand.pop() - d;
				else if (op == '*') d = operand.pop() * d;
				else if (op == '/') d = operand.pop() / d;
				operand.push(d);
			} else operand.push(Double.parseDouble(String.valueOf(c)));
		}
		return operand.pop();
	}

}
