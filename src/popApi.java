import org.json.JSONArray;
import org.json.JSONObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;

class api{

    public static String parse(String response){
        JSONObject j1=new JSONObject(response);

        JSONArray array=j1.getJSONArray("data");

        for(int i=0;i<array.length();i++){

            JSONObject j2=array.getJSONObject(i);
            String idNation=j2.getString("ID Nation");
            String nation=j2.getString("Nation");
            int idYear=j2.getInt("ID Year");
            int Year=j2.getInt("Year");

            System.out.println("ID Nation: "+idNation+" "+" Nation: "+nation+" "+" ID Year: "+idYear+" "+" Year: "+Year);

        }
        return null;
    }
}
public class popApi {
    public static void main(String[] args) {
        HttpClient client=HttpClient.newHttpClient();

        HttpRequest request=HttpRequest.newBuilder().uri(URI.create("https://datausa.io/api/data?drilldowns=Nation&measures=Population")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(api::parse)
                .join();

    }

}
