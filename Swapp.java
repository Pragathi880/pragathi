class Swapp{
	public static void swap(int num1,int num2){
	System.out.println("before swap"+num1);
	System.out.println("before swap"+num2);
	
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	System.out.println("after swap"+num1);
	System.out.println("after swap"+num2);
	
	}
}