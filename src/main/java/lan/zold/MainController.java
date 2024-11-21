package lan.zold;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void OnClickExitButton(ActionEvent event) {
        Platform.exit();
        
    }

    @FXML
    void onClickAddButton(ActionEvent event) {
        App.setRoot("createScene");
    }

    @FXML
    void onClickIndexButton(ActionEvent event) {
        App.setRoot("indexScene");
    }

}
