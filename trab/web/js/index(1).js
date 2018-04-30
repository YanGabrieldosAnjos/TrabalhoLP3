var idaEvolta = true;
var cidade1 = "cidade1";
var cidade2 = "cidade2";
var data1 = "data1";
var data2 = "data2";

function mudaHidden(id, acao) {
	document.getElementById(id).hidden = acao;
	idaEvolta = !acao;
}

function verificarConsulta(idOrigem, idDestino, idDataIda, idDataVolta) {
	if(idaEvolta){
		if    (document.getElementById(idOrigem).value != ""
			&& document.getElementById(idDestino).value != ""
			&& document.getElementById(idDataIda).value != ""
			&& document.getElementById(idDataVolta).value != "" )
		{
			window.location = 'lista voos.html';
		}
		else{
			alert("Existem campos não preencidos! Por favor verifiqueos dados da consulta.");
		}
	}
	else{
		if    (document.getElementById(idOrigem).value != ""
			&& document.getElementById(idDestino).value != ""
			&& document.getElementById(idDataIda).value != "")
		{
			window.location = 'lista voos.html';
		}
		else{
			alert("Existem campos não preencidos! Por favor verifiqueos dados da consulta.");
		}
	}
}

function verificarCheckin(idReserva){
	if(Math.random() >= 0.5){
		alert("Checking invalido! Verifique o numero de check-in em sua passagem.");
	}
	else{
		alert("Checking realizado com sucesso! Tenha uma boa viagem.");
	}
}

function validarCartao(idCartao, idSenha){
	if 	(document.getElementById(idCartao).value != ""
	  && document.getElementById(idSenha).value != ""){
		if(Math.random() >= 0.5){
			alert("Dados incorretos!");
		}
		else{
			alert("Pagamento realizado com sucesso!");
			window.location = 'index.html';
		}
	}
	else{
		alert("Existem campos não preencidos! Por favor verifiqueos dados da consulta.");
	}
}

function preencheLabel(idLabel, varName) {
	document.getElementById(idLabel).innerHTML = eval(varName);
}