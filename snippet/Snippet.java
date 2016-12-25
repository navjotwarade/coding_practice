package snippet;

public class Snippet {
	double getDistance(int rssi, int txPower) {
		 /* * RSSI = TxPower - 10 * n * lg(d) * n = 2 (in free space) * *
		 d = 10 ^ ((TxPower - RSSI) / (10 * n)) */
		// int d = 10 ^ ((txPower - rssi) / (10 * 2));
		// System.out.println("d:"+ d);
		 return Math.pow(10d, ((double) txPower - rssi) / (10 * 2));
		 }
	
	public static void main(String[] args) {
		Snippet snipet = new Snippet();
		double ans= snipet.getDistance(77,74);
		System.out.println("ans: "+ans);
	
		//stringops();
		}
	public static void stringops(){
		String s1 ="C3:9E:78:D3:26:50 -74 -72 1.3185726931675217";
		String [] data = s1.split(" ");
		for(String s:data)
		System.out.println(s);
		
	}

}

//-44, -59