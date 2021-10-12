package precourse_java;

public class Typecasting {
	
	public static void main(String args[]) {
		//widening or implicit or automatic typecasting
		short old_age=29;
		int new_age=old_age;
		
		System.out.println(old_age);
		System.out.println(new_age);
		
		int salary=10000;
		double new_salary=salary;
		
		System.out.println(salary);
		System.out.println(new_salary);
		// Explicit or narrowing typecasting
		
		int cash=20000;
		short new_cash= (short)cash;
		
		System.out.println(cash);
		System.out.println(new_cash);
		
		int money=200000000;
		short new_money= (short)money;
		
		System.out.println(money);
		System.out.println(new_money); // It will gives you a GARBAGE Value
		
		float degree=20.95f;
		int new_degree= (int)degree;
		
		System.out.println(degree);
		System.out.println(new_degree);// 20.95=> 20
		
	}

}
