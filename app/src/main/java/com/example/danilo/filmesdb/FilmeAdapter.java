package com.example.danilo.filmesdb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FilmeAdapter extends BaseAdapter{

    private Filme[] filmes;
    private Context context;

    public FilmeAdapter(Filme[] filmes, Context context) {
        this.filmes = filmes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return filmes.length;
    }

    @Override
    public Object getItem(int position) {
        return filmes[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View linha = convertView;
        if (linha == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            linha = inflater.inflate(R.layout.linha_filme, parent, false);
            ImageView foto = linha.findViewById(R.id.foto_filme);
            TextView linha_titulo = linha.findViewById(R.id.linha_titulo);
            TextView linha_descricao = linha.findViewById(R.id.linha_descricao);
            ViewHolder holder = new ViewHolder (foto, linha_titulo, linha_descricao);
            linha.setTag(holder);
        }

        Filme filme = filmes[position];
        ViewHolder holder = (ViewHolder)linha.getTag();

        holder.getLinha1().setText(filme.getTitulo());
        holder.getLinha2().setText(filme.getDescricao()+ " - " + filme.getDiretor());

        //Drawable figura = Util.getImagem(context,filme.)

       // holder.getImagem().setImageDrawable(figura);

        return linha;
    }
}
