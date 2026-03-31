package programs.enumdemo;

public enum Color {
	
	RED, GREEN, BLUE;

	// enum constructor called separately for each
	// constant
	private Color()
	{
		System.out.println("Constructor called for : " +
		this.toString());
	}

	public void colorInfo()
	{
		System.out.println("Universal Color");
	}
}
