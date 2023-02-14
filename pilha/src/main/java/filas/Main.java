package filas;

public class Main {

    public static void main( String[] args){
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
       minhaFila.enqueue(new No("segundo"));
        //minhaFila.first(new No("terceiro"));
       // minhaFila.first(new No("quarto"));
    }

}
