package pe.egcc.cursoapp.controller;

import java.util.List;
import pe.egcc.cursoapp.dto.ProductoDto;
import pe.egcc.cursoapp.service.contrato.CursoService;
import pe.egcc.cursoapp.service.implementacion.CursoServiceImpl;

public class CursoController {

    private CursoService cursoService;

    public CursoController() {
        cursoService = new CursoServiceImpl();
    }

    public String[] getCategorias() {
        return cursoService.getListaCategoria();
    }

    public void registrarProducto(ProductoDto dto) {
        cursoService.registrarProducto(dto);
    }

    public List<ProductoDto> getProductos(String categoria) {
        return cursoService.getProductos(categoria);
    }

    public List<ProductoDto> getAllProductos() {
        return cursoService.getAllProductos();
    }
}
