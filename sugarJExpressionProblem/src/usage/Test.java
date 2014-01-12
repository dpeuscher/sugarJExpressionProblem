package usage;

//import expressionProblemTarget.*;
import sugarJExpressionProblem.*;

public class Test {

	public static void main(String[] args) {
		IntAlgSubCount.Methods expr = 
			IntAlgSubCount.Algebra().Sub(IntAlgSubCount.Algebra().Lit(3), 
					IntAlgSubCount.Algebra().Lit(1));
		System.out.println(expr.print("Expression: ") + " has " +
				expr.count().toString() + " Operators");
	}

}
