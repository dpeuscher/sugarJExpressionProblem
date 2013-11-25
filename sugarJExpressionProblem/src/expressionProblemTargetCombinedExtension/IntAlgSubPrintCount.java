package expressionProblemTargetCombinedExtension;

import expressionProblemTargetFunctionExtension.IPrintCount;
import expressionProblemTargetFunctionExtension.IntPrintCount;
import expressionProblemTargetTypeExtension.IIntAlgSub;
import expressionProblemTargetTypeExtension.IntPrintSub;

public class IntPrintCountSub extends IntPrintCount 
	implements IIntAlgSub<IPrintCount> {

	public IPrintCount sub(final IPrintCount e1, final IPrintCount e2) {
		return new IPrintCount() {
			protected IntPrintSub _printSubAlg;

			public Integer count() {
				return new Integer(e1.count() + e2.count());
			}
			
			public String print() {
				if (null == _printSubAlg)
					_printSubAlg = new IntPrintSub();
				return _printSubAlg.add(e1,e2).print();
			}
		};
	}

}
