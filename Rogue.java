package homeworkassignmentsix;

public class Rogue extends Adventurer {

	public boolean stealth = false;
	public boolean dual = false;

	public Rogue(boolean stealth, boolean dual) {
		super();
		this.stealth = stealth;
		this.dual = dual;
	}

	public boolean isStealth() {
		return stealth;
	}

	public void setStealth(boolean stealth) {
		this.stealth = stealth;
	}

	public boolean isDual() {
		return dual;
	}

	public void setDual(boolean dual) {
		this.dual = dual;
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void regen() {
		// TODO Auto-generated method stub

	}

}
