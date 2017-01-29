/*
Richard L. Clarke
1/25/2017

1. Prompt player to enter their name
Confirm with y/n
At any time during the program when the user enters inaccurate input:
If incorrect choice is selected, display twice before exiting
--------------------------------------------------------------------------------------------------------------------------------------------
2. Display Stage 1: Awakening and prompt user to select a choice
(1) Pray 
(2) Poop
	(2a) Push 
		(2a.I) Accept 
		(2a.II) Decline
	(2b)Wait
		(2b.I) Hold it

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

INTRO: To play this game, a girl must become...nameless?
Include Catherine do you like cats or a dogs with alternate secret they both suck.




Sent from my ASUS
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
			else if(input.equals("N") || input.equals("n")){
				System.out.println("Okay. Well, learn your name and run the program again. BYE");
				System.exit(1);
			}
			else{
				System.out.println("I didn\'t catch that.");
				System.out.print(name + ", huh? Y/N\t\t");
				input = read.nextLine();
					if(input.equals("Y") || input.equals("y"))
						System.out.println("Okay!");
			}
			//Second Check
			if(input.equals("N") || input.equals("n")){
				System.out.println("Okay. Well, learn your name and run the program again. BYE");
				System.exit(1);
			}
			else if (!(input.equals("Y") || input.equals("y"))){
				System.out.println("I STILL didn\'t catch that.");
				System.out.print(name + ", huh? Y/N\t\t");
				input = read.nextLine();
					if(input.equals("Y") || input.equals("y"))
						System.out.println("Okay!");
			}
			//Final Check
			if(input.equals("N") || input.equals("n")){
				System.out.println("Okay. Well, learn your name and run the program again. BYE");
				System.exit(1);
			}
			else if(!(input.equals("Y") || input.equals("y"))){
				System.out.println("Only Y/N are allowed! Run the program again. BYE");
				System.exit(1);
			}

		//Display Stage 1: Awakening and prompt the user to select a choice
		System.out.println("You awaken in your bed. It's Monday. The time is 6am and you have to be at work at 9." +
						   " What's the move?");
		System.out.print("(1) Pray\t(2) Poop\t(3) Play game\t"); 
		input = read.nextLine();
			//(1)Pray
			if(input.equals("1")){
				System.out.println("You sit up and kneel facing your window as you pray for positivity and peace" +
								   "\nfor the day. Should've prayed for a strategy guide to this game instead...");
				//pause HERE
			}
			//(2)Poop
			else if(input.equals("2")){
				System.out.print("You slide out of bed and saunter to the porcelain throne where you make " +
								   "your daily deposit to the doo doo demons." +
								   "\nUnforunately, your body is still " +
								   "waking up so it's gonna be a while.\nINSERT A PAUSE HERE But we have places " +
								   "to be and things to see!\nYou decide to...");
				System.out.println("(P) Push\t(W) Wait\t");
				input = read.nextLine();
					//(2a)Push
					if(input.equals("P") || input.equals("p")){
						System.out.println("If only you waited a little longer! The Ben & Jerry's you had "+
										   "before bed propels the giant stool right to the exit of your " +
										   "booty, scraping your rectum on the way out.\nA blood coated " +
										   "turd slides out painfully.\nThe doo doo demons, pleased with " +
										   "your blood oath, vow to watch over you on your journey today.\nBut, you must " +
										   "accept their guidance!");
						System.out.println("(A) Accept doo doo demon guidance\t(D) Decline this foolish offer");
						
						//(2a.I) Accept
						input = read.nextLine();
							if((input.equals("A") || input.equals("a")))
								System.out.println("This is the shit you asked for");
						//(2a.II) Decline
							else if((input.equals("D") || input.equals("d")))
								System.out.println("Good job. No such thing as doo doo demons.\n" +
												   "But you've unlocked a bonus. Just finish the game and claim your prize!");
							else
								System.out.println("Wrong input. Run the program again. BYE");

					}
					//(2b)Wait
						else if(input.equals("W") || input.equals("w")){
							System.out.print("It takes a while. In the meantime, you jump on twitter to look\n" +
												"for saggy breast photos. An article appears on your feed about\n" +
												"the Dangers of DooDoo Demons.\nAs the poop approaches its birth you…\t(H) HOLD IT!\t(R)Relax...and release\t");
							input = read.nextLine();
								
								//(2b.I) Hold it
								System.out.println("As you read on, you learn about a spy program invented by the StoolHessAyT to\n" +
												   "collect blood samples from stool for creating evil clones.");

						}
							
				

			}
/*

Release
The poop slides out and into the doo doo receptacle that will carry it to its watery grave.

You climb out of bed and rush to the living room to play Street Fighter III 3rd Strike. You pick…
(N) Elena
(N) Necro
(N) Akuma
Ah, the nimble, ashy, and powerful Necro. An undefeatable choice! (press any key)
After getting rolled around by the Japanese players crowding the servers at this time of morning, you decide to play your Trump card and pee on your router. Doesn't really count as a rage quit, does it?
Secret option: Capcom = Ken
Kakkate kina! Those rough feet aren’t just for show. You sweep five people back to back before triumphantly returning to your morning routine. Great job!
After this thrilling start to the day, you decide to continue this streak of pampering. That's when you get up and:

*/

	}
}
