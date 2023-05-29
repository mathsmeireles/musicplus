package br.com.alura.musicplus.principal;

import br.com.alura.musicplus.modelos.Musica;
import br.com.alura.musicplus.modelos.Podcast;
import br.com.alura.musicplus.modelos.Preferencias;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Meant to Live");
        musica.setAlbum("The Beautiful Letdown");
        musica.setArtista("Switchfoot");
        musica.setGenero("Rock");
        for (int i = 0; i < 2001; i++) {
            musica.reproduz();
        }
        for (int i = 0; i < 30; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setHost("Marcus Mendes");
        for (int i = 0; i < 50; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            podcast.curte();
        }

        Preferencias preferencias = new Preferencias();
        preferencias.incluir(musica);
        preferencias.incluir(podcast);
    }
}