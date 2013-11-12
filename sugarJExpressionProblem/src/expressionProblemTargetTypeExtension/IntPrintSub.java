package expressionProblemTargetTypeExtension;

import expressionProblemTargetMain.*;

public class IntPrintSub extends IntPrint implements IIntAlgSub <IPrint> {
	public IPrint sub(final IPrint e1, final IPrint e2) {
		return new IPrint() {
			public String print() {
				return e1.print() + " - " + e2.print();
			}
		};
	}
}
