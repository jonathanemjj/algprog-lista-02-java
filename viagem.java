import java.util.Scanner;

public class viagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preços
        System.out.print("Preço viagem Alemanha: ");
        double alemanha = sc.nextDouble();

        System.out.print("Preço viagem Portugal: ");
        double portugal = sc.nextDouble();

        System.out.print("Preço viagem Itália: ");
        double italia = sc.nextDouble();

        // Pessoas
        System.out.print("Quantidade de pessoas: ");
        int pessoas = sc.nextInt();

        double totalViagem = (alemanha + portugal + italia) * pessoas;

        System.out.println("Valor total da viagem: R$ " + totalViagem);

        sc.close();
    }
}