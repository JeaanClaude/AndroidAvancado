package com.example.jeanc.trabalhoandroidavancado;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;


public class PessoaModel extends AndroidViewModel {

    private PessoaRespository mRepository;
    private LiveData<List<Pessoa>> mAllPessoas;

    public PessoaModel(@NonNull Application application) {
        super(application);
        mRepository = new PessoaRespository(application);
        mAllPessoas = mRepository.getmAllPessoas();
    }

    public LiveData<List<Pessoa>> getmAllPessoas() {return mAllPessoas;}

    public void insert(Pessoa pessoa) {mRepository.insert(pessoa);}
}