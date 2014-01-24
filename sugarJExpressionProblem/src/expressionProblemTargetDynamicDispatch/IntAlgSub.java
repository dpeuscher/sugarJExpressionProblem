package expressionProblemTargetDynamicDispatch;

public class IntAlgSub {
	public interface Types <A> extends IntAlg.Types <A> {
		public A sub(A e1,A e2);
	}
	public interface PuMethods extends IntAlg.PuMethods {
	}
	public interface Methods extends PuMethods,IntAlg.Methods {
		public <B extends PrMethods> void setProtectedRef(B selfRef);
	}
	public interface PrMethods extends PuMethods,IntAlg.PrMethods {
		public String dynamic();
	}
	public class Algebra implements Types<Methods> {
		public Methods lit(final Integer x) {
			final IntAlg.Methods _intAlgLitInstance = 
					new IntAlg().new Algebra().lit(x);
			final Methods _instance = new Methods() {
				private PrMethods selfRef = null;
				public <C extends IntAlg.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends PrMethods> void setProtectedRef(C selfRef) {
					this.selfRef = selfRef;
					_intAlgLitInstance.setProtectedRef(selfRef);
				}
				public String print(String prefix) {
					return _intAlgLitInstance.print(prefix);
				}
			};
			PrMethods selfRefInstance = new PrMethods() {
				public String print(String prefix) {
					return _instance.print(prefix);
				}
				public String dynamic() { return "IntAlgSub"; }
			};
			_instance.setProtectedRef(selfRefInstance);
			return _instance;
		}
		public Methods sub(final Methods e1, final Methods e2) {
			final Methods _instance = new Methods() {
				private PrMethods selfRef = null;
				public <C extends IntAlg.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends PrMethods> void setProtectedRef(C selfRef) {
					this.selfRef = selfRef;
				}
				public String print(String prefix) {
					return prefix + e1.print(prefix) + " - " + e2.print(prefix) + " [" + selfRef.dynamic() + "] ";
				}
			};
			PrMethods selfRefInstance = new PrMethods() {
				public String print(String prefix) {
					return _instance.print(prefix);
				}
				public String dynamic() { return "IntAlgSub"; }
			};
			_instance.setProtectedRef(selfRefInstance);
			return _instance;
		}
	}
	protected static Algebra _algebra;
	public static Algebra Algebra() {
		if (_algebra == null)
			_algebra = new IntAlgSub().new Algebra();
		return _algebra;
	}
}