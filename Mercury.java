import java.awt.Color;

public class Mercury extends Planets{
	
	Mercury(int centerX, int centerY){
		this.orbitRadius = 80; 
		this.x = centerX - (orbitRadius - 20); 
		this.y = centerY - (orbitRadius - 20); 
		this.radius = 8; 
		this.diameter = radius*2; 
		this.degrees = 0; 
		this.color = Color.gray; 
		this.speed = (float) (Math.sqrt((g * mass)/orbitRadius));
	}

}
