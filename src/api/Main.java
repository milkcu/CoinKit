package api;

public class Main {
	public static String main(String args[]) {
		Giver giver = new Giver(args[0], args[1], args[2], args[3]);
		return giver.run();
	}
}
