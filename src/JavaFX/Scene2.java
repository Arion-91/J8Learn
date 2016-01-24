package JavaFX;

/**
 * Created by arion on 10.01.2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

class Scene2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Тестирование GUI-компонентов");

        Group root = new Group();
        Scene scene = new Scene(root, 300, 300, Color.LIGHTGREEN);

        CheckBox ckb = new CheckBox("Тестировать свойства");
        ckb.setLayoutX(20);
        ckb.setLayoutY(20);
        ckb.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Свойства, унаследованные от класса Node:\n свойство blendMode: " + ckb.blendModeProperty().getValue() + "\n"
                    + "Свойство boundsInLocal:" + ckb.boundsInLocalProperty().getValue());


            }
        });

        Button btnON = new Button();
        btnON.setLayoutX(20);
        btnON.setLayoutY(100);
        btnON.setText("Установить свойства");
        btnON.setStyle("-fx-font: bold italic 12pt Arial;-fx-text-fill: white;-fx-background-color: " +
                "#0000cc;-fx-border-width: 3px; -fx-border-color:#6699ff#000066 #000066 #6699ff;" );
        btnON.setPrefSize(200,30);
        btnON.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (ckb.selectedProperty().getValue()) {
                    ckb.setBlendMode(BlendMode.HARD_LIGHT);
                    Rectangle clip = new Rectangle(0, 15, 15, 20);
                    ckb.setCursor(Cursor.CROSSHAIR);
                    DropShadow effect = new DropShadow();
                    effect.setOffsetX(5);
                    effect.setOffsetY(10);
                    ckb.setEffect(effect);
                    ckb.setLayoutX(50);
                    ckb.setTranslateZ(-50);
                    ckb.setScaleX(1.8);
                    ckb.setPrefSize(150,50);
                    ckb.setTooltip(new Tooltip
                            ("Это переключатель тестирования свойств класса CheckBox"));
//                    Image im=new Image(this.getClass().getResource("image.png").
//                            toString());
//                    ImageView imv=new ImageView(im);
//                    imv.setFitHeight(50);
//                    imv.setFitWidth(50);
//                    ckb.setGraphic(imv);
                    ckb.setStyle("-fx-font: bold italic 10pt Helvetica;");
                    ckb.setAlignment(Pos.CENTER);
                    ckb.setContentDisplay(ContentDisplay.RIGHT);
                    ckb.setUnderline(true);
                    ckb.setWrapText(true);
                    ckb.setAllowIndeterminate(true);
                }
            }
        });

        root.getChildren().add(btnON);
        root.getChildren().add(ckb);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
