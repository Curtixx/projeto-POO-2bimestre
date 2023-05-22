import java.util.*;
public class Incluir{

    Scanner entrada = new Scanner(System.in);

    public void incluirCandidatas(ControleArray controleArray){
        System.out.println("Numero de pessoas: ");
        int qtd = Integer.parseInt(entrada.nextLine());
        for(int i = 0; i<= qtd -1; i++){
            Candidata candidata = new Candidata();
            System.out.println("Nome da candidata: ");
            String nome = entrada.nextLine();
            System.out.println("Simpatia: ");
            int simpatia = Integer.parseInt(entrada.nextLine());
            System.out.println("Elegancia: ");
            int elegancia = Integer.parseInt(entrada.nextLine());
            System.out.println("Beleza: ");
            int beleza = Integer.parseInt(entrada.nextLine());
            float media = (simpatia + elegancia * 3 + beleza * 4) / 8;
            candidata.setId(i);
            candidata.setNome(nome);
            candidata.setSimpatia(simpatia);
            candidata.setElegancia(elegancia);
            candidata.setBeleza(beleza);
            candidata.setMedia(media);
            controleArray.addArray(candidata);

        }
        controleArray.Mostrar();

    }

}
