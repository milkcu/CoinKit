package api;

public class Giver {
	private String mobile;
	private String coinnum;
	private String dealtime;  // yyyyMMddhhmmss
	private String dealno;  // yyyyMMddhhmmss + 88888888
	
	final private String company_code = "1008611";
	final private String method = "companyCreditHandsel";
	final private String portalID = "003";
	final private String portalType = "WWW";
	
	private String qstr;
	private String sign;
	private String param;
	private Signer signer;
	private Sender sender;
	
	public Giver(String p0, String p1, String p2, String p3) {
		mobile = p0;
		coinnum = p1;
		dealtime = p2;
		dealno = p3;
	}
	public String run() {
		qstr = "company_code=" + company_code + "&credit=" + coinnum + "&method=" + method + "&msisdn=" + mobile + 
				"&oper_time=" + dealtime + "&portalID=" + portalID + "&portalType=" + portalType + "&transactionID=" + dealno;
		//System.out.println(qstr);
		signer = new Signer(qstr);
		sign = signer.get();
		param = qstr + "&sign=" + sign;
		sender = new Sender(param);
		return sender.post();
	}
}
