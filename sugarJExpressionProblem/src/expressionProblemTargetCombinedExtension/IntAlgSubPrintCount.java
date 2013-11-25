package expressionProblemTargetCombinedExtension;

import expressionProblemTargetFunctionExtension.IIntAlgPrintCount;
import expressionProblemTargetFunctionExtension.IntAlgPrintCount;
import expressionProblemTargetTypeExtension.IIntAlgSub;
import expressionProblemTargetTypeExtension.IntAlgSubPrint;

public class IntAlgSubPrintCount extends IntAlgPrintCount 
	implements IIntAlgSub<IIntAlgPrintCount> {

	public IIntAlgPrintCount sub(final IIntAlgPrintCount e1, final IIntAlgPrintCount e2) {
		return new IIntAlgPrintCount() {
			protected IntAlgSubPrint _printSubAlg;

			public Integer count() {
				return new Integer(e1.count() + e2.count());
			}
			
			public String print(String prefix) {
				if (null == _printSubAlg)
					_printSubAlg = new IntAlgSubPrint();
				return _printSubAlg.sub(e1,e2).print(prefix);
			}
		};
	}

}
