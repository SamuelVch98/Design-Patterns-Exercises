
public class BoostCanon implements Robot {
	
	private Robot decoratedRobot;

	public BoostCanon(Robot decoratedRobot) {
		super();
		this.decoratedRobot = decoratedRobot;
	}

	@Override
	public int getCanon() {
		return decoratedRobot.getCanon() * 2;
	}

	@Override
	public int getShield() {
		return decoratedRobot.getShield();
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
