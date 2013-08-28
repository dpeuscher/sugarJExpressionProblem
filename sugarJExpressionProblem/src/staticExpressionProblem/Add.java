package staticExpressionProblem;

public class Add implements IExp {
	protected IExp _l, _r;
	public Add(IExp l, IExp r) {
		_l = l;
		_r = r;
	}
	public IValue eval() {
		return new VInt(_l.eval().getInt() + _r.eval().getInt());
	}
}