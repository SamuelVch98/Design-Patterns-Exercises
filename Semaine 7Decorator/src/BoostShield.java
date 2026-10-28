
public class BoostShield implements Robot {
	private Robot decoratedRobot;

	public BoostShield(Robot decoratedRobot) {
		super();
		this.decoratedRobot = decoratedRobot;
	}

	@Override
	public int getCanon() {
		return decoratedRobot.getCanon();
	}

	@Override
	public int getShield() {
		return decoratedRobot.getShield() * 2;
	}

	@Override
	public int getFreq() {
		return decoratedRobot.getFreq();
	}

	@Override
	public String getName() {
		return decoratedRobot.getName();
	}

	@Override
	public int diffLife(int i) {
		return decoratedRobot.diffLife(i);
	}

	@Override
	public int getLife() {
		return decoratedRobot.getLife();
	}
}
