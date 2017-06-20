import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		/*System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		String kitchen = "kitchen";
		String upstairs = "upstairs";
		String ref ="refrigerator";
		String cab ="cabinet";
		String bed ="bedroom";
		String bath = "bathroom";
		String yes = "yes";
		String no = "no";
		String enjoy = "enjoy";
		String hate = "hate";
		String input1,input2,input3,input4,input5;
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
		
		input1=scn.next();
		if(input1.equals(kitchen))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere.Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator \"or look in a \"cabinet\".");
			input2=scn.next();
			if(input2.equals(ref))
			{
				System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.Would you like to eat some of the food? (\"yes\" or \"no\")");
				input4=scn.next();
				if(input4.equals(yes))
				{
					System.out.println("You have found food!!! Did you \"enjoy\" or \"hate\" this game? ");
					input5=scn.next();
					if(input5.equals(enjoy))
					{
						System.out.println("Thanks for playing :) ");
					}
					else if(input5.equals(hate))
					{
						System.out.println("Don't worry!!! We'll make this game interesting.");
					}
					
				}
				else if(input4.equals(no))
				{
					System.out.println("You die of starvation... eventually.");
				}
			}
			else if(input2.equals(cab))
			{
				System.out.println("Inside the cab you see paper and stuff.  It looks pretty nasty.Would you like to eat some of the paper? (\"yes\" or \"no\")");
				input4=scn.next();
				if(input4.equals(yes))
				{
					System.out.println("You have found paper!!!");
				}
				else if(input4.equals(no))
				{
					System.out.println("You'll get those... eventually.");
				}
			}
			
		}
		else if(input1.equals(upstairs))
		{
			System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?");
			input3=scn.next();
			if(input3.equals(bed))
			{
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would youlike to open the door? (\"yes\" or \"no\")");
				input4=scn.next();
				if(input4.equals(yes))
				{
					System.out.println("Well, then I guess now you know what was in there.");
				}
				else if(input4.equals(no))
				{
					System.out.println("Well, then I guess you'll never know what was in there.");
				}
			}
			else if(input3.equals(bath))
			{
				System.out.println("You are in a plush bathroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would youlike to open the door? (\"yes\" or \"no\")");
				input4=scn.next();
				if(input4.equals(yes))
				{
					System.out.println("Well, then I guess now you know what was in there.");
				}
				else if(input4.equals(no))
				{
					System.out.println("Well, then I guess you'll never know what was in there.");
				}
			}
			
		}*/
		
		/*Switch*/
		int day;
		System.out.println("Enter the number of days in month");
		day=scn.nextInt();
		
        switch (day) {
            case 30:  System.out.println("September April June November");
                     break;
            case 31:  System.out.println("January March May July August October December");
                     break;
            case 28:  System.out.println("February");
                     break;
            case 29:  System.out.println("February(Leap Year)");
            		 break;
            default: System.out.println("No month can have exactly these number of days");
            		break;

        }

		
	}
}
