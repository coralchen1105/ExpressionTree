package ExpressionPack;

import static ExpressionPack.Expression.add;
import static ExpressionPack.Expression.lit;
import static ExpressionPack.Expression.mult;
import static ExpressionPack.Expression.varExp;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestExpression {

	@Test
	public void test() {
		
		Subs subs = new Subs();
		
		subs.put("x", 7);
		assertEquals(41, add(mult(lit(9),lit(3)), add(lit(7), varExp("x"))));
		
		fail("Not yet implemented");
	}

}
