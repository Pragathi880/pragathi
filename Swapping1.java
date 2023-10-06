class Swapping1{
	public static void main(String args[]){
	int a=10;
	int b=20;
	System.out.println("value of a before swapping" +a);
	System.out.println("value of b before swapping" +b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("value of a after swapping" + a);
	
	System.out.println("value of b after swapping" +b);
	}
}