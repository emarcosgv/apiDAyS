package controller;

import controller.response.CustomError;
import dto.delincuente.DelincuenteOutputDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name="Delitos", description = "Delito operaciones")
public class DelitoController extends BaseController{

    @GetMapping(value = "/delincuente/{id}")
     @Operation(summary = "Get a delicuente", description = "Get a delincuente")
     @ApiResponses(value = {
         @ApiResponse(responseCode = "200", description = "OK", content = {
             @Content(mediaType = "application/json", schema = @Schema(implementation = DelincuenteOutputDTO.class))
         })
     })
    public String getDelincuente(@PathVariable Long id) { // Cambiado el tipo de retorno a String y el parámetro si es necesario
        return "Hello World"; // Retorna la cadena "Hello World"
    }




}
