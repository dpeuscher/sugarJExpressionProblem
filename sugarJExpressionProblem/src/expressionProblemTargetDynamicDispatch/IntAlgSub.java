package expressionProblemTargetDynamicDispatch;

public class IntAlgSub {
	public interface Types <A> extends IntAlg.Types <A> {
		public A sub(A e1,A e2);
	}
	public interface Methods extends IntAlg.Methods {
		public String print(String prefix);
		public <B extends Methods> void setSelfRef(B selfRef);
	}
	public class Algebra implements Types<Methods> {
		public Methods lit(final Integer x) {
			final IntAlg.Methods _intAlgLitInstance = 
					new IntAlg().new Algebra().lit(x);
			Methods instance = new Methods() {
				private Methods selfRef = null;
				public <C extends IntAlg.Methods> void setSelfRef(C selfRef) {}
				public <C extends Methods> void setSelfRef(C selfRef) {
					this.selfRef = selfRef;
					_intAlgLitInstance.setSelfRef(selfRef);
				}
				public String print(String prefix) {
					return _intAlgLitInstance.print(prefix);
				}
				public String dynamic() { return "IntAlgSub"; }
			};
			instance.setSelfRef(instance);
			return instance;
		}
		public Methods sub(final Methods e1, final Methods e2) {
			Methods instance = new Methods() {
				private Methods selfRef = null;
				public <C extends IntAlg.Methods> void setSelfRef(C selfRef) {}
				public <C extends Methods> void setSelfRef(C selfRef) {
					this.selfRef = selfRef;
				}
				public String print(String prefix) {
					return prefix + e1.print(prefix) + " - " + e2.print(prefix) + " [" + selfRef.dynamic() + "] ";
				}
				public String dynamic() { return "IntAlgSub"; }
			};
			instance.setSelfRef(instance);
			return instance;
		}
	}
	protected static Algebra _algebra;
	public static Algebra Algebra() {
		if (_algebra == null)
			_algebra = new IntAlgSub().new Algebra();
		return _algebra;
	}
}