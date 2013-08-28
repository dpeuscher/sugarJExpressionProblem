package staticExpressionProblemSubExtension;

import staticExpressionProblem.*;

public class Sub implements IExp {
	protected IExp _l, _r;
	public Sub(IExp l, IExp r) {
		_l = l;
		_r = r;
	}
	public IValue eval() {
		return new VInt(_l.eval().getInt() - _r.eval().getInt());
	}
}