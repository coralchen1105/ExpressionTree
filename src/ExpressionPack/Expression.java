package ExpressionPack;

public abstract class Expression {
	
	
	
	abstract public  String show();
    abstract public int evaluate(Subs subs);
    
	abstract public int size();
	abstract public int height();
	abstract public int countOperator();
	abstract public Expression simplify(Subs sub);
	
	
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
    
    public static VarExpression varExp(String name){
    	return new VarExpression(name);
    }
    
    
}
