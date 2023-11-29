import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;

class ApiData{
    public static String parse(String data){

        JSONObject object1=new JSONObject(data);

        String obj1= object1.getString("name");
        System.out.println("Your name: "+ obj1.toUpperCase(Locale.ROOT));

        JSONArray array= new JSONArray(object1.getJSONArray("country"));
        for(int i=0;i<array.length();i++){

            //Calling JSonobject to get its Jsonarray
            JSONObject object2=array.getJSONObject(i);
            String cID= object2.getString("country_id");
            float prob= object2.getFloat("probability");

            System.out.println("Country ID: " + cID +"  "+"Probability: "+ prob);
        }
        return null;
    }
}
class Clinetapi{
    public static void main(String[] args) throws URISyntaxException {

      //Setup client
       HttpClient client=HttpClient.newHttpClient();

       //Setup HTTP request (must)
       HttpRequest request= HttpRequest.newBuilder(new URI("https://api.nationalize.io?name=nathaniel")).build();

       //Send synchronized req
       client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
               .thenApply(HttpResponse::body)
               //.thenAccept(System.out::println)
               //.thenApply(ApiData::parse)
               .join();
    }

}

public class apiRest {

    public static void main(String[] args) throws IOException {
        ApiData a=new ApiData();

        //Var declaration
        //used in case of just getting api data
        String data;
        StringBuffer strData = new StringBuffer();

        //Connection setup with url
        URL url = new URL("https://dummyjson.com/carts");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        int rCode = connection.getResponseCode();
        //connection.setConnectTimeout(4000);


        //Input reader
        BufferedReader read = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        if (rCode > 200) {
            System.out.println(connection.getErrorStream());
        } else {

                if ((data = read.readLine()) != null) {
                    System.out.println(strData.append(data));
                }
           // a.parse(read.readLine());
        }
    }

}


