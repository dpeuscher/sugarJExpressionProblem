package expressionProblemTargetFunctionExtension;

import expressionProblemTargetMain.*;

public class IntAlgPrintCount implements IIntAlg<IIntAlgPrintCount> {
	
	public IIntAlgPrintCount lit(final Integer x) {
		return new IIntAlgPrintCount() {
			protected IntAlgPrint _printAlg;
			public Integer count() {
				return new Integer(1);
			}			
			
			public String print(String prefix) {
				if (null == _printAlg)
					_printAlg = new IntAlgPrint();
				return _printAlg.lit(x).print(prefix);
			}
		};
	}

}
