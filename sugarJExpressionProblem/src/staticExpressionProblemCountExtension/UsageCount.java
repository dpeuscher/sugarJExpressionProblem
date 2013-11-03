package staticExpressionProblemCountExtension;

import staticExpressionProblem.*;

public class UsageCount extends Usage {
	public static void main(String[] args) {
		IntFactory factory = new IntFactory();
		IntPrintCount combinedAlg = new IntPrintCount();
		IValue resultValue = visit(factory).eval();
		IPrintCount result = visit(combinedAlg);
		System.out.print(result.print() + " = " + resultValue.getInt() +
				" (" + result.count() + " Operatoren)\n");
	}
}
