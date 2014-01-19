package expressionProblemTargetDynamicDispatch;

public class Test {

	public static void main(String[] args) {
		IntAlgSubCount.Algebra algebra = IntAlgSubCount.Algebra();
		
		IntAlgSubCount.Methods exp = algebra.sub(algebra.lit(new Integer(2)),algebra.lit(1));
		System.out.println(exp.print("") + " (Parts: " + exp.count().toString() + ")");
	}
}
