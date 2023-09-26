
import java.util.ArrayList;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/**
 *
 * @author HP
 */
public class Checkboard extends Application {

    @Override
    public void start(Stage primaryStage) {
        int counter = 0;
        int j = 7;
        int converter = 0;
        GridPane pane = new GridPane();

        ArrayList<Shape> Rect = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            Rect.add(new Rectangle(50, 50, 50, 50));

            if (converter % 2 == 0) {
                if (i % 2 == 0) {
                    Rect.get(i).setFill(Color.WHITE);

                } else {
                    Rect.get(i).setFill(Color.BLACK);

                }
            }

            if (converter % 2 != 0) {
                if (i % 2 == 0) {

                    Rect.get(i).setFill(Color.BLACK);

                } else {

                    Rect.get(i).setFill(Color.WHITE);

                }
            }

            //even block
            if (i == j && converter == 1) {
                converter = 0;
                j += 8;

            }

            //odd block
            if (i == j && converter == 0) {
                converter = 1;
                j += 8;
            }

        }

        for (int i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                if (j % 2 == 0) {
                    pane.add(Rect.get(counter), j, i);
                } else {
                    pane.add(Rect.get(counter), j, i);

                }
                counter++;

            }

        }

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle(
                "Checkboard");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
