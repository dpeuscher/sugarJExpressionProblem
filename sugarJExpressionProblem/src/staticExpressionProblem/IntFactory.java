package staticExpressionProblem;

public class IntFactory implements IIntAlg<IExp> {
	public IExp lit(int x) {
		return new Lit(x);
	}
	public IExp add(IExp e1, IExp e2) {
		return new Add(e1, e2);
	}
}