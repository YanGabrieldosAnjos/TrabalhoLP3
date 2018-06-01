<html lang="en">
<%@page import="Negocio.Reclamacao" %>
<%@page import="java.util.ArrayList" %>
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
        <h1> Consulta reclamações</h1>
      </div>
    </header>
    <div class="row justify-content-center">
        <div class="col-6 justify-content-center">
          <form name="problema" action="consulta reclamacao.jsp" method="post" >
            <div class="form-group" >
              <div class="row">
                <div class="col-sm">  
                            
                    <table class="table" id="myTable">
                        <thead>
                          <tr>
                            <th scope="col">ID passagem</th>
                            <th scope="col">Data reclamação</th>
                            <th scope="col">Situação</th>
                          </tr>
                          <%
                              Reclamacao r= new Reclamacao();
                              ArrayList<Reclamacao> recs= new ArrayList();
                              String  idP= request.getParameter("idpassagem");
                              r.setIdPassagem(idP);
                              recs=r.pesquisarTodos();
                          %>
                          <% for(int i=0;i<recs.size();i++)
                              if(recs.get(i)!=null){%>
                              <tr>
                                  <td><%= recs.get(i).getIdPassagem()%></td>
                                  <td><%= recs.get(i).getData() %></td>
                                  <td><%= recs.get(i).getReclamacao() %></td>
                              </tr>
                              <%}%>
                              
                        </thead>
                    </table>
                </div>
                
              </div> 
               <p>
                  Identificador da passagem:
                </p>
                <input type="text" class="form-control" name="idpassagem" placeholder="ID passageiros"> 
              <input  class="btn btn-outline-primary btn-lg active justify-content-center" role="button" aria-pressed="true"  type="submit" onclick="" >Pesquisar</a>
            </div> 
          </form>
        </div>
    </div>       
</div>>    