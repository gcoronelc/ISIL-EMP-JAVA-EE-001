<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="Scripts/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="Scripts/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br />
	<br />
	<br />
	<div id="m_main">

		<div id="m_body">
			<div class="container">

				<div class="col-md-3"></div>
				<div class="col-md-6">
					<div class="panel panel-default">
						<div class="panel-body">
							<div class="page-header"
								style="text-align: center; margin-top: 5px">
								<h3>CREAR EMPLEADO</h3>
							</div>
							<form action="createEmpleado" method="POST"
								class="form-horizontal">
								<input type="hidden" name="accion" value="UPD" />

								<div class="form-group form-group-sm">
									<label for="id" class="control-label col-md-4">Codigo
										de empleado</label>
									<div class="col-md-8">
										<input type="text" class="form-control" name="CO_EMPL"
											value="${EMPLEADO.CO_EMPL}" readonly="readonly" />
									</div>
								</div>

								<div class="form-group form-group-sm">
									<label for="nombres" class="control-label col-md-4">Apellido
										Paterno</label>
									<div class="col-md-8">
										<input type="text" class="form-control" name="APE_PAT"
											value="${EMPLEADO.APE_PAT}" placeholder="Apellido paterno"
											required="" maxlength="30" />
									</div>
								</div>

								<div class="form-group form-group-sm">
									<label for="celular" class="control-label col-md-4">Apellido
										Materno</label>
									<div class="col-md-8">
										<input type="text" class="form-control" name="APE_MAT"
											value="${EMPLEADO.APE_MAT}" placeholder="Apellido Materno"
											required="" maxlength="30" />
									</div>
								</div>

								<div class="form-group form-group-sm">
									<label for="correo" class="control-label col-md-4">Nombre</label>
									<div class="col-md-8">
										<input type="text" class="form-control" name="NOMBRE"
											value="${EMPLEADO.NOMBRE}" placeholder="Nombre" required=""
											maxlength="30" />
									</div>
								</div>

								<div class="form-group form-group-sm">
									<label for="area" class="control-label col-md-4">Area</label>
									<div class="col-md-8">
										<select name="CO_AREA" class="form-control">
										
											<option value="01">MESA DE PARTES</option>
											<option value="02">UNIDAD DE TECNOLOGIA</option>
											<option value="03">LOGISTICA</option>
											<option value="04">RECURSOS HUMANOS</option>
										</select>
									</div>
								</div>

								<div class="form-group form-group-sm">
									<label for="cargo" class="control-label col-md-4">Cargo</label>
									<div class="col-md-8">
										<select name="CO_CARGO" class="form-control">
											<option value="01">COORDINADOR</option>
											<option value="02">REGISTRADOR</option>
											<option value="03">ASISTENTE REGISTRAL</option>
											<option value="04">OPERADOR DE SISTEMAS</option>
										</select>
									</div>
								</div>

								<div class="form-group form-group-sm">
									<label for="estado" class="control-label col-md-4">Estado</label>
									<div class="col-md-8">
										<select name="EST_EMPL" class="form-control">
											<option value="A">ACTIVO</option>
											<option value="I">INACTIVO</option>
											<option value="X">BAJA</option>
										</select>
									</div>
								</div>

								<hr />
								<div class="form-group">
									<div class="col-md-4 col-sm-offset-2">
										<button type="submit" class="btn btn-info">Aceptar</button>
									</div>
									<div class="col-md-4 col-sm-offset-2">
										<button type="button" id="btnCancelar" class="btn btn-warning">Cancelar</button>
									</div>
								</div>
								<c:out value="${mensaje}" />

							</form>
						</div>
					</div>
				</div>
				<br />
				<%-- para mensajes  --%>
				<div>${mensaje}</div>

			</div>
		</div>
	</div>

	<script type="text/javascript" src="Scripts/js/btn.js"></script>
</body>
</html>