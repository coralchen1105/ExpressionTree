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
	public int evaluate() {
		
		return left.evaluate() * right.evaluate();
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
