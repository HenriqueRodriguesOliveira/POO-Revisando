public class PlantaCasa {
    //Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void contruir(){
        System.out.println("A casa foi construída, as características são: ");
        System.out.println("Metragem " + metragem);
        System.out.println("Numero de quartos " + numeroQuartos);
        System.out.println("Numero de banheiros" + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public void pintar(){
        System.out.println("A casa foi pintada de " + cor);
    }
}
