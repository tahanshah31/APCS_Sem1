
import pkg.*;
import java.util.*;

class wizards {
	public static void main(String args[]) {
		Warrior[] war1 = new Warrior[100];
		for(int count = 0; count < 100; count ++){
			war1[count] = new Warrior();
		}
		
		Wizard[] wiz1 = new Wizard[100];
		for(int count = 0; count < 100; count ++){
			wiz1[count] = new Wizard();
		}
		
		int Wardead = 0;
		int Wizdead = 0;
		
		while(Wardead < 100 && Wizdead < 100) {
			Warrior War = war1[Wardead];
			Wizard Wiz = wiz1[Wizdead];
			
			Wiz.attack(War);
			
			if(War.isDead()){
				Wardead ++;
			}
			
			if(Wardead < 100){
				War.attack(Wiz);
				
				if(Wiz.isDead()){
					Wizdead++;
				}
			}
			
		}
		
		int aliveWarriors = 100 - Wardead;
		int aliveWizards = 100 - Wizdead;
		
		if(aliveWarriors > 0){
			System.out.println("Warriors won with " + aliveWarriors + " left");
		}
		else if (aliveWizards > 0){
			System.out.println("Wizards won with " + aliveWizards + " left");
		}
	}
}
