import java.util.Scanner;
public class Calculadora {
    private double numeroUm, numeroDois;
    private Scanner input;

    public Calculadora(){
        input = new Scanner(System.in);
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(double numeroDois) {
        this.numeroDois = numeroDois;
    }

    public double getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }
    public void menu(){
        System.out.println("Calculadora!");
        System.out.println("Escolha um numero ou letra!");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potência");
        System.out.println("6 - Raiz Quadrada");
        System.out.println("Q - Sair");
        System.out.println("Opção: ");
    }
    public void adicao(){
        System.out.println("Digite o primeiro número: ");
        numeroUm = input.nextDouble();
        System.out.println("Digite o segundo número!");
        numeroDois = input.nextDouble();
        System.out.printf("O resultado é: %.2f" , numeroUm + numeroDois);
    }
    public void subtracao(){
        System.out.println("Digite o primeiro número: ");
        numeroUm = input.nextDouble();
        System.out.println("Digite o segundo número!");
        numeroDois = input.nextDouble();
        System.out.printf("O resultado é: %.2f" , numeroUm - numeroDois);
    }
    public void multiplicacao(){
        System.out.println("Digite o primeiro número: ");
        numeroUm = input.nextDouble();
        System.out.println("Digite o segundo número!");
        numeroDois = input.nextDouble();
        System.out.printf("O resultado é: %.2f" , numeroUm * numeroDois);
    }
    public void divisao(){
        System.out.println("Digite o primeiro número: ");
        numeroUm = input.nextDouble();
        System.out.println("Digite o segundo número!");
        numeroDois = input.nextDouble();
        if (numeroDois == 0)
        System.out.println("Impossível realizar uma divisão por zero.");
        else{
        System.out.printf("O resultado é: %.2f" , numeroUm / numeroDois);
        }
    }
    public void potencia(){
        System.out.println("Digite o primeiro número: ");
        numeroUm = input.nextDouble();
        System.out.println("Digite o segundo número!");
        numeroDois = input.nextDouble();
        System.out.printf("O resultado é: %.2f" , Math.pow(numeroUm, numeroDois));
    }
    public void raizQuadrada(){
        System.out.println("Digite um número: ");
        numeroUm = input.nextDouble();
        if (numeroUm < 0)
        System.out.println("Não existe raiz de número negativo");
        else{
        System.out.printf("O resultado é: %.2f" , Math.sqrt(numeroUm));
    }
    }
}
