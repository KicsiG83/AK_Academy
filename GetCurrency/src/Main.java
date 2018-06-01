import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		
//		// Getting visitor IP address
//		String ip = request.getRemoteAddr();
//
//		// Setting URL
//		String url_str = "https://v3.exchangerate-api.com/local/YOUR-API-KEY/USD/" + ip;
//
//		// Making Request
//		URL url = new URL(url_str);
//		HttpURLConnection request = (HttpURLConnection) url.openConnection();
//		request.connect();
//
//		// Convert to JSON
//		JsonParser jp = new JsonParser();
//		JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
//		JsonObject jsonobj = root.getAsJsonObject();
//
//		// Accessing object
//		String req_result = jsonobj.get("result").getAsString();
//
//		// If you want to display the currency's symbol in HTML:
//		String symbol_html = "";
//		String symbol_codes = jsonobj.get("currency_symbol").getAsString();
//		String[] symbol_characters = symbol_codes.split(",");
//		for(int i=0; i < symbol_characters.length; i++) {
//			symbol_html = symbol_html + "&#x"+symbol_characters[i]+";";
//		}
//		
	}
	
}
