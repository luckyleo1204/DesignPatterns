package BuilderDesignPattern;

public class BuilderDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p=new phoneBuilder().setName("Nokia").setRam(500).getPhone();
		System.out.println(p.toString());
		
		}

}
