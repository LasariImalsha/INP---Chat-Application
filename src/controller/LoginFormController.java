package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public JFXTextField txtUserName;
    public static String userName;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equals("Client1")){
            Stage stage = (Stage) txtUserName.getScene().getWindow();
            stage.close();
            Stage stage1 = new Stage();
            stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Client1Form.fxml"))));
            stage1.setTitle("Let's Chat ");
            stage1.setResizable(false);
            stage1.centerOnScreen();
            stage1.show();
        }

        else if (txtUserName.getText().equals("Server")) {
            Stage stage2 = new Stage();
            stage2.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ServerForm.fxml"))));
            stage2.setTitle("Let's Chat");
            stage2.setResizable(false);
            stage2.centerOnScreen();
            stage2.show();
        }
    }
}
