public class Relatorio extends Consultar {

    public Relatorio(ControleArray controleArray){
        Candidata[] media;
        Candidata aux;
        media = controleArray.MostrarMedia();

        for(int i = 0; i < controleArray.getTotal() -1; i++){
            for(int j = 0; j < controleArray.getTotal()-1 -i; j++){
                if(media[j].getMedia() < media[j+1].getMedia()){
                    aux = media[j];
                    media[j] = media[j+1];
                    media[j+1] = aux;
                }
            }
        }

        for(int i = 0; i <= controleArray.getTotal() -1; i++){
            System.out.println(i+1+"° "+media[i].getMedia());
        }

    }

}
