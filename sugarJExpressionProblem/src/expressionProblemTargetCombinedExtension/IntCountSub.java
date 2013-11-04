package expressionProblemTargetCombinedExtension;

import expressionProblemTargetFunctionExtension.ICount;
import expressionProblemTargetFunctionExtension.IntCount;
import expressionProblemTargetTypeExtension.IIntAlgSub;

public class IntCountSub extends IntCount implements IIntAlgSub <ICount> {
	private static IntCountSub _instance;
	public static IntCountSub getInstance() {
		if (null == _instance)
			_instance = new IntCountSub();
		return _instance;
	}
	protected IntCountSub() {}

	public ICount sub(final ICount e1, final ICount e2) {
		return new ICount() {
			public Integer count() {
				return new Integer(e1.count() + e2.count());
			}
		};
	}
}
