
public class Person {
	private int pid;
	private String pname;
	private String mob;
	//default constructor
	public Person(){
		pid=0;
		pname=null;
		mob=null;
		
	}
	//parametrized constructor
	public Person(int pid,String nm,String mob){
		this.pid=pid;
		this.pname=nm;
		this.mob=mob;
		
	}
	//parametrized constructor
		public Person(int pid){
			this.pid=pid;
			this.pname=null;
			this.mob=null;
			
		}
		//setter methods
		
		
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getMob() {
			return mob;
		}
		public void setMob(String mob) {
			this.mob = mob;
		}
		
//		public void displayPerson() {
//			System.out.println("Pid: "+pid);
//			System.out.println("Name : "+pname);
//			System.out.println("Mobile : "+mob);
//		}
		
		public String toString() {
			System.out.println("in tostring method");
			return "Id : "+pid+" Name: "+pname+" Mobile: "+mob;
			//return pid+","+pname+","+mob;
			
		}

}
