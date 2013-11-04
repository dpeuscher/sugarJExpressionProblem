package expressionProblemTargetFunctionExtension;

import expressionProblemTargetMain.*;

public class IntCount implements IIntAlg<ICount> {
	private static IntCount _instance;
	public static IntCount getInstance() {
		if (null == _instance)
			_instance = new IntCount();
		return _instance;
	}
	protected IntCount() {}
	public ICount lit(final int x) {
		return new ICount() {
			
			public Integer count() {
				return new Integer(1);
			}
		};
	}

	public ICount add(final ICount e1, final ICount e2) {
		return new ICount() {
			
			public Integer count() {
				return new Integer(e1.count() + e2.count());
			}
		};
	}
 
}
