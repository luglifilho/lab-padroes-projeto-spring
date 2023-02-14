package projetos.java;

import com.sun.source.tree.WhileLoopTree;

public class Pilha {

    private No refNoEntradapilha;


    public Pilha() {
        this.refNoEntradapilha = null;
    }
    public  void push( No novoNo){
        No refAuxiliar = refNoEntradapilha;
        refNoEntradapilha = novoNo;
        refNoEntradapilha.setReNo(refAuxiliar);

    }

    public No pop( ){
        if (this.isEmpty()){
            No noPoped = refNoEntradapilha;
            refNoEntradapilha = refNoEntradapilha.getReNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradapilha;
    }

    public boolean isEmpty(){

        if (refNoEntradapilha == null){
    //        return true;
  //
       }
     //   return  false;
        return refNoEntradapilha == null ? true : false;

    }

    @Override
    public String toString() {
        String stringRetorno = " ----------------------\n";
        stringRetorno += " Pilha\n";
        stringRetorno += " ---------------------\n";

        No noAuxiliar = refNoEntradapilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += " [No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReNo();

            }else {

            } break;
        }
        stringRetorno += " ==================\n";
        return  stringRetorno;
    }
}
