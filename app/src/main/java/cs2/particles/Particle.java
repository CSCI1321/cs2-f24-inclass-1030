package cs2.particles;
import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Particle {
  protected Vec2 pos;
  protected Vec2 vel;
  protected Color col;
  protected double sz;

  /* 
  public Particle() {
    pos = new Vec2();
    vel = new Vec2();
    col = Color.RED;
    sz = 20;
  }*/
  public Particle(Vec2 p, Vec2 v) {
    pos = p;
    vel = v;
    col = Color.rgb(200,50,50,0.4);
    sz = 20;
  }

  public abstract void display(GraphicsContext g);

  public void update() {
    this.pos.addThis(this.vel);
  }
  public void addForce(Vec2 f) {
    this.vel.addThis(f);
  }

}
