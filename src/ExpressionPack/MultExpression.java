package ExpressionPack;

public class MultExpression extends Expression {
	
	Expression left, right;
	
	public MultExpression(Expression l, Expression r){
		left = l;
		right = r;
	} 
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "(" + left.show() + " * " + right.show() + ")" ; 
	}
	@Override
	public int evaluate(Subs subs) {
		
		return left.evaluate(subs) * right.evaluate(subs);
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 1 + left.size() + right.size();
	}
	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 1 + Math.max(left.height(), right.height());
	}
	@Override
	public int countOperator() {
		// TODO Auto-generated method stub
		return 1 + left.countOperator() + right.countOperator(); 
	}

	
	@Override
		public Expression simplify(Subs sub) {
			Expression leftSimplify = left.simplify(sub);
			Expression rightSimplify = right.simplify(sub);
			
			if(leftSimplify instanceof LitExpression && rightSimplify instanceof LitExpression){
				LitExpression litExp = new LitExpression(leftSimplify.evaluate(sub) * rightSimplify.evaluate(sub));
				return litExp;
			}
			return this;
		}
	
	
}
