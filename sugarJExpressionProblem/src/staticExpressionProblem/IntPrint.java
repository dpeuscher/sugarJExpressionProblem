package staticExpressionProblem;

public class IntPrint implements IIntAlg<IPrint> {
	public IPrint lit(final int x) {
		return new IPrint() {
			public String print() {
				return new Integer(x).toString();
			}
		};
	}
	public IPrint add(final IPrint e1, final IPrint e2) {
		return new IPrint() {
			public String print() {
				return e1.print() + " + " + e2.print();
			}
		};
	}
}