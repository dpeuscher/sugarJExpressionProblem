package staticExpressionProblemCountSubExtension;

import staticExpressionProblemCountExtension.IPrintCount;
import staticExpressionProblemCountExtension.PrintCountIntAlg;
import staticExpressionProblemSubExtension.IIntAlgSub;

public class PrintCountSubIntAlg extends PrintCountIntAlg 
	implements IIntAlgSub<IPrintCount> {

	public IPrintCount sub(final IPrintCount e1, final IPrintCount e2) {
		return new IPrintCount() {
			
			public Integer count() {
				return e1.count() + e2.count();
			}
			
			public String print() {
				return e1.print() + " - " + e2.print();
			}
		};
	}

}
