package staticExpressionProblemCountSubExtension;

import staticExpressionProblemCountExtension.IPrintCount;
import staticExpressionProblemCountExtension.IntPrintCount;
import staticExpressionProblemSubExtension.IIntAlgSub;
import staticExpressionProblemSubExtension.IntPrintSub;

public class IntPrintCountSub extends IntPrintCount 
	implements IIntAlgSub<IPrintCount> {

	public IPrintCount sub(final IPrintCount e1, final IPrintCount e2) {
		return new IPrintCount() {
			
			public Integer count() {
				return IntCountSub.getInstance().sub(e1, e2).count();
			}
			
			public String print() {
				return IntPrintSub.getInstance().sub(e1, e2).print();
			}
		};
	}

}
