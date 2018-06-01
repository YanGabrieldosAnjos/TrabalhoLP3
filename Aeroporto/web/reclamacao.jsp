<%-- 
    Document   : reclamacao
    Created on : 24/05/2018, 23:48:46
    Author     : YAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Blue Sky Airlines</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="./css/custom.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  <script type= "text/javascript" src="./js/index.js"></script>
  <script type="text/javascript">
    window.onload = function(){
    makeactive(1); 
    makeactivecontent(1);
    validateLog();  
  };
    </script>
  

</head>
<body>

<!-- Grey with black text -->

  
<div  class="container">  
    <div class="row" >   
        <div class="container-fluid" ><h1>BSA</h1></div>
    </div>  


  <nav class="navbar navbar-expand-sm bg-blue navbar-white sticky-top">
        <ul class="nav justify-content-center">
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
             Login
            </a>
            <div class="dropdown-menu">
              <a class="dropdown-item" id="log" href="login.html" >Logar</a>
              <a class="dropdown-item" id="log" href="formulario.html" >Cadastrar</a>
            </div>
          <li class="nav-item">
            <a class="nav-link" href="lista voos.html" id="navlink" >Passagens em desconto</a>
          </li>
          <li class="nav-item">
            <a class="nav-link"  href="consulta.html" id="navlink">Voos disponiveis</a>
          </li>
		  <li class="nav-item">
            <a class="nav-link"  href="check-in.html" id="navlink">Check-in</a>
          </li>
          <li class="nav-item">
            <a class="nav-link " href="reclamacao.jsp" id="navlink">Fale conosco</a>
          </li>
        </ul>
    </nav>
</div>

<div class="container justify-content-center">
  
    <header>
      <div class="row justify-content-center">
        <br>
        <br>
        <h1> Reclamações</h1>
      </div>
    </header>
    <div class="row justify-content-center">
      <div class="col-6 justify-content-center">
        <form name="problema"  action="CtrReclamacao" method="post">
          <div class="form-group" >
            <div class="row">
              <div class="col-sm">
                <p>
                  Identificador da passagem:
                </p>
                <input type="text" class="form-control" name="idpassagem" placeholder="ID passageiros">
            
                    <p>Data da reclamação:</p>
                    <div class='input-group date' id='datetimepicker1'>
                        <script type="text/javascript">
                        $(function () {
                          $('#datetimepicker1').datetimepicker();
                            showOn: "button",
                              buttonImage: "calendario.png",
                              buttonImageOnly: true,
                              showButtonPanel:true,
                              changeMonth: true,
                              changeYear: true,
                              showOtherMonths: true,
                              selectOtherMonths: true,
                              dateFormat: 'dd/mm/yy',
                              dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'],
                              dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
                              dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
                              monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
                              monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez']
                        });
                      </script>
                        <input type='date' class="form-control" name="dtreclamacao" placeholder="Data" />
                        <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                        </span>
                    </div>
                    
                            <p>Descrição do problema:</p>
                            <label for="comment"></label>
                            <textarea class="form-control" rows="10" id="comment" name="comment"></textarea>
                    </div>
                </div>

                  

                </div>
             </div> 
        </div> 
  
              
  
              <div class="w-100"></div>
            
              <div class="row justify-content-center">
                  <input  class="btn btn-outline-primary btn-lg active justify-content-center" role="button" aria-pressed="true"  type="submit" onclick="return validar()" >Enviar</a>
              </div>

          </div>
        </form>
      </div>
    </div>
  </div

</body>
</html>