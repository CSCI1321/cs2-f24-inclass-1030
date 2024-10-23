package cs2.particles;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;

public class ParticleSystemApp extends Application {
  Vec2 wind = new Vec2();
  public void start(Stage primaryStage) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    primaryStage.setTitle("Particles!");
    primaryStage.setScene(scene);
    primaryStage.show();

    GraphicsContext g = canvas.getGraphicsContext2D();
    canvas.requestFocus();

    ArrayList<ParticleSystem> ps = new ArrayList<ParticleSystem>();
     //new ParticleSystem(new Vec2(300,300));

    canvas.setOnMouseClicked((MouseEvent e) -> {
      Vec2 pt = new Vec2(e.getX(), e.getY());
      ps.add(new ParticleSystem(pt));
    });
    canvas.setOnMouseMoved((MouseEvent e) -> {
      wind = new Vec2(e.getX() / 300 - 1, 0);
    });
    
    Image img = new Image("file:Star.png");

    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        g.setFill(Color.WHITE);
        g.fillRect(0, 0, 600, 600);

        for(ParticleSystem p : ps) {
          p.addParticle();
          p.display(g);
          p.update();
          p.addForce(new Vec2(0,0.1));
          p.addForce(wind);
        }

        g.drawImage(img, 100,100);
      }
    };
    timer.start();
  }
}

