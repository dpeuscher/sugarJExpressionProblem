package staticExpressionProblemCountExtension;

import staticExpressionProblem.*;

public class IntCount implements IIntAlg<IIntCount> {

	public IIntCount lit(final int x) {
		return new IIntCount() {
			@Override
			public Integer count() {
				return new Integer(x);
			}
		};
	}

	public IIntCount add(final IIntCount e1, final IIntCount e2) {
		return new IIntCount() {
			@Override
			public Integer count() {
				return new Integer(e1.count() + e2.count());
			}
		};
	}
 
}
