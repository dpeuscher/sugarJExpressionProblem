package staticExpressionProblemSubExtension;

import staticExpressionProblem.*;

public class IntFactorySub extends IntFactory implements IIntAlgSub <IExp>{
	public IExp sub(IExp e1, IExp e2) {
		return new Sub(e1, e2);
	}
}
