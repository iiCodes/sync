import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;


public class APi {
    public static void main(String[] args) throws IOException {
        StringBuffer s = new StringBuffer();

        //OVER METHOD 1 TO GET DATA USING HTTP URL CONNECTION


        // 1- setting a connection using httpUrlConnection
        // 2- set request method
        // 3- handle input stream
        // 4- Show input as per data format


            URL url = new URL("https://jsonplaceholder.typicode.com/albums");
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            System.out.println("Port " + url.getPort());//Port show
            connect.setRequestMethod("GET");
            connect.setConnectTimeout(4000);
            connect.setReadTimeout(3000);

            //int status = connect.getResponseCode();

            BufferedReader input = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            String response;

            //response=input.readLine();
            //System.out.println(response);


            while ((response = input.readLine()) != null) {

                System.out.println(s.append(response));
            }
            parse(s.toString());


    }
        public static String parse(String data){
            JSONArray album=new JSONArray(data);

            for(int i=0 ;i<album.length();i++){

                JSONObject albums= album.getJSONObject(i);
                int id=albums.getInt("id");
                int userId=albums.getInt("userId");
                String title=albums.getString("title");
                System.out.println(id +" " +userId +" "+title);
            }

            return null;
        }





        //Method 2: Using HTTP client
       /* HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();

        client.sendAsync(request,HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();*/



    }


