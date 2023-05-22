import java.util.Scanner;
public class Exclusao{
    Scanner scanner = new Scanner(System.in);
    public void excluirPorId(ControleArray controleArray){
        System.out.println("Digite o ID da candidata para excluir: ");
        int id = Integer.parseInt(scanner.nextLine());
        if(id < controleArray.getTotal() && id > controleArray.getTotal()){
            System.out.println("Não existe esse id!!");
        }else {
            controleArray.removerArray(id);
        }

    }

}
