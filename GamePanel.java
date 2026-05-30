import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener{
	
	public static int SCREEN_WIDTH = 1200;
	public static int SCREEN_HEIGHT = 800;
	
	public int centerX = SCREEN_WIDTH/2;
	public int centerY = SCREEN_HEIGHT/2;
	
	Sun sun = new Sun();
	Mercury mercury;
	Venus venus;
	Earth earth;
	Mars mars;
	Jupiter jupiter;
	Saturn saturn;
	Uranus uranus;
	Neptune neptune;
	//Declaring all the planets and stars
	
	
	Planets[] planet = new Planets[8];
	
	Timer timer;
	
	GamePanel(){
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		
		mercury = new Mercury(centerX, centerY);
		venus = new Venus(centerX, centerY);
		earth = new Earth(centerX, centerY);
		mars = new Mars(centerX, centerY);
		jupiter = new Jupiter(centerX, centerY);
		saturn = new Saturn(centerX, centerY);
		uranus = new Uranus(centerX, centerY);
		neptune = new Neptune(centerX, centerY);
		
		Planets[] p = {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};
		
		setPlanet(p);
		this.setBackground(Color.black);
		this.setOpaque(true);
		
		timer = new Timer(1000/25, this);
		startGame();
	}
	
	public void setPlanet(Planets...planets) {
		for(int i = 0; i < planets.length; i++) {
			planet[i] = planets[i];
		}
	}
	
	
	public void startGame() {
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.yellow);
		g2D.fillOval(centerX-sun.radius, centerY-sun.radius, sun.width, sun.height);
		
		//draws the orbits
		for(int i = 0; i < planet.length; i++) {
			g2D.setColor(Color.white);
			g2D.drawOval(centerX - planet[i].orbitRadius, centerY- planet[i].orbitRadius, planet[i].orbitRadius*2, planet[i].orbitRadius*2);
			
			g2D.setColor(planet[i].color);
			g2D.fillOval(planet[i].x, planet[i].y, planet[i].diameter, planet[i].diameter);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Moves the planets
		for(int i = 0; i < planet.length; i++) {
		
			planet[i].degrees += planet[i].speed/planet[i].orbitRadius;
			//divide by the orbit radius to make the speed of a planet relative to its orbit.
			
			double radian = (Math.PI/180) * planet[i].degrees;
			
			//Circular motion adapted by Stack Overflow
			//https://stackoverflow.com/questions/25923480/simple-circle-rotation-simulate-motion
			
			//Finds how far away the object is left, right. Then multiplies it by the orbit radius of the planet to create circular motion
			planet[i].x = (int)(centerX + Math.cos(radian) * planet[i].orbitRadius)-(planet[i].radius);
			//Finds how far away the object is up, down. Then multiplies it by the orbit radius of the planet to create circular motion
			planet[i].y = (int)(centerY + Math.sin(radian) * planet[i].orbitRadius)-(planet[i].radius);
		}
		repaint();
	}

}
