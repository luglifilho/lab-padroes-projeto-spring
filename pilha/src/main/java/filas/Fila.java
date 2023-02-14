package filas;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }


    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila =novoNo;
    }

    public No first(No segundo){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return  primeiroNo;
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringtoString = "";
        No noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila != null){
            while (true){
                stringtoString += " No {objeto=" + noAuxiliar.getObject() + " } ---->";
                noAuxiliar = noAuxiliar.getRefNo();
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringtoString = "null";
                    break;
                }
            }
        }else {
            stringtoString = "null";
        }
        return stringtoString;
    }
}
