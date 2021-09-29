package com.marcosvinicius.serviceproduto.http;

import com.marcosvinicius.serviceproduto.http.data.request.ProdutoPersistDTO;
import com.marcosvinicius.serviceproduto.http.data.response.ProdutoResponseDto;
import com.marcosvinicius.serviceproduto.model.Produto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface ProdutoController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Produto inserir(@Valid @RequestBody ProdutoPersistDTO dto);

    @Operation(summary = "Retorna o produto correspondente ao identificador recuperado por parâmetro.")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "404",
                    content = @Content(
                            mediaType = "application/json",
                            examples = @ExampleObject(
                                    value = "{" +
                                            "   \"codigo\": \"X_100\", " +
                                            "   \"mensagem\": \"Produto de código 5777 não encontrado\"," +
                                            "   \"documentacao\": null" +
                                            "}"
                            )
                    )
            )
    })
    @GetMapping("{id}")
    Produto one(@PathVariable("id") Long id);
}
