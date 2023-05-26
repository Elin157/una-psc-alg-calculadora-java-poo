import java.util.Scanner;
class ProgramaCalculadora{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        char numero;
        do {
            calculadora.menu();
            numero = input.nextLine().toUpperCase().charAt(0);
            switch (numero) {
                case '1':
                    calculadora.adicao();
                    break;
                case '2':
                    calculadora.subtracao();
                    break;
                case '3':
                    calculadora.multiplicacao();
                    break;
                case '4':
                    calculadora.divisao();
                    break;
                case '5':
                    calculadora.potencia();
                    break;
                case '6':
                    calculadora.raizQuadrada();
                    break;
                case 'Q':
                    System.out.println("Desligando calculadora!");
                    break;
                default:
                    System.out.println("Opção invalida digite novamente!");
                    break;
            }
        } while (numero != 'Q');
    input.close();
    }
}