public class Arrays {
    public static void main(String[] args) {
        //Declaração de Array
        int[] numeros = {10,20,30,40,50,1};
        String [] frutas;

        //Inicializador
        frutas = new String[]{"Maçã", "Morango", "Abacaxi"};

        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.00;
        salarios[0] = 150.00;
        salarios[2] = 25.00;
        salarios[4] = 100.00;

        for(int posicao = 3; posicao < salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }
    }
}
