
public class RobotImpl implements Robot {
	
	private final int canon;
	private final int shield;
	private final int freq;
	private int life;
	private final String name;
	
	private RobotImpl(Builder builder) {
		this.canon = builder.canon;
		this.shield = builder.shield;
		this.freq = builder.freq;
		this.life = builder.life;
		this.name = builder.name;
	}

	@Override
	public int getCanon() {
		return canon;
	}

	@Override
	public int getShield() {
		return  shield;
	}

	@Override
	public int getFreq() {
		return freq;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getLife() {
		return life;
	}

	@Override
	public int diffLife(int i) {
		if(i == 0) return life;
		if(i > 0) return life += i;
		else return life += i;
	}
	
	public static class Builder {
		
		private final String name;
		private int canon;
		private int shield;
		private int freq;
		private int life;
		
		public Builder(String name) {
			this.name = name;
			this.canon = 1;
			this.shield = 1;
			this.freq = 100;
			this.life = 100;
		}
		
		public Builder canon(int canon) {
			this.canon = canon;
			return this;
		}
		
		public Builder shield(int shield) {
			this.shield = shield;
			return this;
		}
		
		public Builder freq(int freq) {
			this.freq = freq;
			return this;
		}
		
		public Builder life(int life) {
			this.life = life;
			return this;
		}
		
		public RobotImpl build() {
			return new RobotImpl(this);
		}
		
	}
}
