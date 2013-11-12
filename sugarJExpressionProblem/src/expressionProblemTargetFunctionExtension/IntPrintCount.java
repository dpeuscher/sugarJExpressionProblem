package expressionProblemTargetFunctionExtension;

import expressionProblemTargetMain.*;

public class IntPrintCount implements IIntAlg<IPrintCount> {
	
	public IPrintCount lit(final int x) {
		return new IPrintCount() {
			protected IntPrint _printAlg;
			public Integer count() {
				return new Integer(1);
			}			
			
			public String print() {
				if (null == _printAlg)
					_printAlg = new IntPrint();
				return _printAlg.lit(x).print();
			}
		};
	}
	
	public IPrintCount add(final IPrintCount e1, final IPrintCount e2) {
		return new IPrintCount() {
			protected IntPrint _printAlg;
			public Integer count() {
				return new Integer(e1.count() + e2.count());
			}
			
			
			public String print() {
				if (null == _printAlg)
					_printAlg = new IntPrint();
				return _printAlg.add(e1,e2).print();
			}
		};
	}

}
