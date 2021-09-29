package com.marcosvinicius.serviceproduto.service;

import com.marcosvinicius.serviceproduto.model.Produto;

public interface ProdutoService {

    Produto inserir(Produto produto);

    Produto one(Long id);
}
