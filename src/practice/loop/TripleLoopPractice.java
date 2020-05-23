package practice.loop;

public class TripleLoopPractice {

	public static void main(String[] args) {
		
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
		
		
/*

Above, we have arrays of dorms, some classes that students in those dorms are taking,
and the students in those classes. Here is an example of how the data ties together:

Dorm: "Dorm A"
Classes: "Intro to Music Theory", "Drawing 1", "Cardio Fitness", "Intro to Technology", "Accounting 1"

Dorm A 1st Class: "Intro to Music Theory"
"Amy", "Ben", "Tom"

Dorm A 2nd Class: "Drawing 1"
"Tom"

Write a program that will display this information in the format below.
Your solution should not use any if or switch statements. You should use loops to cycle through the data.

SAMPLE OUTPUT:

Dorm D
Accounting 2
Eric
Walter
Steven
Total Students: 3

Drawing 1
Sam
Total Students: 1

Intro to Music Theory
Ryan
Ann
Total Students: 2

Ceramics 2
Shannon
David
Total Students: 2

Culinary 2
Jack
Total Students: 1

----------------------------------------------

Dorm E
Drawing 1
Jackson
Total Students: 1

Intro to Literature
Jasmine
Total Students: 1

Programming 1
Kevin
Jessica
Josiah
Total Students: 3

----------------------------------------------

*/
		
		
	}

}
