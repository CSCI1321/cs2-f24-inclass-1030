package cs2.particles;

import javafx.scene.canvas.GraphicsContext;

public class SquareParticle extends Particle {
  public void displaySquare(GraphicsContext g) {
    g.setFill(this.col);
    g.fillRect(this.pos.getX(), this.pos.getY(), this.sz, this.sz);
  }
}
