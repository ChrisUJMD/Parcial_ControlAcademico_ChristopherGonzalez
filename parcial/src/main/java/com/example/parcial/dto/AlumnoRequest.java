package com.example.parcial.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AlumnoRequest {
    @NotBlank(message = "Nombre es obligatorio")
    @Size(min = 2, max = 80, message = "Nombre debe tener entre 2 y 80 caracteres")
    private String nombre;

    @NotBlank(message = "Apellido es obligatorio")
    @Size(min = 2, max = 80, message = "Apellido debe tener entre 2 y 80 caracteres")
    private String apellido;

    @NotBlank(message = "Carnet es obligatorio")
    @Size(min = 4, max = 20, message = "Carnet debe tener entre 4 y 20 caracteres")
    private String carnet;

    @Email(message = "Correo debe ser válido")
    private String correo;

    private Boolean activo = true;

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getCarnet() { return carnet; }
    public void setCarnet(String carnet) { this.carnet = carnet; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public Boolean getActivo() { return activo; }
    public void setActivo(Boolean activo) { this.activo = activo; }
}