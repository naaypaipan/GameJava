public class Raichu extends Character implements Runnable{
	private static final int maxGroupHealth = 300;
	public Raichu() {
		super("Raichu",
			      maxGroupHealth);

			this.attackSkill = CharacterSkill.getCharacterSkill("Fire Ball");
			this.imgPath="images/Raichu";
	}	
	public void move(){
		this.run();
	}
	public void run(){
		this.reducedHealth(10);
	}
	public void walk(){
		this.reducedHealth(1);
	}
}