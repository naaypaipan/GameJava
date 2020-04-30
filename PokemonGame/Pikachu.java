public class Pikachu extends Character implements Runnable{
	private static final int maxGroupHealth = 200;
	public Pikachu() {
		super("Pikachu",
			      maxGroupHealth);

			this.attackSkill = CharacterSkill.getCharacterSkill("Safety Wall");
			this.imgPath="images/pikachu.jpg";
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