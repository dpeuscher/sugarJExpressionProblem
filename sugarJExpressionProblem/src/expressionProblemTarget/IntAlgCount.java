package expressionProblemTarget;

public class IntAlgCount {
	public interface Types <A> extends IntAlg.Types<A> {
		public A lit(Integer x);
	}
	public interface Methods extends IntAlg.Methods {
		public Integer count();
	}
	public class Generator implements IntAlgCount.Types<IntAlgCount.Methods> {
		public IntAlgCount.Methods lit(final Integer x) {
			final IntAlg.Methods _intAlgLitInstance =
					IntAlg.Generator().lit(x);
			return new IntAlgCount.Methods() {
				public String print(String prefix) {
					return _intAlgLitInstance.print(prefix);
				}
				public Integer count() {
					return new Integer(1);
				}	
			};
		}
	}
	protected static Generator _generator;
	public static Generator Generator() {
		if (_generator == null)
			_generator = new IntAlgCount().new Generator();
		return _generator;
	}
}