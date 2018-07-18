create or replace procedure sp_list_propietarios(poc_cursor out sys_refcursor) as
begin
  open poc_cursor for
    select (select descripcion from eureka.tipo_docu where codigo = ti_docu ) as "Tipo de Documento",
           upper(nu_docu) as "Nro. de Documento",
           upper(ap_paterno) as "Apellido Paterno",
           upper(ap_materno) as "Apellido Materno",
           upper(nombres) as "Nombres"
      from eureka.propietarios;

end;
/
