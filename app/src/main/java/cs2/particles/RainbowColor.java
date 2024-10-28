package cs2.particles;

import javafx.scene.paint.Color;

public class RainbowColor implements ColorPattern {
  private int hue = 0;
  public Color getColor() {
    hue += 2;
    return Color.hsb(hue, 0.9, 0.9);
  }
  
}
