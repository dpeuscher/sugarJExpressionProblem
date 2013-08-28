package staticExpressionProblemSubExtension;

import staticExpressionProblem.*;

public class UsageSub {
	protected static <A> A visit(IIntAlgSub<A> v) {
		A e1 = v.lit(12);
		A e2 = v.lit(8);
		A e3 = v.lit(22);
		A e4 = v.lit(21);
		A e5 = v.add(e1,e2);
		A e6 = v.add(e3,e5);
		A e7 = v.sub(e6,e4);
		return e7;
	}
	public static void main(String[] args) {
		IntFactorySub factory = new IntFactorySub();
		IntPrintSub printer = new IntPrintSub();
		IValue resultValue = visit(factory).eval();
		String resultString = visit(printer).print();
		System.out.print(resultString + " = " + resultValue.getInt() + "\n");
	}
}
