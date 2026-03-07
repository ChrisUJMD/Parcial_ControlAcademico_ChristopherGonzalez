package com.example.parcial.service;

import com.example.parcial.dto.AlumnoRequest;
import com.example.parcial.dto.AlumnoResponse;
import java.util.List;

public interface AlumnoService {
    List<AlumnoResponse> listarTodos();
    AlumnoResponse guardar(AlumnoRequest request);
}