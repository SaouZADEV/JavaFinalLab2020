package exam_01;

public class Main {

	public static void main(String[] args) {
		Student s = new Student("34099110","6301","John",19,"123 KKU");
		Worker w = new Worker("34099220","W01","Giant",40,"255 KKU");
		s.setGPA(3.5);
		w.setRate(300.0);
		w.setDays(20);
		System.out.println(s);
		System.out.println(w.toString());

	}

}
