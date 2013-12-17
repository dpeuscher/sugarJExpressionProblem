package expressionProblemTarget;

public class IntAlgSub {
	public interface Types <A> extends IntAlg.Types <A> {
		public A sub(A e1,A e2);
	}
	public interface Methods extends IntAlg.Methods {
		public String print(String prefix);
	}
	public class Generator implements Types<Methods> {
		public Methods lit(final Integer x) {
			final IntAlg.Methods _intAlgLitInstance = 
					IntAlg.Generator().lit(x);
			return new Methods() {
				public String print(String prefix) {
					return _intAlgLitInstance.print(prefix);
				}
			};
		}
		public Methods sub(final Methods e1, final Methods e2) {
			return new Methods() {
				public String print(String prefix) {
					return prefix + e1.print("") + " - " + e2.print("");
				}
			};
		}
	}
	protected static Generator _generator;
	public static Generator Generator() {
		if (_generator == null)
			_generator = new IntAlgSub().new Generator();
		return _generator;
	}
}