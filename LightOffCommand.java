public class LightOffCommand implements Command {
	
	Light light;

	public lightOffCommand(Light light){
		this.light = light;
	}

	public void execute(){
		light.off();
	}

}
