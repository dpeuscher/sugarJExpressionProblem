package staticExpressionProblem;

public class IntPrint implements IIntAlg<IPrint> {
	private static IntPrint _instance;
	public static IntPrint getInstance() {
		if (null == _instance)
			_instance = new IntPrint();
		return _instance;
	}
	protected IntPrint() {}
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