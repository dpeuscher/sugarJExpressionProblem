package expressionProblemTargetDynamicDispatch;

public class IntAlgSubCount {
	public interface Types <A> extends IntAlgSub.Types<A>,IntAlgCount.Types<A> {
	}
	public interface PuMethods extends IntAlgSub.PuMethods,IntAlgCount.PuMethods {
	}
	public interface Methods extends PuMethods,IntAlgSub.Methods,IntAlgCount.Methods {
		public <B extends PrMethods> void setProtectedRef(B selfRef);
	}
	public interface PrMethods extends PuMethods,IntAlgSub.PrMethods,IntAlgCount.PrMethods {
		public String dynamic();
	}
	public class Algebra implements Types<Methods> {
		public Methods sub(final Methods e1, final Methods e2) {
			final IntAlgSub.Methods _intAlgSubInstance = 
					new IntAlgSub().new Algebra().sub(e1,e2);
			final Methods _instance = new Methods() {
				private PrMethods selfRef = null;
				public <C extends IntAlg.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends IntAlgSub.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends IntAlgCount.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends PrMethods> void setProtectedRef(C selfRef) {
					this.selfRef = selfRef;
					_intAlgSubInstance.setProtectedRef(selfRef);
				}
				public Integer count() {
					return new Integer(e1.count() + e2.count());
				}
				public String print(String prefix) {
					return _intAlgSubInstance.print(prefix);
				}
			};
			PrMethods selfRefInstance = new PrMethods() {
				public String print(String prefix) {
					return _instance.print(prefix);
				}
				public String dynamic() { return "IntAlgSubCount"; }
				public Integer count() {
					return _instance.count();
				}
			};
			_instance.setProtectedRef(selfRefInstance);
			return _instance;
		}
		public Methods lit(final Integer x) {
			final IntAlgSub.Methods _intAlgSubInstance = 
					new IntAlgSub().new Algebra().lit(x);
			final IntAlgCount.Methods _intAlgCountInstance =
					new IntAlgCount().new Algebra().lit(x);
			final Methods _instance = new Methods() {
				private PrMethods selfRef = null;
				public <C extends IntAlg.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends IntAlgSub.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends IntAlgCount.PrMethods> void setProtectedRef(C selfRef) {}
				public <C extends PrMethods> void setProtectedRef(C selfRef) {
					this.selfRef = selfRef;
					_intAlgSubInstance.setProtectedRef(selfRef);
					_intAlgCountInstance.setProtectedRef(selfRef);
				}
				public Integer count() {
					return _intAlgCountInstance.count();
				}
				public String print(String prefix) {
					return _intAlgCountInstance.print(prefix);
				}
			};
			PrMethods selfRefInstance = new PrMethods() {
				public String print(String prefix) {
					return _instance.print(prefix);
				}
				public String dynamic() { return "IntAlgSubCount"; }
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
			_algebra = new IntAlgSubCount().new Algebra();
		return _algebra;
	}
}