class Array {
public static void main(String args[]){
  int integer[]={1,2,3,4,5};
  float deci[]={1.4f,5.4f,8.3f,6.4f,9.0f};
  boolean trueFalse[]={true,false};
  String fruits[]={"Apple","Orange","Mango","Grapes","guvava"};
  char name[]={'1','6','5','9','4'};
  
  for(int i=0;i<=integer.length-1;i++){
   System.out.println(integer[i]);
  }
  for (int j=0;j<=deci.length-1;j++){
   System.out.println(deci[j]);
  }
  for (int k = 0;k <=trueFalse.length-1;k++){
  System.out.println(trueFalse[k]);
  }
  for(int l=0;l<=fruits.length-1;l++){
  System.out.println(fruits[l]);
  }
  for(int m=0;m<=name.length-1;m++){
  System.out.println(name[m]);
  }
}
}