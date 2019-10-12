package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int HP=100;
	
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		Random ran=new Random();
		int bossHP=500;
		
		// 4. Create a variable to hold the damage the player's attack does each round
		int dmg1=ran.nextInt();
		int dmg2=ran.nextInt();
		
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int bossdmg=ran.nextInt(51);
		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(HP>0 && bossHP>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		int yell=ran.nextInt(101);
		int kamehameha=ran.nextInt(2000000000);
			String answer=JOptionPane.showInputDialog("do you want to use yell or kamehameha");
			
		// 9. If they typed in "yell":
			if(answer.equals(yell));{
				
		
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			dmg1=ran.nextInt(101);
			//-- Subtract that number from the dragon's health variable
			dmg1-=bossHP;
			}
			
		// 10. If they typed in "kick":
			if(answer.equals(kamehameha)){
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			dmg2=ran.nextInt(2000000001);
				
			//-- Subtract that number from the dragon's health variable
			dmg2-=bossHP;
			
			}
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
			bossdmg=ran.nextInt(51);		
		// 12. Subtract this number from the player's health
			bossdmg-=HP;
		
		}
		
		// 13. If the user's health is less than or equal to 0
		if(HP==0){
		
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null, "YOU LOST");
			
		}
		// 14. Else if the dragon's health is less than or equal to 0
		if(bossHP==0){
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showMessageDialog(null, "YA RICH NOW");
		}
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
	}
	}

