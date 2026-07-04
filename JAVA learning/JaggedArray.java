//jaggede array

class JaggedArray
{
	public static void main(String[]args)
	{
		//declare jagged array will 3 rows
		int[][]jagged = new int[3][];
		
		//initialize columns separately
		jagged [0] = new int[2];
		jagged [1] = new int[4];
		jagged [2] = new int[3];

		//Assign values
		jagged [0][0] = 10;
		jagged [0][1] = 20;

		jagged [1][0] = 30;
		jagged [1][1] = 40;
		jagged [1][2] = 50;
		jagged [1][3] = 60;
	
		jagged [2][0] = 70;
		jagged [2][1] = 80;
		jagged [2][2] = 90;

		//Assign values using nested loop :
		System.out.println("Jagged Array elements:");

		for(int i=0;i<jagged.lenght;i++)
		{
			for(int j=0; j<jagged[i].length;j++)
			{
				System.out.println(jagged[i][j] +" ");
			}
			System.out.println();
		}
		 
	}
}
