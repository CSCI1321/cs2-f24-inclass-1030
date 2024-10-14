package cs2.graphics;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Interaction extends Application {

  double oldx = 0;
  double oldy = 0;

  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setScene(scene);
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    canvas.requestFocus();

    canvas.setOnKeyPressed( (KeyEvent e) -> {
      if(e.getCode() == KeyCode.SPACE) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, 600,600);
      }
    });

    canvas.setOnMouseDragged( (MouseEvent e) -> {
      g.setStroke(Color.rgb(0,0,0, 1));
      g.strokeLine(oldx,oldy, e.getX(),e.getY());
      oldx = e.getX();
      oldy = e.getY();
    });


    
    AnimationTimer timer = new AnimationTimer() {
      double x = 300;
      double y = 300;
      double vx = Math.random() * 20 - 10;
      double vy = Math.random() * 20 - 10;
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, 600,600);

        g.setFill(Color.RED);
        g.fillOval(x,y, 100,100);
        
        if(x > 500 || x <= 0) {
          vx = -vx;
        }
        if(y > 500 || y <= 0) {
          vy = -vy;
        }

        x += vx;
        y += vy;

      }
    };
    timer.start();
      


  }
}
