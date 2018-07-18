-- =============================================
-- CREACI�N DE ESQUEMA
-- =============================================

DECLARE
	N INT;
	COMMAND VARCHAR2(200);
BEGIN
	COMMAND := 'DROP USER ORLCDBA01 CASCADE';
	SELECT COUNT(*) INTO N
	FROM DBA_USERS
	WHERE USERNAME = 'ORLCDBA01';
	IF ( N = 1 ) THEN
		EXECUTE IMMEDIATE COMMAND;
	END IF;
END;
/


CREATE USER ORLCDBA01 IDENTIFIED BY ORLCDBA01;

GRANT CONNECT, RESOURCE TO ORLCDBA01;

ALTER USER ORLCDBA01
QUOTA UNLIMITED ON USERS;

GRANT CREATE VIEW TO ORLCDBA01;


-- =============================================
-- CONECTARSE A LA APLICACI�N
-- =============================================

--CONNECT ORLCDBA01@xe/ORLCDBA01
--CONNECT ORLCDBA01@desa/ORLCDBA01
CONNECT ORLCDBA01/ORLCDBA01

----TABLAS  
DROP TABLE PERSONA;
DROP TABLE EMPLEADO;
DROP TABLE EST_EMPLEADO;
DROP TABLE CARGO_DET;
DROP TABLE CARGO;
DROP TABLE AREA;

 create table AREA(
  CO_AREA CHAR(2),--PK
  DESC_AREA VARCHAR2(50) NOT NULL,
  DESC_CORT VARCHAR2(20) NOT NULL,
  EST_REGI CHAR(1) DEFAULT 'A'
 );
 create table CARGO(
  CO_CARGO CHAR(2),--PK
  DESC_CARGO VARCHAR2(100) not null,
  EST_REGI CHAR(1) DEFAULT 'A' not null
 );
   create table CARGO_DET(
  CO_CARGO CHAR(2),--PK-FK
  DET_CARGO VARCHAR2(10) not null
 );

  create table EST_EMPLEADO(
  EST_EMPL CHAR(1),--PK
  ESTADO VARCHAR2(15) not null
 );
 
 create table EMPLEADO(
  CO_EMPL CHAR(6),--PK 
  CO_AREA CHAR(2) not null,--FK
  USU_SIST VARCHAR2(15) not null,
  CO_CARGO CHAR(2) not null,--FK
  EST_EMPL CHAR(1) not null ,--FK 
  CLAVE VARCHAR2(15) not null,
  APE_PAT VARCHAR2(30) not null,
  APE_MAT VARCHAR2(30) not null,
  NOMBRE VARCHAR2(30) not null,
  CO_EMPL_REG CHAR(6),
  CO_EMPL_MOD VARCHAR2(6),
  FEC_REG DATE,
  FEC_MOD DATE
 );
 create table PERSONA(
  CO_EMPL CHAR(6),--PK --FK
  APE_PAT VARCHAR2(30) not null,
  APE_MAT VARCHAR2(30) not null,
  NOMBRE VARCHAR2(30) not null,
  DNI CHAR(8) not null,
  DIRECC VARCHAR2(50) not null,
  TELF VARCHAR2(7),
  CEL VARCHAR2(9),
  EMAIL VARCHAR2(30),
  CO_EMPL_REG CHAR(6),
  CO_EMPL_MOD VARCHAR2(6),
  FEC_REG DATE,
  FEC_MOD DATE
 );


---------------- LLAVES ----------------
ALTER TABLE AREA ADD CONSTRAINT PK_AREA PRIMARY KEY (CO_AREA);
ALTER TABLE CARGO ADD CONSTRAINT CARGO_PK_CO_CARGO PRIMARY KEY (CO_CARGO);
ALTER TABLE CARGO_DET ADD CONSTRAINT PK_CARGO_DET PRIMARY KEY (CO_CARGO);
ALTER TABLE CARGO_DET ADD CONSTRAINT FK_CARGO_DET_CO_CARGO
FOREIGN KEY (CO_CARGO) REFERENCES CARGO(CO_CARGO);
ALTER TABLE EST_EMPLEADO ADD CONSTRAINT EST_EMPLEADO_PK_EST_EMPL PRIMARY KEY (EST_EMPL);
/**/
ALTER TABLE EMPLEADO ADD CONSTRAINT EMPLEADO_PK_CO_EMPL PRIMARY KEY (CO_EMPL);
--ALTER TABLE EMPLEADO ADD CONSTRAINT EMPLEADO_UNIQ_USU_SIST UNIQUE (USU_SIST);
ALTER TABLE EMPLEADO ADD CONSTRAINT FK_EMPLEADO_CO_AREA
FOREIGN KEY (CO_AREA) REFERENCES AREA(CO_AREA);
ALTER TABLE EMPLEADO ADD CONSTRAINT FK_EMPLEADO_CO_CARGO 
FOREIGN KEY (CO_CARGO) REFERENCES CARGO(CO_CARGO);
ALTER TABLE EMPLEADO ADD CONSTRAINT FK_EMPLEADO_EST_EMPL 
FOREIGN KEY (EST_EMPL) REFERENCES EST_EMPLEADO(EST_EMPL);
ALTER TABLE PERSONA ADD CONSTRAINT PERSONA_PK_CO_EMPL PRIMARY KEY (CO_EMPL);
ALTER TABLE PERSONA ADD CONSTRAINT FK_PERSONA_CO_EMPL
FOREIGN KEY (CO_EMPL) REFERENCES EMPLEADO(CO_EMPL);
---
