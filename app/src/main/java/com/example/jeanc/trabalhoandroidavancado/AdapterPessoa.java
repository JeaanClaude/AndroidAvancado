package com.example.jeanc.trabalhoandroidavancado;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class AdapterPessoa extends RecyclerView.Adapter<AdapterPessoa.PessoaViewHolder> {

    public class PessoaViewHolder extends RecyclerView.ViewHolder{
        private final TextView pessoaItemView;

        private PessoaViewHolder(View itemView) {
            super(itemView);
            pessoaItemView = itemView.findViewById(R.id.textView);
        }
    }

    private final LayoutInflater mInflater;
    private List<Pessoa> mPessoas;

    public PessoaListAdapter(Context context){mInflater = LayoutInflater.from(context);}

    @NonNull
    @Override
    public PessoaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = mInflater.inflate(R.layout.recycleview_item, viewGroup,false);
        return new PessoaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PessoaViewHolder holder, int position) {
        if(mPessoas != null) {
            Pessoa current = mPessoas.get(position);
            holder.pessoaItemView.setText(current.getNome());
        } else {
            holder.pessoaItemView.setText("Sem pessoas");
        }

    }

    public void setPessoas(List<Pessoa> pessoas) {
        mPessoas = pessoas;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if(mPessoas != null)
            return mPessoas.size();
        else return 0;
    }



}