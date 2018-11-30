package week3.prog2;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Selam", "Sel", 9444, 2000, 11, 14);

		Account emp1CheckingAcct = new Account(emp1, AccountType.CHECKING, 300.00);
		Account emp1SavingAcct = new Account(emp1, AccountType.SAVINGS, 300);
		Account emp1RetirementAcct = new Account(emp1, AccountType.RETIREMENT, 300);

		emp1CheckingAcct.makeDeposit(115);
		emp1SavingAcct.makeWithdrawal(200);
		emp1RetirementAcct.makeWithdrawal(50);

		Account[] accountArray = { emp1CheckingAcct, emp1SavingAcct, emp1RetirementAcct };

		for (Account acc : accountArray) {
			System.out.println(acc.toString());
		}
	}
}
