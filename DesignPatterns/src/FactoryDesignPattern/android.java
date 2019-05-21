package FactoryDesignPattern;

public class android  implements os{

	@Override
	public void spec() {
			System.out.println("Powerfull OS");
	}

}

class ios implements os{

	@Override
	public void spec() {
		System.out.println("Secure OS");		
	}
	
}

class windows implements os{

	@Override
	public void spec() {
		System.out.println("Other OS");		
	}
	
}
