package application;
import java.util.Scanner;
import entities.ContaBancaria;

/* ENUNCIADO
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.
(exemplos nas próximas páginas)
*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// recebendo os dados do usuario
		System.out.println("Enter account numer: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine(); // para o nextLine não consumir essa linha
		String titular = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		ContaBancaria conta1 = new ContaBancaria(number, titular); // Instanciando um objeto ContaBancaria
		
		double value;
		
		// verifica se o usuario deseja realizar um deposito inicial
		if(option == 'y') {
			System.out.println("Enter initial deposit value: ");
			value = sc.nextDouble();
			System.out.println("Account created with deposit");
		}
		else {
			System.out.println("Account created");
			value = 0;
		}
		
		conta1.deposit(value); // chama a função "Deposit"
		System.out.println(conta1); // printa o objeto "conta1"
		
		System.out.println("Enter a deposit value: ");
		value = sc.nextDouble();
		conta1.deposit(value); // chama a função "Deposit"
		System.out.println("Updated account data: ");
		System.out.println(conta1); // printa o objeto "conta1"
		
		System.out.println("Enter a withdraw value: ");
		value = sc.nextDouble();
		conta1.withDraw(value); // chama a função "WithDraw"
		System.out.println("Updated account data: ");
		System.out.println(conta1); // printa o objeto "conta1"
		
		
		   sc.close();
		}
}
