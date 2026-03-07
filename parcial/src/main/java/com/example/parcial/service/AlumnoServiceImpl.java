package com.example.parcial.service;

import com.example.parcial.dto.AlumnoRequest;
import com.example.parcial.dto.AlumnoResponse;
import com.example.parcial.entity.Alumno;
import com.example.parcial.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<AlumnoResponse> listarTodos() {
        return alumnoRepository.findAll().stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public AlumnoResponse guardar(AlumnoRequest request) {
        Alumno alumno = new Alumno();
        alumno.setNombre(request.getNombre());
        alumno.setApellido(request.getApellido());
        alumno.setCarnet(request.getCarnet());
        alumno.setCorreo(request.getCorreo());
        alumno.setActivo(request.getActivo());

        Alumno guardado = alumnoRepository.save(alumno);
        return mapToResponse(guardado);
    }

    private AlumnoResponse mapToResponse(Alumno entity) {
        return new AlumnoResponse(
                entity.getId_alumno(),
                entity.getNombre(),
                entity.getApellido(),
                entity.getCarnet(),
                entity.getCorreo(),
                entity.getActivo()
        );
    }
}