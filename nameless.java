/*
Richard L. Clarke
1/25/2017

1. Prompt player to enter their name
Confirm with y/n
At any time during the program when the user enters inaccurate input:
If incorrect choice is selected, display twice before exiting

Display Stage 1: Awakening You awaken in your bed. It's Monday. The time is 6am and you have to be at work at 9. What's the move?'
Prompt user to select a choice
(1) Pray 
You sit up and kneel facing your window as you pray for positivity and peace for the day. Should've prayed for a strategy guide to this game instead...
(2) Poop
You slide out of bed and saunter to the porcelain throne where you make your daily deposit to the doo doo demons. Unforunately, your body is still waking up so it's gonna be a while. But we have places to be and things to see! You decide to...
Push 
If only you waited a little longer! The Ben & Jerry's you had before bed propels the giant stool right to the exit of your booty, scraping your rectum on the way out. A blood coated turd slides out painfully. The doo doo demons, pleased with your blood oath, vow to watch over you today. But you must accept their guidance!
Accept 
This is the shit you asked for
Decline
Good job. No such thing as doo doo demons. But you've unlocked a bonus. Just finish the game and claim your prize!
Wait
It takes a while. In the meantime, you jump on twitter to look for saggy breast photos. An article appears on your feed about the Dangers of DooDoo Demons. As the poop approaches its birth you…
Hold it
As you read on, you learn about a spy program invented by the StoolHessAyT to collect blood samples from stool for creating evil clones.
Release
The poop slides out and into the doo doo receptacle that will carry it to its watery grave.
(3) Play game
You climb out of bed and rush to the living room to play Street Fighter III 3rd Strike. You pick…
(N) Elena
(N) Necro
(N) Akuma
Ah, the nimble, ashy, and powerful Necro. An undefeatable choice! (press any key)
After getting rolled around by the Japanese players crowding the servers at this time of morning, you decide to play your Trump card and pee on your router. Doesn't really count as a rage quit, does it?
Secret option: Capcom = Ken
Kakkate kina! Those rough feet aren’t just for show. You sweep five people back to back before triumphantly returning to your morning routine. Great job!
After this thrilling start to the day, you decide to continue this streak of pampering. That's when you get up and:
(M) Make pancakes
You fire up the stove and proceed to create a delicious display of gluttonous glory.. A stack of seven pancakes, fried chicken, three bananas, a bowl of lucky charms, and a hot cup of tea to top it all off.
(J) Jerk the Gerkin
You make note of the time and proceed to the bedroom to battle the great beast, Gerkin. Your blood rushes as your breath becomes labored fighting the behemoth of lust. As the battle comes to a climax, press any key
Use math.random to generate a random number. 
Even
You shout in victory as a surge of energy travels throughout your body recognizing triumph over Gerkn the Jerk!
Odd
The immigrants downstairs start screaming at the top of their lungs. Startled, you knock your gourd of aqueous supplement over spilling its contents all over the carpet. And you ruin yourself by accident.

(S) Go back to sleep
The baby downstairs starts to scream bloody murder. You are sent into a fit of hysterical laughter as you hear his parents mow into his room and start yelling in their native tongue. Can't sleep now...

Each option = certain amt of time. Store as a running total and use arithmetic operators to determine the time. Ex: totalMins = 45 + 50 + 35 = 130 >>> hr = totalMins / 60 >>> mins = totalMins %60 >>> 10 >>> currentTime = hr + : + mins >>> 2:10

Randomize the amt of time certain tasks take in order to keep the game fresh each time and add replay value.
Display Stage 2: The Journey

The laceration from the earlier dump starts to irritate you and you hop out of the seat by accident! You foot slides off the clutch and you jerk the wheel to the right sending you careening across the highway just barely swerving across four lanes.
You pull to the side of the road scratching your head (and butt) wondering how the heck you didn't just crash. This cut is becoming a real bother. You decide to
Go wipe up in the woods
Soldier on to work. (Mudbutt intact, you climb back into the driver's seat. In your rear view you see a car zooming down the lane you were just in only to see it dip into a massive pot hole and flip forward! That shit was awesome! Bet you're glad you didn't miss that!
Display Stage 3: The Destination Finale
Sneeze >>> piece of poop blasts into the back of your khakis. The dropping, now sandwiched between your cheeks, melts slowly against the warmth of your underwear and booty skin.
For pushing and denying doo doo deities, you have earned this (press any key)
Okay here it is! (DO NOT PRESS ENTER. I WARN YOU!):
Yo, don't force your poop out. You can sustain serious injuries from forcing your poop. Be careful out here.
Game Over da ze.
*/
import java.util.*;

public class nameless{
	public static void main(String[] args){
		
		Scanner read = new Scanner(System.in);
		String name = "";
		String input = "";

		//1. Prompt player to enter their name
		System.out.print("Please enter your name: ");
		name = read.nextLine();
		System.out.print(name + ", huh? Y/N\t\t");
		input = read.nextLine();

			/*
				Confirm with y/n
				At any time during the program when the user enters inaccurate input:
					If incorrect choice is selected, display twice before exiting
			*/

			if(input.equals("Y") || input.equals("y"))
				System.out.println("Okay!");
			else if(input.equals("N") || input.equals("n"))
				System.out.println("Okay. Well, learn your name and run the program again. BYE");
			else{
				System.out.println("I didn’t catch that.");
				System.out.print(name + ", huh? Y/N\t\t");
				input = read.nextLine();
			}
			//Second Check
			if(input.equals("Y") || input.equals("y"))
				System.out.println("Okay!");
			else if(input.equals("N") || input.equals("n"))
				System.out.println("Okay. Well, learn your name and run the program again. BYE");
			else{
				System.out.println("I STILL didn’t catch that.");
				System.out.print(name + ", huh? Y/N\t\t");
				input = read.nextLine();
			}
			//Final Check
			if(input.equals("Y") || input.equals("y"))
				System.out.println("Okay!");
			else 
				System.out.println("Okay. Well, learn your name and run the program again. BYE");


	}
}
