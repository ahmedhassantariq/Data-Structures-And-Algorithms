import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Send an SMS message directly by calling HTTP endpoint.
 *
 * THIS CODE EXAMPLE IS READY BY DEFAULT. HIT RUN TO SEND THE MESSAGE!
 *
 * Send SMS API reference: https://www.infobip.com/docs/api#channels/sms/send-sms-message
 * See Readme file for details.
 */
public class InfoBip {

    private static final String BASE_URL = "https://yrgqw9.api.infobip.com";
    private static final String API_KEY = "App 964af81876a342dbdabeef8b9ad70e10-c86bcd0c-54f5-4ac3-948e-cc05438c1626";
    private static final String MEDIA_TYPE = "application/json";

    private static final String SENDER = "InfoSMS";
    private static final String RECIPIENT = "923364042530";
    private static final String MESSAGE_TEXT = "This is a sample message";


    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        String bodyJson = String.format("{\"messages\":[{\"from\":\"%s\",\"destinations\":[{\"to\":\"%s\"}],\"text\":\"%s\"}]}",
                SENDER,
                RECIPIENT,
                MESSAGE_TEXT
        );

        MediaType mediaType = MediaType.parse(MEDIA_TYPE);
        RequestBody body = RequestBody.create(mediaType, bodyJson);

        Request request = prepareHttpRequest(body);
        Response response = client.newCall(request).execute();

        System.out.println("HTTP status code: " + response.code());
        System.out.println("Response body: " + response.body().string());
    }

    private static Request prepareHttpRequest(RequestBody body) {
        return new Request.Builder()
                .url(String.format("%s/sms/2/text/advanced", BASE_URL))
                .method("POST", body)
                .addHeader("Authorization", API_KEY)
                .addHeader("Content-Type", MEDIA_TYPE)
                .addHeader("Accept", MEDIA_TYPE)
                .build();
    }
}