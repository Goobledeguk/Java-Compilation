import java.util.Arrays;
public class Arr2Display{
	public static void main(String[]args){
			int[][] scores = {
			{87, 96, 70},
			{68, 87, 90},
			{94, 100, 90},
			{100, 81, 82},
			{83, 65, 85},
			{78, 87, 65},
			{91, 94, 100},
			{76, 72, 84},
			{87, 93, 73}
							};



		for ( int i =0; i < scores.length; i++){
			int sum = 0;
			System.out.println("Student:"+(i+1));
			 	for ( int j =0; j < scores[i].length; j++){
					System.out.println("Test "+(j+1)+":" + scores[i][j] + " ");
					sum += scores[i][j];

				}

				double avg = (double) sum / scores[i].length;
				System.out.println("Average: " +avg);
				System.out.println( "  ");
				}


	}
}