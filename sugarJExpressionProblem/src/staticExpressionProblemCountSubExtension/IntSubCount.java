package staticExpressionProblemCountSubExtension;

import staticExpressionProblemCountExtension.IIntCount;
import staticExpressionProblemCountExtension.IntCount;
import staticExpressionProblemSubExtension.IIntAlgSub;

public class IntSubCount extends IntCount implements IIntAlgSub <IIntCount> {
	private static IntSubCount _instance;
	public static IntSubCount getInstance() {
		if (null == _instance)
			_instance = new IntSubCount();
		return _instance;
	}
	protected IntSubCount() {}

	public IIntCount sub(final IIntCount e1, final IIntCount e2) {
		return new IIntCount() {
			public Integer count() {
				return new Integer(e1.count() + e2.count());
			}
		};
	}
}
