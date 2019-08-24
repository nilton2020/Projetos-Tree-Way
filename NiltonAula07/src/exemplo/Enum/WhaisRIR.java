package exemplo.Enum;

public enum WhaisRIR {
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	APNIC("whois.apnic.net"),
	AFRINIC("whois.afrinic.net"),
	LACNIC("whois.lacnic.net"),
	JPNIC("whois.nic.ad.jp"),
	KRNIC("whois.NIC.OR.KR"),
	CNNIC("ipwhois.cnnic.cn"),
	UNKNOWN("");
	
	private String url;
	
	WhaisRIR(String url) {
		this.url = url;
	}
	
	public String url() {
		return url;
	}
}
