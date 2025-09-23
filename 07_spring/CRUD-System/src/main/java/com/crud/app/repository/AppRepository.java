package com.crud.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.crud.app.models.Pessoa;


public interface AppRepository extends CrudRepository<Pessoa, String> {
    Pessoa findByIdPessoa(long idPessoa);
    Pessoa deleteByIdPessoa(long idPessoa);
}
