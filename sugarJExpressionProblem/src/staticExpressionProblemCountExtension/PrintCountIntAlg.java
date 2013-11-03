package staticExpressionProblemCountExtension;

import staticExpressionProblem.IIntAlg;
import staticExpressionProblem.IntPrint;

public class PrintCountIntAlg implements IIntAlg<IPrintCount> {
	protected IntPrint _print;
	protected IntCount _count;
	
	protected PrintCountIntAlg(IntPrint _print, IntCount _count) {
		super();
		this._print = _print;
		this._count = _count;
	}
	protected PrintCountIntAlg() {
		super();
		this._print = new IntPrint();
		this._count = new IntCount();
	}

	@Override
	public IPrintCount lit(final int x) {
		return new IPrintCount() {
			@Override
			public Integer count() {
				return _count.lit(x).count();
			}
			
			@Override
			public String print() {
				return _print.lit(x).print();
			}
		};
	}

	@Override
	public IPrintCount add(final IPrintCount e1, final IPrintCount e2) {
		return new IPrintCount() {
			@Override
			public Integer count() {
				return _count.add(e1,e2).count();
			}
			
			@Override
			public String print() {
				return _print.add(e1,e2).print();
			}
		};
	}

}
