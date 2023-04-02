import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Tabela {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String a; String b; String c; String d; String e;

        System.out.println("  <- Hibrael informe um nome: ");
        a = leitor.nextLine();
        while(!a.equals("3")) {
            System.out.println("  <- invalido informe primeiro: ");
            a = leitor.nextLine();
        }
        System.out.println("  <- informe segundo: ");
        b = leitor.nextLine();
        while(!b.equals("27")) {
            System.out.println("  <- invalido informe o segundo: ");
            b = leitor.nextLine();
        }
        System.out.println("  <- informe terceiro: ");
        c = leitor.nextLine();
        while(!c.equals("10")) {
            System.out.println("  <- invalido informe terceiro: ");
            c = leitor.nextLine();
        }
        System.out.println("  <- informe quarto: ");
        a = leitor.nextLine();
        while(!a.equals("-1")) {
            System.out.println("  <- invalido informe quarto: ");
            a = leitor.nextLine();
        }
        System.out.println("  <- informe quinto: ");
        c = leitor.nextLine();
        while(!c.equals("17")) {
            System.out.println("  <- invalido informe quinto: ");
            c = leitor.nextLine();
        }
        System.out.println("terminou");
    }
}