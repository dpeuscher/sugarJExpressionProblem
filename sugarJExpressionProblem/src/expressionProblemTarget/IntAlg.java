package expressionProblemTarget;

public class IntAlg {
	public interface Types <A> {
		public A lit(Integer x);
	}
	public interface Methods {
		public String print(String prefix);
	}
	public class Generator implements Types<Methods> {
		public Methods lit(final Integer x) {
			return new Methods() {
				public String print(String prefix) {
					return prefix + new Integer(x).toString();
				}
			};
		}
	}
	protected static Generator _generator;
	public static Generator Generator() {
		if (_generator == null)
			_generator = new IntAlg().new Generator();
		return _generator;
	}
}