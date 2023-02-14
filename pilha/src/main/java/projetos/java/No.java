package projetos.java;

public class No {

        private int dado;
        private No reNo = null;

    public No(int dado, No reNo) {
        this.dado = dado;
        this.reNo = reNo;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReNo() {
        return reNo;
    }

    public void setReNo(No reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                ", reNo=" + reNo +
                '}';
    }

    public No(int dado) {
        this.dado = dado;
    }

    public No(No reNo) {
        this.reNo = reNo;
    }
}
