package codenames;
/**
 * Project made by pk-b to simulate the game CODENAME
 * Using an Array TO implement the board
 * Arraylist to keep of the count to avoid duplicates
 * Class DridDetails which keeps the attributes of the class
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

	class codename2  {
		
	public static Scanner FileReader;//name of Scanner
	private static boolean StatusWait = true;//finds status of whether any resources is loading or not
	static int count = 5;//Instances to record what random values are picked
	static ArrayList<Integer> CountTracker= new ArrayList<>();//Keep track of the random Counts
	static GridDetails[][] gridPanels;// Grid Array declaration
	static Random rand;//Random generator 
	static int RedPlayers=9, BluePlayers=8;//Players
	
	
	
		public static void main(String[] args)  {
		gridPanels	= new GridDetails[5][5];// Initialize the array
		System.out.println("Welcome to CoDenames");
		/**
		 * Loading Directionary
		 */
		LoadingWOrdsDIR();

		while(StatusWait == true)// Can place a waiting bar or a waiting logo, until game start (depending on waiting time)
		{
		System.out.println("Initializing game");
		
		/**
		 * Board Set up before games start
		 */
		BoardSetup();
		/**
		 * simple PrintOut
		 */
		Display();
		}
		
		System.out.println(" GaMe LoAdEd");
	
		
		

	}





	private static void LoadingWOrdsDIR() {
		FileReader reader;
		
		//System.out.println("Loading Directory of Words");
		try {//Using try catch just to catch file not found Excp
			reader = new FileReader("MiniDicTionary.txt");
			FileReader  = new Scanner(reader);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
//	System.out.println("Successfully Loaded Directory");
	}





	private static void REsetCOunter(int n ) {
		// TODO Auto-generated method stub
		rand=  new Random();
		count = rand.nextInt(n); 
		
	for(int i =0; i<100;i++) {
		if((CountTracker.contains(count))) {
			REsetCOunter(n);
		}
			
		else
	CountTracker.add(count);
		break;
	}


	}


	public static void BoardSetup() {
		// TODO Auto-generated method stub
		
		/*
		 * Randomize words
		 */
		REsetCOunter(gridPanels.length*gridPanels[0].length);
		randomizeWords();
		System.out.println("Successfully Randomized word");
		randomizeColors();
		System.out.println("Successfully Randomized Colors");

		/*
		 * randomize assassin
		 */
FileReader.close();


		StatusWait= false;
	}
	public static  void  randomizeWords() 
	{	
			/*
			 * Iteration to fill in the board
			 */
		System.out.println("Randomizing words and colors");
			
			String tempWord= null;// Temporary String to keep sc.next
			for(int i =0;i<gridPanels.length;i++)
			{
				for(int j=0; j<gridPanels[0].length;j++)
				{
				
				//InStansiatimg each element of array first	
				gridPanels[i][j] = new GridDetails();
				
				/**
				 * It counts the number of words to skip
				 */
				while(true) 
				{
					if (count <=0)
						break;
					tempWord =FileReader.next();
					--count;
				}
				if(tempWord != null)
				gridPanels[i][j].setWord(tempWord);
				gridPanels[i][j].setWord(FileReader.next());
				
				

				REsetCOunter(36);
				LoadingWOrdsDIR();
			
				
				
				//}REsetCOunter(36);


			}
			}
	}
/**
 * This is where the colors are distributed on the board and the assassin is determined
 * First the assassin Hides, the we assign the Red Players and blue players in random spaces.
 * If statement ascertains that no duplicates are met.
 */
	public static void  randomizeColors() 
	{
		gridPanels[rand.nextInt(gridPanels.length)][rand.nextInt(gridPanels[0].length)].setColor("Black");// Assasin
		
		for(int i = 0;i<RedPlayers;i++) {//Distributing Red Players
		int	rowRED = rand.nextInt((5));
		int columRED= rand.nextInt(5);
			while(gridPanels[rowRED][columRED].getColor()!="Wild") {
				rowRED = rand.nextInt((5));
				columRED= rand.nextInt(5);
			}gridPanels[rowRED][columRED].setColor("Red");}//Anti-duplicate
					
					
		for(int i = 0;i<BluePlayers;i++) {//Distributing Bluw Players
			int	rowBLUE = rand.nextInt(5);
			int columnBLUE= rand.nextInt(5);
				while(gridPanels[rowBLUE][columnBLUE].getColor()!="Wild") {//Antiduplicate
					rowBLUE = rand.nextInt(5);
					columnBLUE= rand.nextInt(5);
						
			}gridPanels[rowBLUE][columnBLUE].setColor("Blue");
				
		}
		
		
		
		
		
	}
	
	public static void Display() {
		for(int i =0; i<gridPanels.length; i++) {
			for(int j=0; j<gridPanels[0].length;j++) {
				System.out.print(gridPanels[i][j].getWord()+" , " +gridPanels[i][j].getColor());
				String tab =(((gridPanels[i][j].getWord().length()+gridPanels[i][j].getColor().length()) <=10 ) ? "\t\t":"\t");
				System.out.print(tab);
			}			
			System.out.println();		

		}
	}
	
	/**\
	 * Count Validator to avoid duplicates
	 */


}

