import java.awt.Color;

public class Venus extends Planets{

	Venus(int centerX, int centerY){
		this.orbitRadius = 100; 
		this.x = centerX - (orbitRadius - 20); 
		this.y = centerY - (orbitRadius - 20); 
		this.radius = 12; 
		this.diameter = radius*2; 
		this.degrees = 0; 
		this.color = Color.orange;
		this.speed = (float) (Math.sqrt((g * mass)/orbitRadius));
	}
}
