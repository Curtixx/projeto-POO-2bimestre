import java.util.*;
public class Alterar extends Consultar {
    Scanner entrada = new Scanner(System.in);

    public Alterar(int id, ControleArray controleArray){
        System.out.println("Nome da candidata: ");
        String nome = entrada.nextLine();
        System.out.println("Simpatia: ");
        int simpatia = Integer.parseInt(entrada.nextLine());
        System.out.println("Elegância: ");
        int elegancia = Integer.parseInt(entrada.nextLine());
        System.out.println("Beleza: ");
        int beleza = Integer.parseInt(entrada.nextLine());

        Candidata candidataAlterar = controleArray.getCandidata(id);

        candidataAlterar.setNome(nome);
        candidataAlterar.setSimpatia(simpatia);
        candidataAlterar.setElegancia(elegancia);
        candidataAlterar.setBeleza(beleza);
        System.out.println("Alteração feita!");
        consultarPorId(id, controleArray);
    }
}
