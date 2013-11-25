package expressionProblemTargetMain;

public class IntAlgPrint implements IIntAlg<IIntAlgPrint> {
	public IIntAlgPrint lit(final Integer x) {
		return new IIntAlgPrint() {
			public String print(String prefix) {
				return prefix + new Integer(x).toString();
			}
		};
	}
}