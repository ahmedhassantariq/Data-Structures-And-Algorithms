import com.twilio.rest.api.v2010.account.Message;

public class Twilio {
    private static String authString = null;
    public static void sendAuth(){
        authString = random(5);//Set authString to random 5 integers
        final String ACCOUNT_SID = "ACaa35ae0a9089868d7a6ad6eddd9e501d";
        final String AUTH_TOKEN = "4328c5908585cc074c69f11343be361f";
        com.twilio.Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+923364042530"),
                new com.twilio.type.PhoneNumber("+14752552047"),
                authString).create();
        System.out.println(message.getSid());
    }
    public static String getAuthString(){
        return authString;
    }

    public static String random(int n) {
        {
            String AlphaNumericString = "0123456789";
            StringBuilder sb = new StringBuilder(n);
            for (int i = 0; i < n; i++) {
                int index
                        = (int) (AlphaNumericString.length()
                        * Math.random());
                sb.append(AlphaNumericString
                        .charAt(index));
            }
            return sb.toString();
        }
    }
}
