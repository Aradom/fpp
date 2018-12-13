package w3l8.prob2;

import java.util.Objects;

public class Marketing {
	String employeeName, productName;
	double salesAmount;

//	public Marketing() {
//		// TODO Auto-generated constructor stub
//	}

	public Marketing(String employeeName, String productName, double salesAmount) {
		super();
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee name: " + employeeName + " Product Name :" + productName + " Sales Amount: " + salesAmount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Marketing))
			return false;

		Marketing marketingObj = (Marketing) obj;

		return this.employeeName.equals(marketingObj.getEmployeeName())
				&& this.productName.equals(marketingObj.getProductName())
				&& this.salesAmount == marketingObj.getSalesAmount();

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.employeeName, this.productName, this.salesAmount);
	}

}
