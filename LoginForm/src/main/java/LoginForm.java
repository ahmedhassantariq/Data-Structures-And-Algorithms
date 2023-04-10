import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class LoginForm {
    public static Parent LoginView(){
        //Vbox and Properties
        VBox vBox = new VBox();
        vBox.setMaxSize(250,300);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(5);


        //Labels
        Label userLabel = new Label("UserName");
        Label passLabel = new Label("Password");
        Label veriLabel = new Label("Verification Code");veriLabel.setVisible(false);

        //Input Fields
        TextField userNameField = new TextField();
        PasswordField passwordField = new PasswordField();
        TextField verificationField = new TextField();verificationField.setVisible(false);

        //Button
        Button loginButton = new Button("Login");
        Button verifyButton = new Button("Verify");verifyButton.setVisible(false);



        //Login Button Function
        loginButton.setOnAction(e->{
            if(userNameField.getText().equals("amogus")&&passwordField.getText().equals("admin"))
            {
                veriLabel.setVisible(true);
                verificationField.setVisible(true);
                verifyButton.setVisible(true);
                Twilio.sendAuth();//Call Function to send message to phone
            }
        });
        //Verify Button Function
        verifyButton.setOnAction(e->{
            //Send authString via TEXT MESSAGE
            //Compares AuthString to Verification Field
            if(verificationField.getText().equals(Twilio.getAuthString())){
                System.out.println("Verification Complete");
            }
        });


        //Adding Labels, Fields and Button to Pane
        vBox.getChildren().addAll(
                userLabel,userNameField,
                passLabel,passwordField,
                veriLabel,verificationField,
                loginButton,
                verifyButton
        );


        return vBox;
    }
}
