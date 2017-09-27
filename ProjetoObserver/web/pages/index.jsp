<%-- 
    Document   : index
    Created on : 26/09/2017, 23:37:29
    Author     : luidgisarto
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
              crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <div class="row form-group">
                <div class="jumbotron">
                    <h1 class="display-3">Demonstração do Padrão Observer</h1>
                    <p class="lead">Simples demonstração do padrão observer</p>
                </div>
            </div>
            <div class="row form-group">
                <h2>Lista de Clientes</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Número</th>
                            <th>Nome</th>
                            <th>E-mail</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${clientes}" var="cliente">
                        <tr>
                            <td>${cliente.getCodigo()}</td>
                            <td>${cliente.getNome()}</td>
                            <td>${cliente.getEmail()}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="row form-group">
                <h2>Lista de Produtos</h2>
                <table class="table">
                    <thead>
                    <th>Número</th>
                    <th>Descrição</th>
                    <th>Quantidade</th>
                    </thead>
                    <tbody>
                    <c:forEach items="${produtos}" var="produto">
                        <tr>
                            <td>${produto.getCodigo()}</td>
                            <td>${produto.getDescricao()}</td>
                            <td>${produto.getQuantidade()}</td>
                        </tr>
                    </c:foreach>
                    </tbody>
                </table>
            </div>
            <div class="row form-group">
                <div class="row form-group col-md-12">
                    <h2>Produtos Interessados</h2>
                </div>
                <div class="col-md-3">
                    <label class="control-label">Cliente</label>
                    <select class="form-control">
                        <option value="0">Selecione</option>
                    </select>
                </div>
                <div class="col-md-3">
                    <label class="control-label">Produto</label>
                    <select class="form-control"> 
                        <option value="0">Selecione</option>
                    </select>
                </div>
                <div class="col-md-1">
                    <label class="control-label">Quantidade</label>
                    <input type="text" maxlength="3" class="form-control">
                </div>
                <div class="col-md-3">
                    <button type="button" style="margin-top:32px" class="btn btn-success">Notificar</button>
                </div>
            </div>
        </div>

    </div>

    <div class="row form-group">

    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
crossorigin="anonymous"></script>


</body>

</html>