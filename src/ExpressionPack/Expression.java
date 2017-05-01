package ExpressionPack;

public abstract class Expression {
	
	
	
	abstract public  String show();
    abstract public int evaluate();
	abstract public int size();
	abstract public int height();
	abstract public int countOperator();
	
	
    public static Expression lit(int value){
    	return new LitExpression(value);
    }
    
    public static AddExpression add(Expression left, Expression right){
    	
    	return new AddExpression(left,right);
    }
    
    public static SubExpression sub(Expression left, Expression right){
    	return new SubExpression(left, right);
    }
    
    public static MultExpression mult(Expression left, Expression right){
    	
    	return new MultExpression(left,right);
    }
    
    public static DivExpression divide(Expression left, Expression right){
    	return new DivExpression(left,right);
    }
    
    
    
}
