package cs2.particles;

import java.util.ArrayList;
import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ParticleSystem {
  private ArrayList<Particle> parts = new ArrayList<Particle>();
  private Vec2 origin;

  public ParticleSystem() {
    origin = new Vec2();
  }
  public ParticleSystem(Vec2 o) {
    origin = o;
  }

  public void addParticle() {
    //Image img = new Image("file:Star.png");
    //ImageParticle p = new ImageParticle(this.origin.clone(), Vec2.random(1), ParticleSystemApp.img);
    //RainbowParticle p = new RainbowParticle(this.origin.clone(), Vec2.random(1));
    //parts.add(0,p);
    
    Particle p = null;
    if(Math.random() < 0.5) {
      p = new RoundParticle(this.origin.clone(), Vec2.random(1));
    } else {
      p = new SquareParticle(this.origin.clone(), Vec2.random(1));
    }
    parts.add(p);
    
  }
  public void display(GraphicsContext g) {
    for(int i=0; i<parts.size(); i++) {
      parts.get(i).display(g);
    }
  }
  public void update() {
    //System.out.println(this.parts.size());
    for(Particle p : this.parts) {
      p.update();
    }
  }
  public void addForce(Vec2 f) {
    for(Particle p : parts) { p.addForce(f); }
  }



}
