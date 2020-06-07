package practice.loop;

public class TripleLoopPractice {

	public static void main(String[] args) 
	{
		
		String[] dorms = {"Dorm A",
							"Dorm B",
							"Dorm C",
							"Dorm D",
							"Dorm E"};
		
		String[][] classes = {{"Intro to Music Theory", "Drawing 1", "Cardio Fitness", "Intro to Technology", "Accounting 1"},
							   {"Drawing 1", "Drawing 2", "Weight Training", "Cardio Fitness", "Ceramics 1", "Accounting 1", "Accounting 2"},
							   {"Cardio Fitness", "Weight Training", "Culinary 1", "Ceramics 2"},
							   {"Accounting 2", "Drawing 1", "Intro to Music Theory",  "Ceramics 2", "Culinary 2"},
							   {"Drawing 1", "Intro to Literature", "Programming 1"}
							   };
		
		String[][][] students = {{
									{"Amy", "Ben", "Tom"},
									{"Tom"},
									{"David", "Simon"},
									{"Kevin","Jack","Shannon", "Zach"},
									{"Molly"}
								 },
								 {
									 {"Jon", "Ted", "Ashley"},
									 {"Ben", "Josh"},
									 {"Ann"},
									 {"Sam"},
									 {"Jordan","Tim"},
									 {"Joshua", "Maggie", "Ryan"},
									 {"Alexander", "Sammi"}
								 },
								 {
									 {"Ashley", "Sam"},
									 {"Jon"},
									 {"Ted", "Joe"},
									 {"Larry"}
								 },
								 {
									 {"Eric", "Walter", "Steven"},
									 {"Sam"},
									 {"Ryan", "Ann"},
									 {"Shannon", "David"},
									 {"Jack"}
								 },
								 {
									 {"Jackson"},
									 {"Jasmine"},
									 {"Kevin", "Jessica", "Josiah"}
								 }};

		String divider = "----------------------------------------------\n";
		for( int i = 0; i < dorms.length; i++)
		{
			System.out.println(dorms[i]);
			System.out.println();
			
			for(  int k = 0, warp = classes[i].length;  k < warp; k++)
			{
				System.out.println(classes[i][k]);
				System.out.println();	
				
				for(int r = 0, core = students[i][k].length; r < core; r++)
				{
					System.out.println(students[i][k][r]);
					System.out.println();	
				}
			}
		}
	}
}