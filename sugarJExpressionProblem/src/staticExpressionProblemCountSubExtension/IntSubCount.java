package staticExpressionProblemCountSubExtension;

import staticExpressionProblemCountExtension.IntCount;
import staticExpressionProblemSubExtension.IIntAlgSub;

public class IntSubCount extends IntCount implements IIntAlgSub <Integer> {

	public Integer sub(Integer e1, Integer e2) {
		return e1 + e2;
	}
}
