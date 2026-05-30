import java.awt.Color;

public class Mars extends Planets{
	
	Mars(int centerX, int centerY){
		this.orbitRadius = 175; 
		this.x = centerX - (orbitRadius - 20); 
		this.y = centerY - (orbitRadius - 20); 
		this.radius = 10; 
		this.diameter = radius*2; 
		this.degrees = 0; 
		this.color = Color.red; 
		this.speed = (float) (Math.sqrt((g * mass)/orbitRadius));
	}

}
