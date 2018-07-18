create or replace procedure ADM_EMPL_CREATE
(
 P_CO_AREA EMPLEADO.CO_AREA%TYPE,
 P_USU_SIST EMPLEADO.USU_SIST%TYPE,
 P_CO_CARGO EMPLEADO.CO_CARGO%TYPE,
 P_EST_EMPL EMPLEADO.EST_EMPL%TYPE,
 P_APE_PAT EMPLEADO.APE_PAT%TYPE,
 P_APE_MAT EMPLEADO.APE_MAT%TYPE,
 P_NOMBRE EMPLEADO.NOMBRE%TYPE 
 )
as
  v_msg varchar2(1000);
  --V_CO_EMPL EMPLEADO.CO_EMPL%TYPE;
    V_CO_EMPL varchar2(6);

  V_CLAVE EMPLEADO.CLAVE%TYPE;
  --V_APE_PAT EMPLEADO.APE_PAT%TYPE;
  --V_APE_MAT EMPLEADO.APE_MAT%TYPE;
  --V_NOMBRE EMPLEADO.NOMBRE%TYPE;
begin
  --Obtener codigo cliente
  SELECT COUNT(*) into V_CO_EMPL from EMPLEADO;-- FOR UPDATE;
    V_CO_EMPL := V_CO_EMPL + 1;
    V_CO_EMPL := LPAD(V_CO_EMPL, 6, '0');
  --Seteando clave 
    V_CLAVE :=P_USU_SIST;
    
  --V_APE_PAT := UPPER(P_APE_PAT);
  --V_APE_MAT := UPPER(P_APE_MAT);
  --V_NOMBRE := UPPER(P_NOMBRE);

  INSERT INTO EMPLEADO(
CO_EMPL  ,  
  CO_AREA  ,  
  USU_SIST  ,  
  CO_CARGO  ,  
  EST_EMPL ,    
  CLAVE  ,  
  APE_PAT  ,  
  APE_MAT  ,
  NOMBRE  ,  
  FEC_REG
 ) 
   VALUES (
   V_CO_EMPL,
  P_CO_AREA,
 P_USU_SIST,
 P_CO_CARGO,
 P_EST_EMPL,
 V_CLAVE,
 P_APE_PAT,
 P_APE_MAT,
 P_NOMBRE,
 SYSDATE
  );  
  	

   -- Confirmar la Tx
  commit;
exception
  when others then
    v_msg := sqlerrm; -- capturar mensaje de error
    rollback; -- cancelar transacción
    raise_application_error(-20001,v_msg);
end;
/

   
