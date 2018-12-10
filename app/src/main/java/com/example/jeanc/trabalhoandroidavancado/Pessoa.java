package com.example.jeanc.trabalhoandroidavancado;


import android.support.annotation.NonNull;

@Entity(tableName = "pessoas")
public class Pessoa {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;

    private String nome;

    public Pessoa(String nome) {this.nome = nome;}

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}