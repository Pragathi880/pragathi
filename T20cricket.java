class T20cricket{
	//Literal way of assigning values
	static String match="India vs Ireland";
        static float overs=20.0f;
	static String stadium="Eden Gardens in Kolkata";
	static String batsman="K L Rahul";
	static String bowler="MR Adair";
	static int total_runs=110;
	static String india_captain="Rohith Sharma";
	static String ireland_captain="Andrew Balbirnie";
	static byte wicket=8;
	static boolean india_won=true;
	static String matchBetween;
	static byte numberOfBatsmanInIndia;
	static byte numberOfBowlersInIndia;
	static byte extra_players;
	static String locationOfStadium;
	static float numberOfOvers;
	static byte numberOfBatsmanInEngland;
	static byte numberOfBowlersInEngland;
	static byte wickets;
	static boolean england_won; 
	public static void main(String []args){
	
	//by using reference
	T20cricket.matchBetween="India vs England";
	T20cricket.numberOfBatsmanInIndia=7;
	T20cricket.numberOfBowlersInIndia=4;
	T20cricket.extra_players=4;
	T20cricket.locationOfStadium="Wankhede Stadium in Mumbai";
	T20cricket.numberOfOvers=20.0f;
	T20cricket.numberOfBatsmanInEngland=6;
	T20cricket.numberOfBowlersInEngland=5;
	T20cricket.wickets=5;
	T20cricket.england_won=false;
	
	System.out.println("by literal way");
	System.out.println(T20cricket.match);
	System.out.println(T20cricket.overs);
	System.out.println(T20cricket.stadium);
	System.out.println(T20cricket.batsman);
	System.out.println(T20cricket.bowler);
	System.out.println(T20cricket.total_runs);
	System.out.println(T20cricket.india_captain);
	System.out.println(T20cricket.ireland_captain);
	System.out.println(T20cricket.wicket);
	System.out.println(T20cricket.india_won);

	System.out.println("by reference way");	
        System.out.println(T20cricket.matchBetween);
	System.out.println(T20cricket.numberOfBatsmanInIndia);
	System.out.println(T20cricket.numberOfBowlersInIndia);
	System.out.println(T20cricket.extra_players);
	System.out.println(T20cricket.locationOfStadium);
	System.out.println(T20cricket.numberOfOvers);
	System.out.println(T20cricket.numberOfBatsmanInEngland);
	System.out.println(T20cricket.numberOfBowlersInEngland);
	System.out.println(T20cricket.wickets);
	System.out.println(T20cricket.india_won);









	}
}