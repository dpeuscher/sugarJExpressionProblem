package expressionProblemTargetDynamicDispatch;

public class IntAlg {
	public interface Types <A> {
		public A lit(Integer x);
	}
	public interface PuMethods {
		public String print(String prefix);
	}
	public interface Methods extends PuMethods {
		public <B extends PrMethods> void setProtectedRef(B selfRef);
	}
	public interface PrMethods extends PuMethods {
		public String dynamic();
	}
	public class Algebra implements Types<Methods> {
		public Methods lit(final Integer x) {
			final Methods _instance = new Methods() {
				private PrMethods prSelfRef = null;
				public <B extends PrMethods> void setProtectedRef(B selfRef) {
					this.prSelfRef = selfRef;
				}
				public String print(String prefix) {
					return prefix + new Integer(x).toString() + " [" + prSelfRef.dynamic() + "] ";
				}
			};
			PrMethods selfRefInstance = new PrMethods() {
				public String print(String prefix) {
					return _instance.print(prefix);
				}
				public String dynamic() { return "IntAlg"; }
			};
			_instance.setProtectedRef(selfRefInstance);
			return _instance;
		}
	}
	protected static Algebra _algebra;
	public static Algebra Algebra() {
		if (_algebra == null)
			_algebra = new IntAlg().new Algebra();
		return _algebra;
	}
}