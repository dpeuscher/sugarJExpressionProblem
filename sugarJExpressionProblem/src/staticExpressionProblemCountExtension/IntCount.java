package staticExpressionProblemCountExtension;

import staticExpressionProblem.*;

public class IntCount implements IIntAlg<IIntCount> {
	private static IntCount _instance;
	public static IntCount getInstance() {
		if (null == _instance)
			_instance = new IntCount();
		return _instance;
	}
	protected IntCount() {}
	public IIntCount lit(final int x) {
		return new IIntCount() {
			
			public Integer count() {
				return new Integer(1);
			}
		};
	}

	public IIntCount add(final IIntCount e1, final IIntCount e2) {
		return new IIntCount() {
			
			public Integer count() {
				return new Integer(e1.count() + e2.count());
			}
		};
	}
 
}
