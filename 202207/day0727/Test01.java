public class Test01{
	public static void main(String[] args){
		Account jane_Smith = new Account("1000", 2000, 0.0123);
		System.out.println(jane_Smith.deposit(100));

		System.out.println(jane_Smith.withdraw(960));

		System.out.println(jane_Smith.withdraw(2000));
	}
}

class Account{
// �˻���
	// �˻�ID
	private String id;

	// ���
	private double balance;

	// ������
	private double annualInterestRate;

	// �޲ι���
	public Account(){}

	// �вι���
	public Account(String id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}// Account()

	// setter and getter
	public void setId(String id){
		this.id = id;
	}// setId()

	public String getId(){
		return id;
	}// getId()

	public void setBalance(double balance){
		this.balance = balance;
	}// setBalance()

	public double getBalance(){
		return balance;
	}// getBalance()

	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}// setAnnualInterestRate()

	public double getAnnualInterestRate(){
		return annualInterestRate;
	}// getAnnualInterestRate
	
	public String withdraw(double withdraw_money){
	// ȡǮ����
		while(withdraw_money<0){
			System.out.println("��������ȷ��ȡ���");
		}// while
		if(withdraw_money > balance) // ����
			return "���㣬ȡ��ʧ�ܣ�";
		balance -= withdraw_money;
		return "ȡ��ɹ��������˻����Ϊ��" + balance;
	}// withdraw()

	public String deposit(double deposit_money){
	// ����
		while(deposit_money<0){
			System.out.println("��������ȷ�Ĵ���");
		}// while
		balance += deposit_money;
		return "���ɹ��������˻����Ϊ��" + balance;
	}// deposit()
}