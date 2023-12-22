package constructers.note;


	class Ninja{
		int noOfMissions;
		String name;
		int age;
		public int getNoOfMissions() {
			return noOfMissions;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getVillage() {
			return village;
		}
		String village;
		
		public Ninja(int noOfMissions, String name, int age,String village) {
			super();
			this.noOfMissions = noOfMissions;
			this.name = name;
			this.age = age;
			this.village=village;
		}
		void disp() {
			System.out.println("Age: "+age);
			System.out.println("NAME: "+name);
			System.out.println("noOfMissions: "+noOfMissions);
			System.out.println("village :"+ village);
		}
		void setId(int Age) {
			this.age=Age;
			System.out.println(age);
		}
		void SetNoFMis(int noOfMissions) {
			this.noOfMissions=noOfMissions;
		}
	}
	public class Cons1 {
		public static void main(String[] args) {
			
			Ninja n=new Ninja(999,"kakashi",22,"leaf");
			n.disp();
		
			System.out.println(n.getName());
			n.setId(200);
			n.SetNoFMis(12999);
			n.disp();
}
}
