/** Danilo Rodrigues Oliveira    RA: 81612248    SIN3AN-BUA */


package com.example.danilo.filmesdb;

public class FilmeDAO {
    private static Filme[] filmes;

    public FilmeDAO(){

    }

    public static Filme[] getFilmes(){
        if(filmes == null){
            filmes = new Filme[2];
            filmes[0] = new Filme(1,"De volta para o futuro","Filme muito legal","caminho foto","Mr. Director", 10);
            filmes[1] = new Filme(2,"Poderoso chefão","Filme muito legal","caminho foto","Mr. Director", 10);
            filmes[1] = new Filme(3,"MIB","Filme muito legal","caminho foto","Mr. Director", 10);
        }

        return filmes;
    }



}
