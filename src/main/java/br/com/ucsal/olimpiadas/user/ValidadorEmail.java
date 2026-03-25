package br.com.ucsal.olimpiadas.user;

public class ValidadorEmail {

    public static void validar(String email) {
        if (email == null || email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
    }
}
