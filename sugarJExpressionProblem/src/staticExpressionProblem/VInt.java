package staticExpressionProblem;

public class VInt implements IValue {
	protected Integer _int;
	public VInt(int x) {
		_int = x;
	}
	public Integer getInt() {
		return _int;
	}
	public Boolean getBool() {
		if (_int == 0)
			return false;
		else
			return true;
	}
}