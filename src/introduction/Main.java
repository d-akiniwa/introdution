package introduction;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero("ミナト", 100);
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(hero);
		
		Wand wand = new Wand();
		wand.setName("魔法の杖");
		wand.setPower(0.5);
		
		Wizard wizard = new Wizard();
		wizard.setName("朝香");
		wizard.setHp(50);
		wizard.setMp(30);
		wizard.setWand(wand);
		wizard.heal(hero);
		
		Bank bank = new Bank();
		bank.accountNumber = "4649";
		bank.balance = 1592;
		System.out.println(bank.toString());
		Bank bank1 = new Bank();
		bank1.accountNumber = "4648";
		bank1.balance = 1592;
		if(bank.equals(bank1)) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}

}
