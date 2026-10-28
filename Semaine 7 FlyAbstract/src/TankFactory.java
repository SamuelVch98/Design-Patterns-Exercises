
public class TankFactory implements RobotFactory {

	@Override
	public Robot createRobot(String nom) {
		return new RobotImpl.Builder(nom).freq(40).canon(3).life(500).build();
	}
}
