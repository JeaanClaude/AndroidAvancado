package com.example.jeanc.trabalhoandroidavancado;

import android.arch.lifecycle.LiveData;

import java.util.List;

@Dao
public interface PessoaDao {

    @Insert
    void insert(Pessoa pessoa);

    @Query("DELETE FROM pessoas")
    void deleteAll();

    @Query("SELECT * FROM pessoas ORDER BY nome ASC")
    LiveData<List<Pessoa>> getAllPeople();

    @Query("SELECT * FROM pessoas WHERE Pessoas.nome LIKE :nome")
    Pessoa findPessoa(String nome);
}