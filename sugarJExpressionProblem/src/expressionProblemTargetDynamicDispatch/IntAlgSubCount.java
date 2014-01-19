package expressionProblemTargetDynamicDispatch;

public class IntAlgSubCount {
	public interface Types <A> extends IntAlgSub.Types<A>,IntAlgCount.Types<A> {
	}
	public interface Methods extends IntAlgSub.Methods, IntAlgCount.Methods {
		public Integer count();
		public <B extends Methods> void setSelfRef(B selfRef);
	}
	public class Algebra implements Types<Methods> {
		public Methods sub(final Methods e1, final Methods e2) {
			final IntAlgSub.Methods _intAlgSubInstance = 
					new IntAlgSub().new Algebra().sub(e1,e2);
			Methods instance = new Methods() {
				private Methods selfRef = null;
				public <C extends IntAlg.Methods> void setSelfRef(C selfRef) {}
				public <C extends IntAlgSub.Methods> void setSelfRef(C selfRef) {}
				public <C extends IntAlgCount.Methods> void setSelfRef(C selfRef) {}
				public <C extends Methods> void setSelfRef(C selfRef) {
					this.selfRef = selfRef;
					_intAlgSubInstance.setSelfRef(selfRef);
				}
				public Integer count() {
					return new Integer(e1.count() + e2.count());
				}
				public String print(String prefix) {
					return _intAlgSubInstance.print(prefix);
				}
				public String dynamic() { return "IntAlgSubCount"; }
			};
			instance.setSelfRef(instance);
			return instance;
		}
		public Methods lit(final Integer x) {
			final IntAlgSub.Methods _intAlgSubInstance = 
					new IntAlgSub().new Algebra().lit(x);
			final IntAlgCount.Methods _intAlgCountInstance =
					new IntAlgCount().new Algebra().lit(x);
			Methods instance = new Methods() {
				private Methods selfRef = null;
				public <C extends IntAlg.Methods> void setSelfRef(C selfRef) {}
				public <C extends IntAlgSub.Methods> void setSelfRef(C selfRef) {}
				public <C extends IntAlgCount.Methods> void setSelfRef(C selfRef) {}
				public <C extends Methods> void setSelfRef(C selfRef) {
					this.selfRef = selfRef;
					_intAlgSubInstance.setSelfRef(selfRef);
					_intAlgCountInstance.setSelfRef(selfRef);
				}
				public Integer count() {
					return _intAlgCountInstance.count();
				}
				public String print(String prefix) {
					return _intAlgCountInstance.print(prefix);
				}
				public String dynamic() { return "IntAlgSubCount"; }
			};
			instance.setSelfRef(instance);
			return instance;
		}
	}
	protected static Algebra _algebra;
	public static Algebra Algebra() {
		if (_algebra == null)
			_algebra = new IntAlgSubCount().new Algebra();
		return _algebra;
	}
}