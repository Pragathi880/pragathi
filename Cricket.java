class Cricket{
	public static void main(String []args){
	String match="India VS SouthAfrica";
        float overs=20.0f;
	String Stadium="Eden Gardens";
	String Batsman="Shubaman Gill";
        String Bowler="Anrich Nortije";
        int total_runs=137;
        int wicket=5;
        if (wicket==5){
		System.out.println("wicket is 5");
	}
	else {
	        System.out.println(wicket= 7);
	     }
	if (wicket %2==0){
                  System.out.println("wicket is even");
        }
        else{
		System.out.println("wicket is odd");
	}
        {
	int count = 0;

        while (total_runs != 0) {
        total_runs = total_runs/10;
         ++count;
       }

    System.out.println("Number of digits: " + count);
  }
	boolean india_won= false;
	String summaryIndia="133/9";
	String sumSa = "138/8";
	System.out.println(match);
	System.out.println(overs);
	System.out.println(Stadium);
	System.out.println(Batsman);
	System.out.println(Bowler);
	System.out.println(total_runs);
	System.out.println(wicket);
	System.out.println(summaryIndia);
	System.out.println(sumSa);
 }
}