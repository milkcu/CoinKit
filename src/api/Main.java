package api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {
	public static void main(String args[]) {
		String mobile;
		String coinnum;
		String dealtime;
		String dealno;
		if(args.length == 0) {
			mobile = "18353115149";
			coinnum = "1";
			dealtime = getTime();
			dealno = dealtime + getRand();
		} else {
			mobile = args[0];
			coinnum = args[1];
			dealtime = args[2];
			dealno = args[3];
		}
		
		System.out.println("begin");
		Giver giver = new Giver(mobile, coinnum, dealtime, dealno);
		String r = giver.run();
		//String r = mobile + "/" + coinnum + "/" + dealtime + "/" + dealno;
		System.out.println(r);
		System.out.println("end");
	}
	public static String getTime() {
		DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
		String time = df.format(new Date());
		return time;
	}
	public static int getRand() {
		int min = 10000000;
		int max = 99999999;
		Random random = new Random();
		return random.nextInt(max) % (max-min+1) + min;
	}
}
