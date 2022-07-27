public class Test01{
	public static void main(String[] args){
		Account jane_Smith = new Account("1000", 2000, 0.0123);
		System.out.println(jane_Smith.deposit(100));

		System.out.println(jane_Smith.withdraw(960));

		System.out.println(jane_Smith.withdraw(2000));
	}
}

class Account{
// 账户类
	// 账户ID
	private String id;

	// 余额
	private double balance;

	// 年利率
	private double annualInterestRate;

	// 无参构造
	public Account(){}

	// 有参构造
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
	// 取钱方法
		while(withdraw_money<0){
			System.out.println("请输入正确的取款金额！");
		}// while
		if(withdraw_money > balance) // 余额不足
			return "余额不足，取款失败！";
		balance -= withdraw_money;
		return "取款成功！您的账户余额为：" + balance;
	}// withdraw()

	public String deposit(double deposit_money){
	// 存款方法
		while(deposit_money<0){
			System.out.println("请输入正确的存款金额！");
		}// while
		balance += deposit_money;
		return "存款成功！您的账户余额为：" + balance;
	}// deposit()
}