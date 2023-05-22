public class ControleArray{
    private Candidata[] candidata = new Candidata[100];
    private int total;

    public void addArray(Candidata candidata){
        this.candidata[this.total] = candidata;
        this.total++;
    }

    public void removerArray(int id){
        for (int i = id; i <= this.total; i++){
            this.candidata[i] = this.candidata[id+1];
        }
        this.total--;
    }

    public void Mostrar(){
        if (this.total == 0){
            System.out.println("Não existe registro!");
        }else {
            for (int i =0;i<=this.total-1;i++){
                System.out.println(this.candidata[i].getNome());
            }
        }
    }public Candidata[] MostrarMedia(){
        if (this.total == 0){
            System.out.println("Não existe registro!");
        }else {
            return this.candidata;

        }
        return new Candidata[0];
    }

    public Candidata getCandidata(int id){
        return this.candidata[id];
    }

    public void MostrarPorId(int id){
        System.out.println("Id: "+candidata[id].getId());
        System.out.println("Nome: "+candidata[id].getNome());
        System.out.println("Simpatia: "+candidata[id].getSimpatia());
        System.out.println("Elegância: "+candidata[id].getElegancia());
        System.out.println("Beleza: "+candidata[id].getBeleza());
        System.out.println("Média: "+candidata[id].getMedia());

    }
    public int getTotal(){
        return this.total;
    }


}
