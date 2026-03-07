package com.example.parcial.controller;

import com.example.parcial.dto.AlumnoRequest;
import com.example.parcial.dto.AlumnoResponse;
import com.example.parcial.service.AlumnoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<AlumnoResponse> listar() {
        return alumnoService.listarTodos();
    }

    @PostMapping
    public AlumnoResponse guardar(@Valid @RequestBody AlumnoRequest request) {
        return alumnoService.guardar(request);
    }
}