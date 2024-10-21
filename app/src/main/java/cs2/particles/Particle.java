package cs2.particles;
import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Particle {
  private Vec2 pos;
  private Vec2 vel;
  private Color col;
  private double sz;

  public Particle() {
    pos = new Vec2();
    vel = new Vec2();
    col = Color.RED;
    sz = 20;
  }
  public Particle(Vec2 p, Vec2 v) {
    pos = p;
    vel = v;
    col = Color.rgb(200,50,50,0.4);
    sz = 20;
  }

  public void display(GraphicsContext g) {
    g.setFill(this.col);
    g.fillOval(pos.getX(),pos.getY(), this.sz,this.sz); 
  }

  public void update() {
    this.pos.addThis(this.vel);
  }
  public void addForce(Vec2 f) {
    this.vel.addThis(f);
  }

}
