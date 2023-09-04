import java.util.Scanner;

public class calculator {
    public calculator() {
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Escolha a operação: soma, subtração, multiplicação ou divisão");
        String operation = value.nextLine();

        double result = 0.0;
        double valueA;
        double valueB;


        switch (operation) {
            case "soma":
                System.out.println("Digite o primeiro valor:");
                valueA = value.nextDouble();
                System.out.println("Digite o segundo valor:");
                valueB = value.nextDouble();

                result = valueA + valueB;
                System.out.println(result);
                break;
            case "subtração":
                System.out.println("Digite o primeiro valor:");
                valueA = value.nextDouble();
                System.out.println("Digite o segundo valor:");
                valueB = value.nextDouble();

                result = valueA - valueB;
                System.out.println(result);
                break;
            case "multiplicação":
                System.out.println("Digite o primeiro valor:");
                valueA = value.nextDouble();
                System.out.println("Digite o segundo valor:");
                valueB = value.nextDouble();

                result = valueA * valueB;
                System.out.println(result);
                break;
            case "divisão":
                System.out.println("Digite o primeiro valor:");
                valueA = value.nextDouble();
                System.out.println("Digite o segundo valor:");
                valueB = value.nextDouble();

                if (valueB != 0.0) {
                    result = valueA / valueB;
                    System.out.println(result);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Operação inválida!");
                System.exit(1);
        }

    }
}
