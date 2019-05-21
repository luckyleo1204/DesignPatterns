package FactoryDesignPattern;

public class Factory {
	
	public os getOS(String  os)
	{
		if(os.equalsIgnoreCase("Open"))
		{
			return new android();
		}else if(os.equalsIgnoreCase("Secure"))
		{
			return new ios();
		}
		else {
			return new windows();
		}
		
	}

}
