package br.com.ucsal.olimpiadas.prova;

public class CalculadoraAcertos {

    public int calcular(Tentativa tentativa) {
        int acertos = 0;

        for (Resposta resposta : tentativa.getRespostas()) {
            if (resposta.isCorreta()) {
                acertos++;
            }
        }
        return acertos;
    }
}
