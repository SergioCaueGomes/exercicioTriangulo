<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Qual o tipo de Triângulo?</title>
<!--Bootstrap  -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- CSS -->
<style>
/* FONTE */
@import
	url('https://fonts.googleapis.com/css2? family= Roboto:wght@100 & display=swap')
	;

header, body, html {
	margin: 0px;
	padding: 0px; ]
	font-family: "Roboto";
	background-color: black;
}

h2 {
	text-align: center;	
}

#triangulo {
	margin-top: 50px;
	width: 400px;
	height: 280px;
	background-color: #768591;
	margin-left: 200px;
	align-itens: center;
	justify-content: center;
	color: white;
	border: 1px solid #EEEC00;
}

.formulario{
	align-itens: center;
	justify-content: center;
	text-align: center;
}

input{
background-color:#DEA800;
border: none;

}

button{
background-color:#AAB0B5;
border: 1px solid green;
color:green;
width: 70px;
height: 25px;
border-radius:3px;
font-weight: 700;
}
</style>
</head>

<body>
	<header>


		<div class="cantainer" id="triangulo">
			<h2>Qual o tipo de Triângulo?</h2>

			<form class="formulario">
				<div class="mb-4">
					<label for="exampleInputValor1" class="form-label">Digite
						Valor 1: </label> <br>
					<input name="val1" type="number" class="form-control" id="exampleInputValor1"
						aria-describedby="Valor1">
				</div>
				<br>
				<div class="mb-4">
					<label for="exampleInputValor2" class="form-label">Digite
						Valor 2: </label> <br>
					<input name="val2" type="number" class="form-control"
						id="exampleInputPassword1">
				</div>
				<br>
				<div class="mb-4">
					<label for="exampleInputValor3" class="form-label">Digite
						Valor 3: </label> <br>
					<input name="val3" type="number" class="form-control"
						id="exampleInputPassword1">
				</div>
				<br>
				<button type="reset">Limpar</button>
				<button type="submit">Somar</button>
			</form>
		</div>
	</header>

</body>
</html>