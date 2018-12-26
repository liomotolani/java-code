
public class Studenttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Olayinka Jane",97.0);
		Student student2 = new Student("Olamide Adedeji",70.0);
		Student student3= new Student("Elemide Lamidi",80.0);
		
		System.out.printf("%s's grade is : %s%n ", student1.getName(),student1.getLetterGrade());
		System.out.printf("%s's grade is : %s%n ", student2.getName(),student2.getLetterGrade());
		System.out.printf("%s's grade is : %s%n ", student3.getName(),student3.getLetterGrade());
	}

}
