package com.marcosvinicius.serviceproduto.listener;

import com.marcosvinicius.serviceproduto.event.ProdutoPersistEvent;
import com.marcosvinicius.serviceproduto.model.Produto;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProdutoPersistLogListener implements ApplicationListener<ProdutoPersistEvent> {

    @Override
    public void onApplicationEvent(ProdutoPersistEvent event) {
        Produto produto = event.getProduto();
        System.out.println(produto.getDescricao());
    }
}
