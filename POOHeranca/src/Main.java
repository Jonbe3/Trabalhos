import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();

        System.out.println("Quantos cursos deseja cadastrar?");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Tipo do curso (1-Programação / 2-Design): ");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Instrutor: ");
            String instrutor = sc.nextLine();

            System.out.print("Carga Horária: ");
            int carga = sc.nextInt();

            System.out.print("Preço por Hora: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            if (tipo == 1) {
                System.out.print("Linguagem: ");
                String linguagem = sc.nextLine();
                cursos.add(new CursoDeProgramacao(titulo, instrutor, carga, preco, linguagem));
            } else {
                System.out.print("Ferramenta: ");
                String ferramenta = sc.nextLine();
                cursos.add(new CursoDeDesign(titulo, instrutor, carga, preco, ferramenta));
            }

            System.out.println();
        }

        System.out.println("\n===== RELATÓRIO FINAL =====");
        for (Curso c : cursos) {
            c.gerarRelatorio();
            System.out.println();
        }

        sc.close();
    }
}
