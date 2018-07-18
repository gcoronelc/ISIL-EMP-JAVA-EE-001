create or replace procedure sp_list_registros(poc_cursor out sys_refcursor) as
begin
  open poc_cursor for
    select (select descripcion from eureka.oficinas where codigo = co_ofic) as "Oficina",
           (select descripcion
              from eureka.tipo_registro
             where codigo = co_rgst) as "Registro",
           nu_part as "Partida",
           (select descripcion from eureka.tipo_docu where codigo = ti_docu_prop ) as "Tipo Doc. Propietario",
           nu_docu_prop as "Numero Doc. Propietario",
           (select nombres || ' ' || ap_paterno || ' ' || ap_materno
              from eureka.propietarios
             where ti_docu = ti_docu_prop
               and nu_docu = nu_docu_prop) as "Propietario",
           in_estd as "Situacion"
      from eureka.registros;
end;
/
