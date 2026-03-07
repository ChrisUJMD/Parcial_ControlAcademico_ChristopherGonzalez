package com.example.parcial.dto;

public class AlumnoResponse {
    private Integer id_alumno;
    private String nombre;
    private String apellido;
    private String carnet;
    private String correo;
    private Boolean activo;

    public AlumnoResponse() {}

    public AlumnoResponse(Integer id_alumno, String nombre, String apellido, String carnet, String correo, Boolean activo) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.correo = correo;
        this.activo = activo;
    }

    // Getters y Setters
    public Integer getId_alumno() { return id_alumno; }
    public void setId_alumno(Integer id_alumno) { this.id_alumno = id_alumno; }
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