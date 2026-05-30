import java.awt.Color;

public class Earth extends Planets{
	
	Earth(int centerX, int centerY){
		this.orbitRadius = 130; 
		this.x = centerX - (orbitRadius - 20); 
		this.y = centerY - (orbitRadius - 20); 
		this.radius = 13; 
		this.diameter = radius*2; 
		this.degrees = 0; 
		this.color = Color.blue; 
		this.speed = (float) (Math.sqrt((g * mass)/orbitRadius));
	}

}
