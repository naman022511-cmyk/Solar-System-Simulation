import java.awt.Color;

public class Uranus extends Planets{
	Uranus(int centerX, int centerY){
		this.orbitRadius = 330; 
		this.x = centerX - (orbitRadius - 20); 
		this.y = centerY - (orbitRadius - 20); 
		this.radius = 19; 
		this.diameter = radius*2; 
		this.degrees = 0; 
		this.color = new Color(155, 220, 230);
		this.speed = (float) (Math.sqrt((g * mass)/orbitRadius));
	}

}
