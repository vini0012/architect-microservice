package com.marcosvinicius.serviceproduto.http;

import com.marcosvinicius.serviceproduto.http.data.request.ProdutoPersistDTO;
import com.marcosvinicius.serviceproduto.http.data.response.ProdutoResponseDto;
import com.marcosvinicius.serviceproduto.model.Produto;
import com.marcosvinicius.serviceproduto.service.ProdutoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("produto")
public class ProdutoControllerImpl implements ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoControllerImpl(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto inserir(@Valid @RequestBody ProdutoPersistDTO dto) {
        Produto produto = new Produto(dto.getDescricao(), dto.getValor());
        return produtoService.inserir(produto);
    }

    @Override
    @GetMapping("{id}")
    public Produto one(@PathVariable("id") Long id) {
        return produtoService.one(id);
    }

}
