package staticExpressionProblem;

public class Usage {
	protected static <A> A visit(IIntAlg<A> v) {
		A e1 = v.lit(12);
		A e2 = v.lit(8);
		A e3 = v.lit(22);
		A e4 = v.add(e1,e2);
		A e5 = v.add(e3,e4);
		return e5;
	}
	public static void main(String[] args) {
		IntFactory factory = new IntFactory();
		IntPrint printer = new IntPrint();
		IValue resultValue = visit(factory).eval();
		String resultString = visit(printer).print();
		System.out.print(resultString + " = " + resultValue.getInt() + "\n");
	}
}
