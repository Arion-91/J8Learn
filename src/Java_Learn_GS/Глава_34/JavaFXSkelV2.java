package Java_Learn_GS.Глава_34;/**
 * Created by arion on 26.10.2015.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkelV2 extends Application {

    public static void main(String[] args) {
        System.out.println("Запуск JavaFX-приложения.");
        launch(args);
    }

    public void init() {
        System.out.println("В теле метода init().");
    }

    public void start(Stage myStage) {
        System.out.println("В теле метода start().");
        myStage.setTitle("JavaFX Skeleton.");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        myStage.show();
    }

    public void stop() {
        System.out.println("В теле метода stop().");
    }
}
