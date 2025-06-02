
public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person(123,"Rajan","22222");
		Person p1=new Person();
		System.out.println(p1);
		//p.displayPerson();
		System.out.println(p);
		p.setPname("ROhan");
        System.out.println(p.toString());
        System.out.println(p.getPname());
        p1.toString();
	}
	

}
