package api;

import com.aspire.portal.web.security.client.GenerateSignature;

public class Signer {
	private String qstr;
	final private String pos = "private3.key";
	public Signer(String q) {
		qstr = q;
	}
	public String get() {
		GenerateSignature gs = new GenerateSignature();
		String sign = gs.sign(qstr, pos);
		return sign;
	}
}
