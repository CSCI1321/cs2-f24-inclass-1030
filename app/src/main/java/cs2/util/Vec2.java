package cs2.util;

public class Vec2 {
  private double x;
  private double y;
  public Vec2() {
    x = 0; y=0;
  }
  public Vec2(double _x, double _y) {
    this.x = _x; this.y = _y;
  }
  public static Vec2 random(double span) {
    Vec2 ret = new Vec2();
    ret.x = Math.random() * 2*span - span;
    ret.y = Math.random() * 2*span - span;
    return ret;
  }
  public double getX() { return this.x; }
  public double getY() { return this.y; }
  public Vec2 add(Vec2 other) {
    return new Vec2(this.x + other.x, this.y + other.y);
  }
}
