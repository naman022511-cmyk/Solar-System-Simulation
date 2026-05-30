import java.awt.Color;

public class Jupiter extends Planets{
	
	Jupiter(int centerX, int centerY){
		this.orbitRadius = 235; 
		this.x = centerX - (orbitRadius - 20); 
		this.y = centerY - (orbitRadius - 20); 
		this.radius = 25; 
		this.diameter = radius*2; 
		this.degrees = 0; 
		this.color = new Color(205, 133, 63);
		this.speed = (float) (Math.sqrt((g * mass)/orbitRadius));
	}

}
