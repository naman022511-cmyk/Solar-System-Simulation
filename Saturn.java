import java.awt.Color;

public class Saturn extends Planets{
	
	Saturn(int centerX, int centerY){
		this.orbitRadius = 290; 
		this.x = centerX - (orbitRadius - 20); 
		this.y = centerY - (orbitRadius - 20); 
		this.radius = 22; 
		this.diameter = radius*2; 
		this.degrees = 0; 
		this.color = new Color(215, 180, 130); 
		this.speed = (float) (Math.sqrt((g * mass)/orbitRadius));
		
	}

}
