public class PatternRobots {
	
	public static void fight(Robot robot1, Robot robot2) {
		int tick1=robot1.getFreq();
		int tick2=robot2.getFreq();
		while(robot2.diffLife(0)>0 && robot1.diffLife(0)>0) {
			int tick=Math.min(tick1, tick2);
			tick1-=tick;
			tick2-=tick;
			if (tick1==0) {// robot 1 feu
				tick1=shoot(robot1,robot2);
			}
			if (tick2==0) {// robot 2 feu
				tick2=shoot(robot2,robot1);
			}
		}
		if(robot1.getLife() > 0) {
			System.out.println("Le robot " + robot1.getName() + " a gagné");
		}else {
			System.out.println("Le robot " + robot2.getName() + " a gagné");
		}
	}
	
	private static int shoot(Robot robot1, Robot robot2) {
		int dmg=Math.max(0,robot1.getCanon()-robot2.getShield());
		int lost=robot2.diffLife(0)-robot2.diffLife(-dmg);
		System.out.println(robot1.getName()+" shoots for "+lost);
		if (robot2.diffLife(0)<=0) {
			System.out.println("Kabooom "+robot2.getName());
		}
		return robot1.getFreq();
	}
	
	public static void main(String[] args) {
		Robot robot1= new RobotImpl.Builder("Robot 1").canon(15).build();// un robot avec un canon de 10, un bouclier de 2, une fr�quence de tir de 100 et qui a re�u une am�lioration de canon multipliant la puissance de ce dernier par 2.
		Robot robot2= new RobotImpl.Builder("Robot 2").canon(4).shield(4).build();// un robot avec un canon de 9, un bouclier de 3, une fr�quence de tir de 90 
					// et qui a re�u une am�lioration de bouclier multipliant ce dernier par 2 et une am�lioration de mitigation des d�gats qui r�duit les points de vue perdus par 2. 
		RobotFlyweight flyweight = new RobotFlyweight();
		flyweight.put("Tank", new TankFactory());
		flyweight.put("Berta", new BertaFactory());
		
		Robot tank = flyweight.createRobot("Tank");
		Robot berta = flyweight.createRobot("Berta");
		
		fight(tank, berta);
	}
}
