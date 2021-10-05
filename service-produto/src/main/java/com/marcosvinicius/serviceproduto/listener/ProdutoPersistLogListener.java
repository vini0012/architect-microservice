package com.marcosvinicius.serviceproduto.listener;

import com.marcosvinicius.serviceproduto.event.ProdutoPersistEvent;
import com.marcosvinicius.serviceproduto.model.Produto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProdutoPersistLogListener implements ApplicationListener<ProdutoPersistEvent> {

    private final Logger logger = LoggerFactory.getLogger(ProdutoPersistLogListener.class);

    @Override
    public void onApplicationEvent(ProdutoPersistEvent event) {
        Produto produto = event.getProduto();
        logger.info("Inserindo o produto: {}", produto);
    }
}
