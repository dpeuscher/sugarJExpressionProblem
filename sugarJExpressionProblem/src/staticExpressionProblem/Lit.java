package staticExpressionProblem;

public class Lit implements IExp {
	protected int _x;
	public Lit (int x) {
		_x = x;
	}
	public IValue eval() {
		return new VInt(_x);
	}
}