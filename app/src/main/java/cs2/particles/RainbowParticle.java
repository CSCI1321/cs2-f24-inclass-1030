package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.paint.Color;

public class RainbowParticle extends RoundParticle {
  private int hue = 0;

  public RainbowParticle(Vec2 p, Vec2 v) {
    super(p,v);
  }

  @Override
  public void update() {
    super.update();
    //this.col = Color.hsb(hue, 0.9, 0.9);
    hue += 2;
  }

}
