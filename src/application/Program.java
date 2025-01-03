package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		List<TaxPayer> taxPayer = new ArrayList<>();
		
		System.out.printf("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		System.out.println("\n");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite os dados do %do contribuinte: %n", i+1);
			System.out.printf("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.printf("Renda anual com prestação de serviço: ");
			double servicesIncome = sc.nextDouble();
			System.out.printf("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.printf("Gastos médicos: ");
			double healthSpending = sc.nextDouble();
			System.out.printf("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			
			taxPayer.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
			
			System.out.println("\n");
		}
		
		for(int i = 0; i < taxPayer.size(); i++) {
			TaxPayer TaxPayer = taxPayer.get(i);
			System.out.printf("Resumo do %do contribuinte: %n",i+1);
			System.out.println(TaxPayer);
		}
		
		
		
		
		sc.close();
	}

}