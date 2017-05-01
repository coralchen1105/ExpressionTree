package ExpressionPack;
import static ExpressionPack.Expression.*;

import java.util.ArrayList;

public class ExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subs subs = new Subs();
		
		Expression e1 = mult(lit(2), add(lit(3),lit(5)));
		Expression e2 = add(add(lit(3),lit(2)), lit(7)); 
		Expression e3 = divide(lit(60), sub(lit(7),lit(1))); 
		Expression e4 = mult(add(lit(60),lit(5)), sub(lit(6),lit(1))); 
		Expression e5 = add(mult(lit(9),lit(3)), mult(lit(7), lit(5)));
		
		//subs.put("x", 7);
		Expression e6 = add(mult(lit(9),lit(3)), add(lit(7), varExp("x")));
		
		ArrayList<Expression> expressionList = new ArrayList<Expression>();
		expressionList.add(e1);
		expressionList.add(e2);
		expressionList.add(e3);
		expressionList.add(e4);
		expressionList.add(e5);
		expressionList.add(e6);
		for(Expression e: expressionList){
			System.out.println("This value " + e.show() + ":" + e.evaluate(subs));
			System.out.println(e.size());
			System.out.println(e.height());
			System.out.println(e.countOperator());
		}
		
		
		
	}

}
