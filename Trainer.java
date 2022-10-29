package Assignment_2;

//Question 1 and 2
public class Trainer {

	String name;
	String dept;
	String email;
	int id;

	public Trainer(String N, String D, String Email, int Id) {
		name = N;
		dept = D;
		email = Email;
		id = Id;
		System.out.println("cons called");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainer trainer1 = new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Trainer trainer2 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Trainer trainer3 = new Trainer("Mukesh", "Devops", "mukesh@gmail.com", 3);
		Object[] T1 = trainer1.Trainer1();
		for (int i = 0; i < T1.length; i++) {

			System.out.println(T1[i]);
		}
		Object[] T2 = trainer2.Trainer2();
		System.out.println(T2[3]);
		Object[] T3 = trainer3.Trainer3();
		System.out.println(T3[1]);

	}

	public Object[] Trainer1() {

		System.out.println("I can teach Selenium ");

		System.out.println("Trainer name is" + " " + name + " " + "dept is" + " " + dept + " " + "id" + "is " + id + " "
				+ "email is " + " " + email);

		Object[] Array1 = { name, dept, email, id };
		return Array1;
	}

	public Object[] Trainer2() {

		System.out.println("I can teach Web Development");
		System.out.println("Trainer name is" + " " + name + " " + "dept is" + " " + dept + " " + "id" + "is " + id + " "
				+ "email is " + " " + email);
		Object[] Array2 = { name, dept, email, id };
		return Array2;

	}

	public Object[] Trainer3() {
		System.out.println("I can teach DevOps");
		System.out.println("Trainer name is" + " " + name + " " + "dept is" + " " + dept + " " + "id" + "is " + id + " "
				+ "email is " + " " + email);
		Object[] Array3 = { name, dept, email, id };
		return Array3;

	}

}
