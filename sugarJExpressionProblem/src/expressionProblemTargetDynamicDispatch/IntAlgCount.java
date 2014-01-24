package expressionProblemTargetDynamicDispatch;

public class IntAlgCount {
	public interface Types <A> extends IntAlg.Types<A> {
	}

	public interface PuMethods extends IntAlg.PuMethods {
		public Integer count();
	}
	public interface Methods extends PuMethods,IntAlg.Methods {
		public <B extends PrMethods> void setProtectedRef(B selfRef);
	}
	public interface PrMethods extends PuMethods,IntAlg.PrMethods {
		public String dynamic();
	}
	public class Algebra implements Types<Methods> {
		public Methods lit(final Integer x) {
			final IntAlg.Methods _intAlgLitInstance = new IntAlg().new Algebra().lit(x);
			final Methods _instance = new IntAlgCount.Methods() {
				private PrMethods selfRef = null;
				public <C extends IntAlg.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends PrMethods> void setProtectedRef(C selfRef) {
					this.selfRef = selfRef;
					_intAlgLitInstance.setProtectedRef(selfRef);
				}
				public String print(String prefix) {
					return _intAlgLitInstance.print(prefix);
				}
				public Integer count() {
					return new Integer(1);
				}
			};
			PrMethods selfRefInstance = new PrMethods() {
				public String print(String prefix) {
					return _instance.print(prefix);
				}
				public String dynamic() { return "IntAlgCount"; }
				public Integer count() {
					return _instance.count();
				}
			};
			_instance.setProtectedRef(selfRefInstance);
			return _instance;
		}
	}
	protected static Algebra _algebra;
	public static Algebra Algebra() {
		if (_algebra == null)
			_algebra = new IntAlgCount().new Algebra();
		return _algebra;
	}
}