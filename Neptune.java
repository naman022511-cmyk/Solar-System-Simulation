import java.awt.Color;

public class Neptune extends Planets{
	
	Neptune(int centerX, int centerY){
		this.orbitRadius = 375; 
		this.x = centerX - (orbitRadius - 20); 
		this.y = centerY - (orbitRadius - 20); 
		this.radius = 18; 
		this.diameter = radius*2; 
		this.degrees = 0; 
		this.color = new Color(60, 100, 200);
		this.speed = (float) (Math.sqrt((g * mass)/orbitRadius));
	}

}
