package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.File;
import java.util.Scanner;

public class Fractals extends Application{

  public void drawCircle(GraphicsContext g, double x, double y, double r) {
    g.strokeOval(x-r, y-r, r*2, r*2);
    if(r > 10) {
      drawCircle(g, x-r, y, r/2);
      drawCircle(g, x+r, y, r/2);
      drawCircle(g, x, y-r, r/2);
      drawCircle(g, x, y+r, r/2);
    }
  }

  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setScene(scene);
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    drawCircle(g, 300, 300, 150);

  }
}
