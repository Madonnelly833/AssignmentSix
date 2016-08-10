package homeworkassignmentsix;

public class Mage extends Adventurer {

	public boolean robeAndWizardHat = false;
	public int fire = 0;
	public int water = 0;
	public int earth = 0;

	public Mage(boolean robeAndWizardHat, int fire, int water, int earth) {
		super();
		this.robeAndWizardHat = robeAndWizardHat;
		this.fire = fire;
		this.water = water;
		this.earth = earth;
	}

	public boolean isRobeAndWizardHat() {
		return robeAndWizardHat;
	}

	public void setRobeAndWizardHat(boolean robeAndWizardHat) {
		this.robeAndWizardHat = robeAndWizardHat;
	}

	public int getFire() {
		return fire;
	}

	public void setFire(int fire) {
		this.fire = fire;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getEarth() {
		return earth;
	}

	public void setEarth(int earth) {
		this.earth = earth;
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
