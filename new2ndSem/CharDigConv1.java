import java.util.scanner; 

	public class CharDigConv1{ 
		public static void man(String[]args){ 
		
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter a radix: ");
			int radix = in.nextInt();
			
			System.out.println("Please choose one: ");
			System.out.println("1| Digit to Character ");
			System.out.println("2| Character to Digit ");
			int chc = in.nextInt(); 
			
			if (chc == 1){ 
				System.out.print("Enter a Digit: ");
				int dig = in.nextInt(); 
				
				if (dig >= 0 && dig < radix){ 
					char character = character.forDigit(digit, radix);
					System.out.println("Convert digit to character: "+character);
					}
				else{ System.out.println("Invalid digit for the given radix ");
				
					} 
					
					
				else if (chc == 2){ 
				System.out.print("Enter a character: ");
				char character = in.next().charAt(0);
				int dig = character.digit(character,radix);
				if (dig != -1){ 
				System.out.print("Convert character to digit: "+dig);
				} 
				else { System.out.print("Invalid character for the given radix ");
				
				}
				
				else { 
				System.out.print("Invalid choice");
				}
				}
				}