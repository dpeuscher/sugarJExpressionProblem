package staticExpressionProblem;

public interface IIntAlg<A> {
	public A lit(int x);
	public A add(A e1, A e2);
}