package staticExpressionProblemCountExtension;

import staticExpressionProblem.*;

public class IntCount implements IIntAlg<Integer> {

	public Integer lit(int x) {
		return 1;
	}

	public Integer add(Integer e1, Integer e2) {
		return e1 + e2;
	}
 
}
