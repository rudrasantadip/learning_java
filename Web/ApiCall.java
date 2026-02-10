import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class ApiCall {

    public static void main(String[] args) {
        try {
            // Base URL
            String baseUrl = "https://reqres.in/api/users";
        

            // Query parameters
            String page = "2";

            // Encode parameters to ensure they are URL safe
            String queryParams = String.format("page=%s",
                    URLEncoder.encode(page, "UTF-8")
                  );

            // Complete URL
            String completeUrl = baseUrl + "?" + queryParams;

            // Create a URL object
            URL url = new URL(completeUrl);

            // Open a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method
            connection.setRequestMethod("GET");

            // Set request properties (optional)
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            // Close the streams
            in.close();

            // Print the response
            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
