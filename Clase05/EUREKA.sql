select DEC_CUENSALDO
from CUENTA
where CHR_CUENCODIGO = '00100001';

update CUENTA
set DEC_CUENSALDO = ? 
where CHR_CUENCODIGO = ?;

select * from cuenta
where CHR_CUENCODIGO = '00200001';

select * from movimiento
where CHR_CUENCODIGO = '00200001';

SELECT * FROM TIPOMOVIMIENTO;

select * from costomovimiento;




