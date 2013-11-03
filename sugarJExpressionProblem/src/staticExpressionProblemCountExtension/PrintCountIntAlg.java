package staticExpressionProblemCountExtension;

import staticExpressionProblem.IIntAlg;
import staticExpressionProblem.IntPrint;

public class PrintCountIntAlg implements IIntAlg<IPrintCount> {
	
	public IPrintCount lit(final int x) {
		return new IPrintCount() {
			
			public Integer count() {
				return IntCount.getInstance().lit(x).count();
			}
			
			
			public String print() {
				return IntPrint.getInstance().lit(x).print();
			}
		};
	}

	
	public IPrintCount add(final IPrintCount e1, final IPrintCount e2) {
		return new IPrintCount() {
			
			public Integer count() {
				return IntCount.getInstance().add(e1,e2).count();
			}
			
			
			public String print() {
				return IntPrint.getInstance().add(e1,e2).print();
			}
		};
	}

}
