package Level2;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thu nhập hàng năm (triệu đồng): ");
        double annualIncome = scanner.nextDouble();

        double tax = calculateTax(annualIncome);
        System.out.printf("Thuế thu nhập cá nhân phải trả: %.2f triệu đồng\n", tax);
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income > 80) {
            tax += (income - 80) * 0.35;
            income = 80;
        }
        if (income > 52) {
            tax += (income - 52) * 0.30;
            income = 52;
        }
        if (income > 32) {
            tax += (income - 32) * 0.25;
            income = 32;
        }
        if (income > 18) {
            tax += (income - 18) * 0.20;
            income = 18;
        }
        if (income > 10) {
            tax += (income - 10) * 0.15;
            income = 10;
        }
        if (income > 5) {
            tax += (income - 5) * 0.10;
            income = 5;
        }
        if (income > 0) {
            tax += income * 0.05;
        }

        return tax;
    }
}
