/* TABLES PROYECTOS & CLIENTES */
CREATE TABLE IF NOT EXISTS generation_enterprise_db.proyectos (
  idproyecto INT NOT NULL AUTO_INCREMENT,
  proyecto VARCHAR(45) NULL,
  fechafin VARCHAR(45) NULL,
  resumen VARCHAR(200) NULL,
  descripcion VARCHAR(1024) NULL,
  imagen VARCHAR(128) NULL,
  empresa INT NULL,
  PRIMARY KEY (idproyecto)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS generation_enterprise_db.clientes (
  idcliente INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  descripcion VARCHAR(255) NULL,
  logo VARCHAR(128) NULL,
  PRIMARY KEY (idcliente)
) ENGINE = InnoDB;

ALTER TABLE
  generation_enterprise_db.proyectos
ADD
  CONSTRAINT fk_clientes FOREIGN KEY (empresa) REFERENCES generation_enterprise_db.clientes (idcliente) ON DELETE RESTRICT ON UPDATE CASCADE;

/* TABLES EQUIPO & CARGOS */
CREATE TABLE IF NOT EXISTS generation_enterprise_db.equipo (
  idpersona INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  apellidos VARCHAR(45) NULL,
  resumen VARCHAR(512) NULL,
  foto VARCHAR(128) NULL,
  cargo INT NULL,
  PRIMARY KEY (idpersona)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS generation_enterprise_db.cargos (
  idcargo INT NOT NULL AUTO_INCREMENT,
  cargo VARCHAR(100) NULL,
  PRIMARY KEY (idcargo)
) ENGINE = InnoDB;

ALTER TABLE
  generation_enterprise_db.equipo
ADD
  CONSTRAINT fk_cargos FOREIGN KEY (cargo) REFERENCES generation_enterprise_db.cargos (idcargo) ON DELETE RESTRICT ON UPDATE CASCADE;

/* TABLE MENSAJES */
CREATE TABLE generation_enterprise_db.mensajes (
  idmensaje INT NOT NULL AUTO_INCREMENT,
  remitente VARCHAR(100) NOT NULL,
  fecha TIMESTAMP NOT NULL,
  `subject` VARCHAR(100) NOT NULL,
  mensaje VARCHAR(512) NOT NULL,
  respuesta VARCHAR(512) NOT NULL,
  PRIMARY KEY (idmensaje)
) ENGINE = InnoDB;