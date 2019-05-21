package FactoryDesignPattern;

public class FDdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f=new Factory();
		os f1=f.getOS("abccc");
		f1.spec();
		

	}

}
