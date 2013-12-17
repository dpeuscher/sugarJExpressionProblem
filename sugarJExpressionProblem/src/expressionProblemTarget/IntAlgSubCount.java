package expressionProblemTarget;

public class IntAlgSubCount {
	public interface Types <A> extends IntAlgSub.Types<A>,IntAlgCount.Types<A> {
		public A sub(A e1,A e2);
	}
	public interface Methods extends IntAlgSub.Methods, IntAlgCount.Methods {
		public Integer count();
	}
	public class Generator implements Types<Methods> {
		public Methods sub(final Methods e1, final Methods e2) {
			final IntAlgSub.Methods _intAlgSubInstance =
					IntAlgSub.Generator().sub(e1,e2);
			return new Methods() {
				public Integer count() {
					return new Integer(e1.count() + e2.count());
				}
				public String print(String prefix) {
					return _intAlgSubInstance.print(prefix);
				}
			};
		}
		public Methods lit(Integer x) {
			final IntAlgCount.Methods _intAlgCountInstance =
					new IntAlgCount().new Generator().lit(x);
			return new Methods() {
				public Integer count() {
					return _intAlgCountInstance.count();
				}
				public String print(String prefix) {
					return _intAlgCountInstance.print(prefix);
				}
			};
		}
	}
	protected static Generator _generator;
	public static Generator Generator() {
		if (_generator == null)
			_generator = new IntAlgSubCount().new Generator();
		return _generator;
	}
}
