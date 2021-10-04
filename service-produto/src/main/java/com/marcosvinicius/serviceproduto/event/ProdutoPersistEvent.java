package com.marcosvinicius.serviceproduto.event;

import com.marcosvinicius.serviceproduto.model.Produto;
import org.springframework.context.ApplicationEvent;

public class ProdutoPersistEvent extends ApplicationEvent {

    private final Produto produto;

    public ProdutoPersistEvent(Object source, Produto produto) {
        super(source);
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
}
