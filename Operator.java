class Operator{
      public static void main(String args[]){
      int price1 = 10;
      int price2 = 35;
      int price3 = 39;
      int price4 = 55;
      System.out.println("sum of the price values:"+(price1+price2+price3+price4));
      System.out.println("subtraction of price values:"+(price1-price2-price3-price4));
      System.out.println("multiplication of price values:"+(price1*price2*price3*price4));
      System.out.println("division of price values:"+(price4/price1));
      System.out.println("mod of two numbers:"+(price2%price3));

     if(price1==price2){
        System.out.println("the price1 and price2 are equal");
        }
     else{
        System.out.println("the price1 and price2 are not equal");
        }
      if(price3>=0){
         System.out.println("print3 is greater than or equal to zero");
        }
      else{
         System.out.println("print3 is not greater than or equal to zero");
          }
      if(price2<=10){
          System.out.println("print2 is less or equal to 10");
         }
        else{
          System.out.println("print2 is not less or equal to 10");
         }
      if(price1+price2+price3+price4==4){
          System.out.println("Totalprice is equal to four");
        }
      else{
          System.out.println("totalprice is not equal to four");
       }
      }
}
