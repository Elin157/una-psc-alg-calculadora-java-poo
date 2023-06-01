import java.util.Scanner; 
public class ProgramaDois { 
    public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in);
    Calculadora calculadora = new Calculadora();

    double numeroUm, numeroDois;
    String operacao;
    
    do {
    System.out.println("\nCalculadora"); 
    System.out.println("Escolha a operacao:");
    System.out.println("[A]Adição");
    System.out.println("[B]Subtração");
    System.out.println("[C]Multiplicação");
    System.out.println("[D]Divição");
    System.out.println("[E]Potência");
    System.out.println("[F]Raíz quadrada");
    System.out.println("[Q]Sair");
    operacao = scanner.nextLine();
    if (operacao.equalsIgnoreCase("q")) {
        System.out.println("\nEncerrando o programa...");
        break;
    }

    System.out.println("\nInforme o primeiro número:");
    numeroUm = scanner.nextDouble(); 
    calculadora.setNumeroUm(numeroUm);
   
    System.out.println("\nInforme o segundo número:");
    numeroDois = scanner.nextDouble(); 
    calculadora.setNumeroDois(numeroDois);

    switch(operacao) {

        
        case "a":
        double resultadoSoma = calculadora.somar();
        System.out.println("Resultado da adição:" + resultadoSoma);
        break;

        
        case "b":
        double resultadoSubtracao = calculadora.subtrair();
        System.out.println("Resultado da subtração:" + resultadoSubtracao);
        break;

       
       case "c":
        double resultadoMultiplicacao = calculadora.multiplicar();
        System.out.println("Resultado da Multiplicação:" + resultadoMultiplicacao);
        break;

        
        case "d":
        double resultadoDivisao = calculadora.dividir();
        if (numeroUm == 0 || numeroDois == 0){
            System.out.println("Impossível realizar uma divisão por zero.");
        }
        else {
        System.out.println("Resultado da Divisão:" + resultadoDivisao);
        }
        break;

       
        case "e":
        double resultadoPotencia = calculadora.potencia();
        if (numeroDois == 0) {
            System.out.println("Todo número elevado a zero será igual a 1.");
            System.out.println("Resultado da potência:" + resultadoPotencia);
        }
        else {
        System.out.println("Resultado da potência:" + resultadoPotencia);
        }
        break;

    
       case "f":
        double resultadoRaizQuadrada = calculadora.raizQuadrada();
        if (numeroUm < 0 || numeroDois < 0){
            System.out.println("\nNão existe raiz de número negativo.");
        }
        else{
        System.out.println("\nResultado da raíz quadrada:" + resultadoRaizQuadrada);
        }
        break;

        
        default:
        System.out.println("Encerrando o programa...");
        break;
    }
    scanner.nextLine();
    } while(!operacao.equals("q"));
    scanner.close();
   }
}