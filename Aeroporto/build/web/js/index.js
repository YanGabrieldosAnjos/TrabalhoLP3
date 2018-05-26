var idaEvolta = true;
var cidade1 = "cidade1";
var cidade2 = "cidade2";
var data1 = "data1";
var data2 = "data2";
var log=false;
var usuario= new Array("yan","luis","lucas","ana");
var pwd= new Array(1,2,3,4);
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
function validar(){
    var  idpassagem=problema.idpassagem.value;
    var  data=problema.dtreclamacao.value;
    var reclamacao=document.getElementById("comment").value;
    
    if(idpassagem==""){
        alert("preencha o id de sua passagem");
    }
    if(data==""){
        alert("preencha a data de sua reclamação");
    }   
    if(reclamacao==""){
        alert("preencha a reclamação");
    }
}

function preenche(){//VAI RECEBER COMO ENTRADA UMA TABELA DO JAVA
    var table = document.getElementById("myTable");
    
    var row = table.insertRow();
   
    var idpassagem = row.insertCell(0);
    var dtreclamacao = row.insertCell(1);

    var situacao=row.insertCell(2);
    //APENAS PARA ILUSTRAR COMO FICARÁ A TABELA
    
    idpassagem.innerHTML=prompt("qual o idpassagem");
    dtreclamacao.innerHTML=prompt("qual a data?");//JA VAI BUSCAR O CAMPO FORMATADO DO SERVIDOR
    situacao.innerHTML=prompt("qual a situação?");
}
//RECEBE UMA QUERY DO BANCO DE DADOS COM O VALOR DA PASSAGEM E PASSA PARA O IMPUT
function exibirDados(){
    var valor=250.0;
    var idvalido= new Array('1','2','3','4','5');
    var idpego=document.getElementById('idp').value;//EXECUTA A QUERY
    if(idvalido.includes(idpego)){
        document.getElementById('val').value = valor;
        document.getElementById('ext').value = (valor*0.9);
    }else{
        alert("id invalido");
    }    
}
function cancelar(){
    //envia o valor extornado pro servidor, e lá e feito o resto da operação
}
function login(){
	var usuario= new Array("yan","luis","lucas","ana");
	var pwd= new Array(1,2,3,4);
	if(usuario.includes(document.getElementById('inputEmail').value)){
		if(pwd.includes(document.getElementById('inputPassword').vaule)){
			log=true;
			alert("logado com sucesso!");
		}
	}

}

function validateLog(){
	if(log==false){
		window.location.replace("login.html");
	}
}