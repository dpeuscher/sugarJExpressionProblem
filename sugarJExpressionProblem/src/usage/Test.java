package usage;

//import expressionProblemTarget.*;
import sugarJExpressionProblem.*;

public class Test {

	public static void main(String[] args) {
		IntAlgSubCount.Methods expr = 
			IntAlgSubCount.Generator().sub(IntAlgSubCount.Generator().lit(3), 
					IntAlgSubCount.Generator().lit(1));
		System.out.println(expr.print("Expression: ") + " has " +
				expr.count().toString() + " Operators");
	}

}
