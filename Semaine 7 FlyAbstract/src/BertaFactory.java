
public class BertaFactory implements RobotFactory {

	@Override
	public Robot createRobot(String nom) {
		return new RobotImpl.Builder(nom).freq(15).canon(10).build();
	}
}
