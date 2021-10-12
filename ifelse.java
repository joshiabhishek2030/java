package precourse_java;

public class ifelse {

	public static void main(String args[]) {
		int num1=100;
		int num2=200;
		
		if (num1==num2) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		System.out.println(100==200);//false
		System.out.println(200==200);//true
		System.out.println(100>2);//true
		System.out.println(100<20);//false
		System.out.println(100<100);//false
		System.out.println(100<=1000);//true
		System.out.println(1000>=200);//true
		System.out.println(100!=200);//true
		System.out.println(100!=100);//true
	}
}

/* if (condition){
 *    // perform action1}
 *    else{
 *    // perform action2
 *    }
 * 
 * 
 * 
 * if (name_is_rahul){
 *        // Raise your Hand
 *        }
 *        
 * if (Done_your_homework){
 *       //Raise your Hand
 *       action1
 *       } else { leave the meating 
 *       }      
 * 
 * 
 */
