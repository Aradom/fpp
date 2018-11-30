package week3.prog3.employeeinfo;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	// instance methods
	public String getName() {
		return this.name;
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

		if (savingsAcct != null) {
			if (!isTemplated) {
				sBuilder.append(template);
				isTemplated = true;
			}
			String savingInfo = "Account type saving: \n" + savingsAcct.toString() + "\n";
			sBuilder.append(savingInfo);
		}
		if (checkingAcct != null) {
			if (!isTemplated) {
				sBuilder.append(template);
				isTemplated = true;
			}

			String checkingInfo = "Account type Checking: \n" + checkingAcct.toString() + "\n";
			sBuilder.append(checkingInfo);
		}
		;
		if (retirementAcct != null) {
			if (!isTemplated) {
				sBuilder.append(template);
				isTemplated = true;
			}

			String retirementInfo = "Account type Retirement: \n" + retirementAcct.toString() + "\n";
			sBuilder.append(retirementInfo);
		}
		return sBuilder.toString();
	}

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
	
	

	public LocalDate getHireDate() {
		return this.hireDate;
	}

	@Override
	public String toString() {
		return getFormattedAcctInfo();
	}

}
