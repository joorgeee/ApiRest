

CREATE DATABASE usuarios;

CREATE TABLE IF NOT EXISTS 'usuarios'.'user' (
  'iduser' INT(11) NOT NULL AUTO_INCREMENT,
  'usuario' VARCHAR(45) NOT NULL,
  'clave' VARCHAR(500) NOT NULL,
  'nombre' VARCHAR(200) NOT NULL,
  PRIMARY KEY ('iduser'))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1


INSERT INTO USER (iduser, usuario, clave, nombre)VALUES 
('1', 'juan28', '1234', 'Juan')

INSERT INTO USER (iduser, usuario, clave, nombre)VALUES 
('2', 'Mathq', '5678', 'Marta')