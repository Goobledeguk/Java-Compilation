import java.util.Scanner;
	public class Weather1{
		public static void main(String[]args){
			int days; int dt = 1;

		Scanner in = new Scanner(System.in);

		System.out.print("How many days' temperature: ");
		days = in.nextInt();

		int[]temp = new int[days];
		int sum = 0;
		for (int i = 0; i < days; i++){
			System.out.print("Day "+ dt+ " temperature: ");
			temp[i] = in.nextInt();
			dt++;

			 sum += temp[i];

		}
double avg = (double) sum / days;

int lp = 0;

for (int i = 0; i < days; i++){
	if ( temp[i] > avg) { lp++;
}
}

System.out.println(" Average temp: "+avg);
System.out.println(" Days were above average: " + lp);


		}
	}
