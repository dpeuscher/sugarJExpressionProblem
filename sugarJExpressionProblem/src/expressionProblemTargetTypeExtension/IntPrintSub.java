package expressionProblemTargetTypeExtension;

import expressionProblemTargetMain.*;

public class IntPrintSub extends IntPrint implements IIntAlgSub <IPrint> {
	private static IntPrintSub _instance;
	public static IntPrintSub getInstance() {
		if (null == _instance)
			_instance = new IntPrintSub();
		return _instance;
	}
	protected IntPrintSub() {}
	public IPrint sub(final IPrint e1, final IPrint e2) {
		return new IPrint() {
			public String print() {
				return e1.print() + " - " + e2.print();
			}
		};
	}
}
