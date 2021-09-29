package com.marcosvinicius.serviceproduto.repository;

import com.marcosvinicius.serviceproduto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
