package homeworkassignmentsix;

public class Warrior extends Adventurer {

	public String name = null;
	public String race = null;
	public String gender = null;

	public int Str = 0;
	public int Dex = 0;
	public int Con = 0;
	public int Int = 0;
	public int Cha = 0;

	public String shout = null;
	public String armor = null;

	public Warrior(String shout, String armor) {
		super();
		this.shout = shout;
		this.armor = armor;
	}

	public Warrior() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getStr() {
		return Str;
	}

	public void setStr(int str) {
		Str = str;
	}

	public int getDex() {
		return Dex;
	}

	public void setDex(int dex) {
		Dex = dex;
	}

	public int getCon() {
		return Con;
	}

	public void setCon(int con) {
		Con = con;
	}

	public int getInt() {
		return Int;
	}

	public void setInt(int i) {
		Int = i;
	}

	public int getCha() {
		return Cha;
	}

	public void setCha(int cha) {
		Cha = cha;
	}

	public String getshout() {
		return shout;
	}

	public void setshout(String shout) {
		this.shout = shout;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	@Override
	public String toString() {
		return "Strength = " + Str + ", Dexterity = " + Dex + ", Constitution = " + Con + ", Intelligence = " + Int
				+ ", Charisma = " + Cha;
	}

	@Override
	public void fight() {

		System.out.println("You are ready to fight!");
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("You are ready to run!");
	}

	@Override
	public void regen() {
		// TODO Auto-generated method stub
		System.out.println("You are ready to Heal!");
	}

}
