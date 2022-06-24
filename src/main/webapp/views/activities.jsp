<%@ page import="java.net.URL" %>
<%@ page import="java.net.HttpURLConnection" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="Model.Activity" %>
<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    ArrayList<Activity> activities = (ArrayList) request.getAttribute("activities");
%>  
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Atividades</title>
</head>
<body>
    <div class="container">
        <h1 class="d-inline">Todas as Atividades</h1>
        <a class="btn btn-success float-right mt-2" href="/insert">Adicionar</a>
        <table class="table table-hover text-center">
            <thead class="thead-light">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Título</th>
                    <th scope="col">Disciplina</th>
                    <th scope="col">Prazo de entrega</th>
                    <th scope="col">Ações</th>
                </tr>
            </thead>
            <tbody>
                <% for (Activity activity : activities){ %>        
                    <tr>
                        <th scope="row"><%= activity.getId() %></th>
                        <td><%= activity.getTitle()%></td>
                        <td><%= activity.getSubject()%></td>
                        <td><%= activity.getDeadline()%></td>
                        <td>
                            <a href="/edit?id=<%=activity.getId()%>" class="btn btn-outline-primary"><i class="fa-solid fa-pen-to-square"></i></a>
                            <a href="/delete?id=<%=activity.getId()%>" class="btn btn-outline-danger"><i class="fa-solid fa-trash"></i></a>
                        </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/80c6d7a49f.js" crossorigin="anonymous"></script>
</body>
</html>