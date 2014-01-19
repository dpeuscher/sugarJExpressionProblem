package expressionProblemTargetDynamicDispatch;

public class IntAlg {
	public interface Types <A> {
		public A lit(Integer x);
	}
	public interface Methods {
		public String print(String prefix);
		public <B extends Methods> void setSelfRef(B selfRef);
		public String dynamic();
	}
	public class Algebra implements Types<Methods> {
		public Methods lit(final Integer x) {
			Methods instance = new Methods() {
				private Methods selfRef = null;
				public <B extends Methods> void setSelfRef(B selfRef) {
					this.selfRef = selfRef;
				}
				public String print(String prefix) {
					return prefix + new Integer(x).toString() + " [" + selfRef.dynamic() + "] ";
				}
				public String dynamic() { return "IntAlg"; }
			};
			instance.setSelfRef(instance);
			return instance;
		}
	}
	protected static Algebra _algebra;
	public static Algebra Algebra() {
		if (_algebra == null)
			_algebra = new IntAlg().new Algebra();
		return _algebra;
	}
}