package cs2.particles;

import cs2.util.Vec2;
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

public class ParticleSystemApp extends Application {
  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setTitle("Particles!");
    primaryStage.setScene(scene);
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();
    canvas.requestFocus();

    Particle p = new Particle(Vec2.random(10), Vec2.random(10));
    
    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        p.display(g);
        p.update();
      }
    };
    timer.start();
  }
}

