-- 1. Crear la base de datos 
CREATE DATABASE control_academico;
USE control_academico;

-- 2. Crear Tabla Alumno 
CREATE TABLE Alumno (
    id_alumno INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    carnet VARCHAR(20) UNIQUE NOT NULL,
    correo VARCHAR(100),
    activo BOOLEAN DEFAULT TRUE
);

-- 3. Crear Tabla Curso
CREATE TABLE Curso (
    id_curso INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    codigo VARCHAR(20) UNIQUE NOT NULL,
    creditos INT NOT NULL
);

-- 4. Crear Tabla Inscripcion 
CREATE TABLE Inscripcion (
    id_inscripcion INT AUTO_INCREMENT PRIMARY KEY,
    id_alumno INT,
    id_curso INT,
    fecha_inscripcion DATE,
    FOREIGN KEY (id_alumno) REFERENCES Alumno(id_alumno),
    FOREIGN KEY (id_curso) REFERENCES Curso(id_curso)
);

-- 5. Insertar datos de prueba 
INSERT INTO Alumno (nombre, apellido, carnet, correo, activo) VALUES 
('Christopher', 'Gonzalez', 'CG2026', 'christopher@ujmd.edu.sv', true),
('Maria', 'Lopez', 'ML2026', 'maria.lopez@mail.com', true),
('Juan', 'Perez', 'JP2026', 'juan.perez@mail.com', false);

INSERT INTO Curso (nombre, codigo, creditos) VALUES 
('Desarrollo de Software', 'DS01', 5),
('Bases de Datos', 'BD01', 4),
('Redes I', 'RD01', 3);

INSERT INTO Inscripcion (id_alumno, id_curso, fecha_inscripcion) VALUES 
(1, 1, '2026-03-06'),
(1, 2, '2026-03-06'),
(2, 2, '2026-03-06'),
(3, 1, '2026-03-06');

-- 1. Mostrar todos los alumnos activos 
SELECT * FROM Alumno WHERE activo = true;

-- 2. Mostrar los cursos con más de 3 créditos 
SELECT * FROM Curso WHERE creditos > 3;

-- 3. Mostrar los alumnos inscritos con nombre del curso (JOIN) 
SELECT A.nombre, A.apellido, C.nombre AS curso 
FROM Alumno A 
JOIN Inscripcion I ON A.id_alumno = I.id_alumno 
JOIN Curso C ON I.id_curso = C.id_curso;

-- 4. Mostrar cantidad de alumnos inscritos por curso (GROUP BY) 
SELECT C.nombre, COUNT(I.id_alumno) AS total_alumnos 
FROM Curso C 
LEFT JOIN Inscripcion I ON C.id_curso = I.id_curso 
GROUP BY C.nombre;