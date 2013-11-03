package staticExpressionProblemCountSubExtension;

import staticExpressionProblem.IValue;
import staticExpressionProblemCountExtension.IPrintCount;
import staticExpressionProblemSubExtension.IntFactorySub;
import staticExpressionProblemSubExtension.UsageSub;

public class UsageSubCount extends UsageSub {
	public static void main(String[] args) {
		IntFactorySub factory = new IntFactorySub();
		IntPrintCountSub combinedAlg = new IntPrintCountSub();
		IValue resultValue = visit(factory).eval();
		IPrintCount result = visit(combinedAlg);
		System.out.print(result.print() + " = " + resultValue.getInt() +
				" (" + result.count() + " Operatoren)\n");
	}
}
