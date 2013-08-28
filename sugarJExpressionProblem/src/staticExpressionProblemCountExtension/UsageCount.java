package staticExpressionProblemCountExtension;

import staticExpressionProblem.*;

public class UsageCount extends Usage {
	public static void main(String[] args) {
		IntFactory factory = new IntFactory();
		IntPrint printer = new IntPrint();
		IntCount counter = new IntCount();
		IValue resultValue = visit(factory).eval();
		String resultString = visit(printer).print();
		Integer resultCount = visit(counter);
		System.out.print(resultString + " = " + resultValue.getInt() + " (" + resultCount + " Operatoren)\n");
	}
}
