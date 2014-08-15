package system;

import main.Main;

public abstract class System {

	public Main main;
	
	public System(Main main)
	{
		this.main = main;
	}
	
	public abstract void tick();
	
}
