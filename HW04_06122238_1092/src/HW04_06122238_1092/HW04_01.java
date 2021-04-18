//日四B 06122238 施佳妏
package HW04_06122238_1092;

import java.util.Date;

public class HW04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1122, 20000, 0.045); //創建一個帳號1122,餘額20000,年利率4.5%的account
		//重新設定帳戶餘額：使用withDraw方法提款2500美元+使用deposit方法存款3000美元
		account.setBalance((account.getBalance() + account.withdraw(2500) + account.deposit(3000)));
		//印出帳戶餘額、月利息及開戶日期
		System.out.println("Balance is " + (account.getBalance() + account.withdraw(2500) + account.deposit(3000)));
        System.out.println("Monthly interest is " + account.getMonthlyInterest());
        System.out.println("The account was created at " + account.getDate().toString());

	}

}
class Account{
	
	private int id = 0; //帳號
	private double balance = 0; //餘額
	private double annualInterestRate = 0; //年利率
	private Date dateCreated; //開戶日期
	
	Account(){ //創建一個預設建構子
		
	}
	
	Account(int newId, double newBalance, double newAnnualInterestRate){ //創建一個有指定帳號、餘額及年利率的建構子
		 dateCreated = new Date();
	     id = newId;
	     balance = newBalance;
	     annualInterestRate = newAnnualInterestRate;
	}
	
	//ID accessor method
    public double getId(){
        return id;
    }   
    
	//ID mutator method
	public void setId(int newId){
        id = newId;
    }
	
	//balance accessor method
	public double getBalance(){
		return balance;
	}
	
	//balance mutator method
	public void setBalance(double newBalance){
		balance = newBalance;
	}	
	
	//annualInterestRate accessor method
	public double getAnnualInterestRate(){
        return annualInterestRate;
    }	
	
	//annualInterestRate mutator method
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    
    //dateCreated accessor method
    public Date getDate(){
        return dateCreated;
    }
    
    //getMonthlyInterestRate method 回傳月利率
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12.0;
    }
    
    //getMonthlyInterest method 回傳月利息
    public double getMonthlyInterest() {
    	return annualInterestRate / 12.0 * balance;
    } 
    
    //withdraw method 回傳提款金額
    public double withdraw(double money) {
    	return -money;
    }    
    
    //deposit method 回傳存款金額
    public double deposit(double money) {
    	return money;
    }
}
