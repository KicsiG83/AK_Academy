public class Program {

static public void main(String[] args) {
	mnb.MNBArfolyamServiceSoapImpl impl = new mnb.MNBArfolyamServiceSoapImpl ();
	mnb.MNBArfolyamServiceSoap service = impl.getCustomBindingMNBArfolyamServiceSoap();
try {
	String resp = service.getCurrencies();
			System.out.println(resp);
} catch (Exception e) {
	System.err.print(e);
}
}
}