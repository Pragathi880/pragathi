class Operators{
	public static void main(String []args){
	byte price1 = -12;
	int price2 = 244;
	short price3 = 654;
	long price4 = 4575539l;
	float price5 = 68.0f;
	double price6 = 85.82628916;
	double total;
	double division;
	double modulous;
	
	total=(price1 + price2 + price3 + price4 + price5 + price6);
	division=(price3 / price2);
	modulous=(price4 % price6);
	System.out.println("sum of all the prices:" + (price1 + price2 + price3 + price4 + price5 + price6));
	System.out.println("subtraction of all prices:" + ( price1 - price2 - price3 - price4 - price5 - price6));
	System.out.println("multiplication of all prices:" + (price1 * price2 * price3 * price4 * price5 * price6));
	System.out.println("division of two prices:" + (price3 / price2));
	System.out.println("division of two prices:" + (price1 / price4));
	System.out.println("mod of two prices:" + (price4 % price6));
	System.out.println("mod of two prices:" + (price4 % price3));
	
	//check weather the sum is equal to even or odd
	System.out.println("Check weather the sum is equal to even or add:");
	if(total %2==0){
		System.out.println("the sum of all price is even");
	}
	else{
		System.out.println("the sum of all price is odd");
	}
	
	
	
	//check all the values are greater than or equal to zero
	System.out.println("Check all the values are graater than or equal to zero:");
	if(price1>=0 || price2>=0 || price3>=0 || price4>=0 || price5>=0 || price6>=0 ){
		System.out.println("atleast one of the value is greater than zero");
	}
	else if(price1>=0 && price2>=0 && price3>=0 && price4>=0 && price5>=0 && price6>=0){
		System.out.println("price is greater than or equal to zero ");
	}
    else{
        System.out.println("neither price is equal to zero");
	}		
	
	
	//check all the values are lesserthan or equal to zero
	System.out.println("Check all the values are lesserthan or equal to zero:");
	if(price1<=0 || price2<=0 || price3<=0 || price4<=0 || price5<=0 || price6<=0 ){
		System.out.println("atleast one of the value is lesser or equal to zero");
	}
	else if(price1<=0 && price2<=0 && price3<=0 && price4<=0 && price5<=0 && price6<=0){
		System.out.println("price is lesser than or equal to zero ");
	}
    else{
        System.out.println("neither price is equal to zero");
	}	

    //check all the values are equal to zero
	System.out.println("Check all the values are equal to zero:");
    if(price1==0 || price2==0 || price3==0 || price4==0 || price5==0 || price6==0 ){
		System.out.println("atleast one of the value is equal to zero");
	}
	else if(price1==0 && price2==0 && price3==0 && price4==0 && price5==0 && price6==0){
		System.out.println("price is  equal to zero ");
	}
    else{
        System.out.println("neither price is equal to zero");
	}	

    //compare the division and module result
	System.out.println("Compare the division and modulous:");
	if(division==modulous){
		System.out.println("division is equal to modulous");
	}
	else{
		System.out.println("division is not equal to modulous");
	}
		
	
	}


}