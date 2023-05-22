import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Incluir incluir = new Incluir();
        Consultar consultar = new Consultar();
        ControleArray controleArray = new ControleArray();
        Exclusao exclusao = new Exclusao();

        while (true){
            System.out.println("""
                ======================
                Escolha uma opção: \s
                ( 1 ) – Incluir
                ( 2 ) – Consultar
                ( 3 ) – Alterar
                ( 4 ) – Excluir
                ( 5 ) – Relatar
                ( 6 ) – Sair
                ======================
                """);

            int resp = Integer.parseInt(scanner.nextLine());

            if (resp == 1){
                incluir.incluirCandidatas(controleArray);
            }
            if (resp == 2 ){
                System.out.println("Você deseja consultar por um id? (1-SIM/2-NÃO)");
                int resp2 = Integer.parseInt(scanner.nextLine());
                if(resp2 == 1){
                    System.out.println("Digite o id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    consultar.consultarPorId(id, controleArray);
                }else {
                    consultar.consultarCandidatas(controleArray);
                }

            }
            if (resp == 3){
                System.out.println("Digite o id da canditada que deseja alterar: ");
                int id = Integer.parseInt(scanner.nextLine());
                Alterar alterar = new Alterar(id, controleArray);

            }
            if (resp == 4){
                exclusao.excluirPorId(controleArray);

            }
            if(resp == 5){
                Relatorio relatorio = new Relatorio(controleArray);

            }
            if (resp == 6){
                break;
            }
        }

    }
}