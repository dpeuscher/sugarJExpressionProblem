package expressionProblemTargetTypeExtension;

import expressionProblemTargetMain.*;

public class IntAlgSubPrint extends IntAlgPrint implements IIntAlgSub <IIntAlgPrint> {
	public IIntAlgPrint sub(final IIntAlgPrint e1, final IIntAlgPrint e2) {
		return new IIntAlgPrint() {
			public String print(String prefix) {
				return prefix + e1.print("") + " - " + e2.print("");
			}
		};
	}
}
