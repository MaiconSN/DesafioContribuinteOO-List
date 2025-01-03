package entities;

public class TaxPayer {
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpeding;
	
	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpeding) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpeding = educationSpeding;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpeding() {
		return educationSpeding;
	}

	public void setEducationSpeding(Double educationSpeding) {
		this.educationSpeding = educationSpeding;
	}
	
	public Double salaryTax() {
		double salaryTax = 0.00;
		if(salaryIncome < 3000.00) {
			return salaryTax;
		}
		else if (salaryIncome >= 3000.00 && salaryIncome <= 5000.00){
			salaryTax = salaryIncome * 10 / 100;
			return salaryTax;
		}
		else {
			salaryTax = salaryIncome * 20 / 100;
			return salaryTax;
		}
	}
	
	public Double servicesTax() {
		double servicesTax = 0.00;
		if(servicesIncome > 0.00) {
			servicesTax = servicesIncome * 15 / 100;
			return servicesTax;
		}
		else {
			return servicesTax;
		}
	}
	
	public Double capitalTax() {
		double capitalTax = 0.00;
		if(capitalIncome > 0.00) {
			capitalTax = capitalIncome * 20 / 100;
			return capitalTax;
		}
		else {
			return capitalTax;
		}	
	}
	
	public Double grossTax() {
		double grossTax = salaryTax() + servicesTax() + capitalTax();
		return grossTax;
	}
	
	public Double taxRebate() {
		double taxRebate = healthSpending + educationSpeding;
		if(taxRebate >= grossTax() * 30 / 100) {
			taxRebate = grossTax() * 30 / 100;
			return taxRebate;
		}
		else {
			return taxRebate;
		}
	}
	
	public Double netTax() {
		double netTax = grossTax() - taxRebate();
			return netTax;
	}
	
	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f%n", grossTax())
		+ "Abatimento: " + String.format("%.2f%n",taxRebate())
		+ "Imposto devido: " + String.format("%.2f%n", netTax())
		+ "\n";
	}
	
	
	
}
	


