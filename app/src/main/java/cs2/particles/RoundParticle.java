package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class RoundParticle extends Particle {
  public RoundParticle(Vec2 p, Vec2 v) {
    super(p, v);
  }
  @Override
  public void display(GraphicsContext g) {
    g.setFill(this.col);
    g.fillOval(pos.getX(),pos.getY(), this.sz,this.sz); 
  }

}
