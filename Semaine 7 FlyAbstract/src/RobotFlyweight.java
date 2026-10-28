import java.util.HashMap;
import java.util.Map;

public class RobotFlyweight {
	private Map<String, RobotFactory> robots;

	public RobotFlyweight() {
		this.robots = new HashMap<String, RobotFactory>();
	}
	
	public void put(String nom, RobotFactory robot) {
		robots.put(nom, robot);
	}
	
	public Robot createRobot(String nom) {
		return robots.get(nom).createRobot(nom);
	}
}
