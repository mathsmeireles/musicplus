package br.com.alura.musicplus.modelos;

public class Preferencias {
    public void incluir(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " está entre os títulos preferidos da galera");
        } else {
            System.out.println(audio.getTitulo() + " não está entre os títulos preferidos da galera");
        }
    }
}
