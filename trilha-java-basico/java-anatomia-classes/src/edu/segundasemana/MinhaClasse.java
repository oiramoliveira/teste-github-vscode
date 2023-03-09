package edu.segundasemana;
public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Mario";
        String segundoNome = "Lopes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Retorno do metodo = ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }

}


