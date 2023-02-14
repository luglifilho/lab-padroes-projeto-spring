public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println(intA +intB);
        intA = 2;
        System.out.println(intA +intB);

        Object num;
        MeuObj objA = new MeuObj(num: 1);
        MeuObj objB = objA;

        System.out.println(objA + " " + objB);



    }
}