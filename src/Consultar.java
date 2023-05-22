public class Consultar{

    public void consultarCandidatas(ControleArray controleArray){
        controleArray.Mostrar();
    }
    public void consultarPorId(int id, ControleArray controleArray){
        if(id < controleArray.getTotal()-1 && id > controleArray.getTotal()-1){
            System.out.println("Não existe esse id!");
        }else{
            controleArray.MostrarPorId(id);
        }
    }
}
