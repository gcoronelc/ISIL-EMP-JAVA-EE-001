create or replace procedure sp_list_partidas(poc_cursor out sys_refcursor) as
begin
  open poc_cursor for
    select (select descripcion from eureka.oficinas where codigo = co_ofic) as "Oficina",
           nu_part as "Partida",
           ( select descripcion from eureka.tipo_registro where codigo = co_rgst) as "Registro",
           de_dire as "Detalle"
      from eureka.partidas;
end;
/
