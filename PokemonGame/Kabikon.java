
public class Kabikon extends Character implements Swimmable {
	private static final int maxGroupHealth = 500;
	

	public Kabikon() {
		super("Kabikon",maxGroupHealth);
		this.attackSkill = CharacterSkill.getCharacterSkill("Double Casting");
		this.imgPath="images/Kabikon.jpg";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		this.reducedHealth(30);
	}



}
