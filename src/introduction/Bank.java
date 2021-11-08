package introduction;

public class Bank {
	String accountNumber;
	int balance;

	public String toString() {
		return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")";

	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Bank) {
			Bank a = (Bank) o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
