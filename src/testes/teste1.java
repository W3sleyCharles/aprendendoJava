package testes;
public class teste1 {

    public static void main (String [] args) {

    String um = "Wesley";
    String dois = "Charles";
    String completo = completo (um, dois);

    System.out.println(completo);
    }

    public static String completo (String um, String dois) {
        return um.concat(" ").concat(dois);
    }
}
