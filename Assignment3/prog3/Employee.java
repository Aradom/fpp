package week3.prog3;

import java.text.Format;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
//		this.hireDate = LocalDate.ofEpochDay(dayOfHire);
		/*
		 * update, using LocalDate GregorianCalendar cal = new
		 * GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire); hireDate =
		 * cal.getTime();
		 */
		
	}



	// instance methods
	public String getName() {
		return name;
	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public String getFormattedAcctInfo() {
		// implement
	  StringBuilder sBuilder = new StringBuilder();
	  String template = "ACCOUNT INFO FOR: " + getName() + "\n";
	  boolean isTemplated = false;
		
		if(savingsAcct != null) {
			if(!isTemplated) {
				sBuilder.append(template);
				isTemplated = true;
			}
			String savingInfo =  "Account type saving: \n" + savingsAcct.toString() +"\n"; 
			sBuilder.append(savingInfo);
		}
		if(checkingAcct != null) {
			if(!isTemplated) {
				sBuilder.append(template);
				isTemplated = true;
			}
			
			
			String checkingInfo = "Account type Checking: \n" + checkingAcct.toString() + "\n"; 
			sBuilder.append(checkingInfo);
		};
		if(retirementAcct != null) {
			if(!isTemplated) {
				sBuilder.append(template);
				isTemplated = true;
			}
			
			
			String retirementInfo = "Account type Retirement: \n" + retirementAcct.toString() + "\n"; 
			sBuilder.append(retirementInfo);
		}
	
	
		
		return sBuilder.toString();
	}
	
	
//	
//	private String templateHelperAradom(boolean b, StringBuilder sb) {
//		if(!b) {
//			sb.append("ACCOUNT INFO FOR :\n");
//			return sb.toString();
//		}
//		return "";
//	}
	

	public void deposit(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
		case SAVINGS:
			return savingsAcct.makeWithdrawal(amt);
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amt);
		default:
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getFormattedAcctInfo();
	}

}
