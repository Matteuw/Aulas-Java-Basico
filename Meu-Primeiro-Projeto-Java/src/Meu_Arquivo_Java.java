public class Meu_Arquivo_Java {


public static void main (String [] args) {
    
    String primeiroNome = "Mateus";
    String segundoNome = "Maia";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

    System.out.println(nomeCompleto);
    
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}
}