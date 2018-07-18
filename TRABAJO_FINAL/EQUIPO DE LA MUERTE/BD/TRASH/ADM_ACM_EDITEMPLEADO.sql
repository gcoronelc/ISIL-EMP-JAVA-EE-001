create or replace procedure ADM_ACM_EDITEMPLEADO
(P_CO_EMPL EMPLEADO.CO_EMPL%TYPE,
 P_CO_AREA EMPLEADO.CO_AREA%TYPE
 )
as
  v_msg varchar2(1000);
begin
  -- Actualiza EMPLEADO
  UPDATE EMPLEADO
  SET CO_AREA = P_CO_AREA ,-- CO_CARGO='04'
  FEC_MOD = SYSDATE
  WHERE CO_EMPL = P_CO_EMPL ;
  
   -- Confirmar la Tx
  commit;
exception
  when others then
    v_msg := sqlerrm; -- capturar mensaje de error
    rollback; -- cancelar transacción
    raise_application_error(-20001,v_msg);
end;
/
