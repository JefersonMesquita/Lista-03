package Exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lista3 {

	static Scanner scan = new Scanner(System.in);

	public static int[] gerarVetor(int tam) {
		int[] vetor = new int[tam];
		Random rand = new Random();

		System.out.println("Vetor:");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(50)-25;
			System.out.print(vetor[i] + " , ");
		}
		return vetor;
	}

	public static int[] gerarVetorBinario(int tam) {
		int[] vetor = new int[tam];
		Random rand = new Random();

		System.out.println("Vetor binário:");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(2);
			System.out.print(vetor[i] + " , ");
		}
		return vetor;
	}
	
	public static void pesquisa(int vet[]) {
		System.out.println("\n\nquestão 1:");
		
		System.out.println("Digite o valor que deseja encontrar");
		int c = 0, x = scan.nextInt();

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == x) {
				System.out.println("Na posição: " + i);
				c++;
			}
		}
		if (c == 0)
			System.out.print("-100\n");
	}

	public static void pesquisaPorIndice(int vet[]) {
		System.out.println("\nquestão 2:");
		
		System.out.println("Digite o indice para ver o número");
		int x = scan.nextInt();

		if (x < vet.length + 1) {
			System.out.println("O valor do indice: " + vet[x - 1]);
		} else {
			System.out.println("O indice não existe");
			pesquisaPorIndice(vet);
		}
	}

	public static void separacaoValoresPositivosNegativos(int vet[]) {
		System.out.println("\nquestão 3:");
		
		int aux = 0;
		int vetInv[] = vet;

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (vetInv[i] < vetInv[j]) {
					aux = vet[i];
					vetInv[i] = vetInv[j];
					vetInv[j] = aux;
				}
			}
		}
		
		System.out.println("O vetor com os números negativos e positivos separados: ");
		for (int result : vetInv)
			System.out.print(result + " , ");
	}

	public static void somatorio(int vet[]) {
		System.out.println("\n\nquestão 4:");
		
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma = soma + vet[i];
		}
		System.out.println("A soma dos números do vetor: " + soma);
	}

	public static void juncaoDeVetor(int vet[]) {
		System.out.println("\nquestão 5:");
		
		int vet2[] = gerarVetor(vet.length);
		int vetSoma[] = new int[vet2.length + vet.length];
		int s = 0;

		for (int i = 0; i < vet.length; i++)
			vetSoma[s++] = vet[i];
		for (int j = 0; j < vet2.length; j++)
			vetSoma[s++] = vet[j];

		System.out.println("\nA junçÃO dos 2 vetores");
		for (int a = 0; a < vet2.length + vet.length; a++)
			System.out.print(vetSoma[a] + " , ");
	}

	public static void inversaoDeOrdem(int vet[]) {
		System.out.println("\n\nquestão 6:");
		
		int vetAux[] = new int[vet.length];

		for (int i = 0; i < vet.length; i++) {
			vetAux[i] = vet[vet.length - i - 1];
		}
		System.out.println("O vetor em ordem inversa:");
		for (int a = 0; a < vet.length; a++)
			System.out.print(vetAux[a] + " , ");
	}

	public static void inversaoDeVetores(int vet[]) {
		System.out.println("\n\nquestão 7:");
		
		int vetAux[] = new int[vet.length];
		int vet2[] = gerarVetor(vet.length);

		for (int i = 0; i < vet2.length; i++) {
			vetAux[i] = vet[i];
			vet[i] = vet2[i];
			vet2[i] = vetAux[i];
		}
		System.out.println("\nvetor 1:");
		for (int i = 0; i < vet.length; i++)
			System.out.print(vet[i] + " , ");

		System.out.println("\nvetor 2:");
		for (int i = 0; i < vet2.length; i++) {
			System.out.print(vet2[i] + " , ");
		}
	}

	public static void priorizacao(int vet[]) {
		System.out.println("\n\nquestão 8:");
		
		int vet2[] = new int[vet.length];
		int soma = 0, media = 0, cont = 0;

		for (int i = 0; i < vet.length; i++)
			soma += vet[i];

		media = soma / 50;

		for (int i = 0; i < vet2.length; i++) {
			if (vet[i] > media) {
				vet2[cont] = vet[i];
				cont++;
			}
		}
		System.out.println("Vetor com números priorizados: ");
		for(int result: vet2)
			System.out.print(result + " , ");
	}

	public static void compactacao() {
		System.out.println("\n\nquestão 10: ");
		
		int vet2[] = gerarVetorBinario(50);
		int vetResp[] = new int[vet2.length * 2];
		int cont = 1, cont2 = 0, cont3 = 1;

		System.out.print("\nVetor compactado: ");
		for (int i = 1; i < vet2.length; i++) {
			if (vet2[i] == vet2[i - 1]) {
				cont++;
			} else {
				vetResp[cont3] = cont;
				cont3 += 2;
				vetResp[cont2] = vet2[i - 1];
				cont2 += 2;
				cont = 1;
			}
		}
		vetResp[cont3] = cont;
		System.out.println();
		for (int j : vetResp)
			System.out.print(j + " ");
	}

	public static void criptografia() {
		System.out.println("\n\nquestão 12:");
		
		char matrizCrip[][] = {
				{ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z', ' ' },
				{ 'a', '*', '(', '-', '+', '@', '#', '1', '2', '3', 'k', '4', '5', '6', '7', '8', '9', '{', '}', '!', '&', '$', '?', 'w', 'y', ':', ' ' } };
		
		System.out.println("Digite o texto para criptografar");
		String txt = new String();
		txt = scan.next();
		char[] txtChar = txt.toCharArray();
		char vetResp[] = new char[txt.length()];
		
		for (int i = 0; i < txt.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (txtChar[i] == matrizCrip[0][j]) {
					vetResp[i] = matrizCrip[1][j];
				}
			}
		}
		System.out.println("O texto criptografado: ");
		for (int result : vetResp) {
			System.out.print(result);
		}
	}
	
	public static void descriptografia() {
		System.out.println("\n\nquestão 13:");
		
		char matrizCrip[][] = {
				{ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z', ' ' },
				{ 'a', '*', '(', '-', '+', '@', '#', '1', '2', '3', 'k', '4', '5', '6', '7', '8', '9', '{', '}', '!', '&', '$', '?', 'w', 'y', ':', ' ' } };
		
		System.out.println("Digite o código para traduzir");
		String txt = new String();
		txt = scan.next();
		char[] txtChar = txt.toCharArray();
		char vetResp[] = new char[txt.length()];
		
		for (int i = 0; i < txt.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (txtChar[i] == matrizCrip[1][j]) {
					vetResp[i] = matrizCrip[0][j];
				}
			}
		}
		System.out.println("O texto descriptografado: ");
		for (int result : vetResp) {
			System.out.print(result);
		}
	}

	public static void contagemDeCaracteres(int vet[]) {
		System.out.println("\n\nquestão 14:");
		
		int cont = 0;

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (vet[i] == vet[j])
					cont++;
			}
			System.out.println(vet[i] + " - " + cont);
			cont = 0;
		}
	}

	public static void complementacao(int vet[]) {
		System.out.println("\nquestão 15:");
		
		int vet2[] = gerarVetor(vet.length);
		int vetResp[] = new int[vet.length];
		int x = 0;

		for (int i = 0, j = 0; i < vet.length; j++, i++) {
			if (vet[i] + vet2[j] != 10) {
				x = vet[i] + vet2[i];
				x = 10 - x;
				vetResp[i] = x;
			} else
				vetResp[i] = 0;
		}

		System.out.println("\nVetor complementado: ");
		for (int result : vetResp)
			System.out.print(result + " , ");
	}

	public static void polarizacao(int vet[]) {
		System.out.println("\n\nquestão 16:");
		
		int vetResp[] = new int[vet.length];
		int cont = 0;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 1 || vet[i] % 2 == -1) {
				vetResp[cont] = vet[i];
				cont++;
			}
		}
		for (int j = 0; j < vet.length; j++) {
			if (vet[j] % 2 == 0) {
				vetResp[cont] = vet[j];
				cont++;
			}
		}

		System.out.println("Vetor polarizado: ");
		for (int result : vetResp)
			System.out.print(result + " , ");
	}

	public static void explosao(int vet[]) {
		System.out.println("\n\nquestão 17:");
		
		int vetResp[] = new int[vet.length * 2];
		int cont = 0;

		for (int i = 0, j = 1, k = 0, l = 0; i < vet.length * 2; i += 2, j += 2, k++, l++) {
			vetResp[i] = vet[k];
			vetResp[j] = vet[l];
		}
		System.out.println("Vetor \"explodido\"");
		for (int result : vetResp)
			System.out.print(result + " , ");
	}

	public static void organizacao(int vet[]) {
		System.out.println("\n\nquestão 18");
		
		int vetResp[] = Arrays.copyOf(vet, vet.length);
		int aux = 0;

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++)
				if (vetResp[i] < vetResp[j]) {
					aux = vetResp[i];
					vetResp[i] = vetResp[j];
					vetResp[j] = aux;
				}
		}
		System.out.println("Vetor organizado: ");
		for (int result : vetResp)
			System.out.print(result + " , ");
	}

	public static void agrupamento(int vet[]) {
		System.out.println("\n\nquestão 19");
		
		System.out.println("Em quantas agrupamentos deseja separar o vetor?");
		int num = 1, cont = 0, y = 0, x = scan.nextInt();
		y = (vet.length / x) + 1;

		System.out.println("Grupamento " + num);
		for (int i = 0; i < vet.length; i++) {
			if (cont != y - 1) {
				System.out.print(vet[i] + " , ");
				cont++;
			} else {
				num++;
				System.out.println("\nGrupamento " + num);
				System.out.print(vet[i] + " , ");
				cont = 1;
			}
		}
	}

	public static void diferencaA(int vet[]) {
		System.out.println("\n\nquestão 20");
		
		int vet2[] = gerarVetor(vet.length);
		int cont = 0;

		System.out.println("\nElementos que estão em A que não estão em B: ");
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				if (vet[i] != vet2[j]) {
					cont++;
					if (cont == vet2.length) {
						System.out.print(vet[i] + " , ");
						cont = 0;
					}
				} else
					cont = 0;
			}
		}
	}

	public static void main(String[] args) {
		int tam = 50;
		int vet[] = gerarVetor(tam);
		pesquisa(vet);
		pesquisaPorIndice(vet);
		separacaoValoresPositivosNegativos(vet);
		somatorio(vet);
		juncaoDeVetor(vet);
		inversaoDeOrdem(vet);
		inversaoDeVetores(vet);
		priorizacao(vet);
		compactacao();
		criptografia();
		descriptografia();
		contagemDeCaracteres(vet);
		complementacao(vet);
		polarizacao(vet);
		explosao(vet);
		organizacao(vet);
		agrupamento(vet);
		diferencaA(vet);
	}
}