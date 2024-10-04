package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

public class FirstWindow extends Application{
  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(400,600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setScene(scene);
    primaryStage.setTitle("My First Window");
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();
    g.setFill(Color.rgb(50,210,80));
    g.fillRect(100,100, 200,400);

    g.setFill(Color.NAVAJOWHITE);
    g.fillOval(25,100, 150,200);
    g.fillOval(225,100, 150,200);

    g.setFill(Color.BLACK);
    g.fillOval(100,125, 50,50);
    g.fillOval(250,125, 50,50);

    g.setLineWidth(45);
    g.setLineCap(StrokeLineCap.BUTT);
    g.strokeLine(150,400, 250,400);

    g.setFill(Color.BLACK);
    g.setLineWidth(1);
    g.strokeArc(150,300, 100,50, 180, 180, ArcType.ROUND);

    g.setLineWidth(2);
    for(int x=0; x<400; x++) {
      g.setStroke(Color.BLACK);
      g.strokeLine(x,0, x,600);
    }

  }
}
