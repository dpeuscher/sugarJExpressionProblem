package expressionProblemTargetDynamicDispatch;

public class IntAlgCount {
	public interface Types <A> extends IntAlg.Types<A> {
	}
	public interface Methods extends IntAlg.Methods {
		public Integer count();
		public <B extends Methods> void setSelfRef(B selfRef);
	}
	public class Algebra implements Types<Methods> {
		public Methods lit(final Integer x) {
			final IntAlg.Methods _intAlgLitInstance = new IntAlg().new Algebra().lit(x);
			Methods instance = new IntAlgCount.Methods() {
				private Methods selfRef = null;
				public <C extends IntAlg.Methods> void setSelfRef(C selfRef) {}
				public <C extends Methods> void setSelfRef(C selfRef) {
					this.selfRef = selfRef;
					_intAlgLitInstance.setSelfRef(selfRef);
				}
				public String print(String prefix) {
					return _intAlgLitInstance.print(prefix);
				}
				public Integer count() {
					return new Integer(1);
				}
				public String dynamic() { return "IntAlgCount"; }
			};
			instance.setSelfRef(instance);
			return instance;
		}
	}
	protected static Algebra _algebra;
	public static Algebra Algebra() {
		if (_algebra == null)
			_algebra = new IntAlgCount().new Algebra();
		return _algebra;
	}
}