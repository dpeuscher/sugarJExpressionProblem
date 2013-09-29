package staticExpressionProblemCountSubExtension;

import staticExpressionProblem.IValue;
import staticExpressionProblemSubExtension.IntFactorySub;
import staticExpressionProblemSubExtension.IntPrintSub;
import staticExpressionProblemSubExtension.UsageSub;

public class UsageSubCount extends UsageSub {
	public static void main(String[] args) {
		IntFactorySub factory = new IntFactorySub();
		IntPrintSub printer = new IntPrintSub();
		IntSubCount counter = new IntSubCount();
		IValue resultValue = visit(factory).eval();
		String resultString = visit(printer).print();
		Integer resultCount = visit(counter);
		System.out.print(resultString + " = " + resultValue.getInt() + " (" + resultCount + " Operatoren)\n");
	}
}
