package aplication;

import java.util.Scanner;

import util.Calculo;

public class Banco {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Calculo dados = new Calculo();

		int escolha;
		double valor;

		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 > Depositar valor");
			System.out.println("2 > Remover valor");
			System.out.println("3 > Adicionar produto");
			System.out.println("4 > despesas");
			System.out.println("5 > Consultar saldo");
			System.out.println("6 > Encerrar");
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Digite o valor a ser adicionado: ");
				valor = sc.nextDouble();
				dados.addconta(valor);

				break;
			case 2:
				System.out.println("Digite o valor a ser removido: ");
				valor = sc.nextDouble();
				dados.removeSaldo(valor);
				System.out.printf("\nConta: ");
				break;

			case 3:
				System.out.println("Nome do produto : ");
				String nomeProduto = sc.next();
				dados.setNomeProdutos(nomeProduto);
				dados.addProduto(nomeProduto);
				System.out.println(dados.getNomeProdutos());
				System.out.println("Valor do produto : ");
				double valorProduto = sc.nextDouble();
				dados.setValorProduto(valorProduto);
				dados.compraProduto();

				break;

			case 4:
				System.out.println(dados.getDepesas());
				break;
			case 5:
				System.out.println("Saldo atual :" + dados.getSaldo());
				break;

			case 6:
				System.out.println("Xauuuuuuuuuu obrigadoooooo.");
				break;
			default:
				System.out.println("Tente novamente.");
				break;
			}
		} while (escolha != 4);

		sc.close();
	}
}
