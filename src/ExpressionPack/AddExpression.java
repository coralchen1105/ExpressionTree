package ExpressionPack;

public class AddExpression extends Expression {
	
	Expression left, right;
	String variableExpression;
	
	public AddExpression(Expression l, Expression r){
		left = l;
		right = r;
	} 
	@Override
	public String show() {
		
		return "(" + left.show() + " + " + right.show() + ")" ; 
	}
	@Override
	public int evaluate(Subs subs) {
		return left.evaluate(subs) + right.evaluate(subs);
		
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
	
	

}
