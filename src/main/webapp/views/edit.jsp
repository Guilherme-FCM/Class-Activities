<%@page import="Model.Activity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Activity activity = (Activity) request.getAttribute("activity"); %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h3>Adicionar Atividade</h3>
            <form action="/edit" method="POST"> 
                <input type="hidden" value="<%=activity.getId()%>" name="id">
                <div class="form-row mb-2">
                    <div class="col">
                        <label for="title">Título</label>
                        <input type="text" class="form-control" id="title" name="title" value="<%=activity.getTitle()%>" required>
                    </div>
                    <div class="col">
                        <label for="subject">Disciplina</label>
                        <input type="text" class="form-control" id="subject" name="subject" value="<%=activity.getSubject()%>" required>
                    </div>
                </div>
                <div class="form-row mb-2">
                    <div class="col">
                        <label for="teacher">Professor</label>
                        <input type="text" class="form-control" id="teacher" name="teacher" value="<%=activity.getTeacher()%>" required>
                    </div>
                    <div class="col">
                        <label for="deadline">Prazo de Entrega</label>
                        <input type="date" class="form-control" id="deadline" name="deadline" value="<%=activity.getDeadline()%>" required>
                    </div>
                </div>
                <label for="description">Descrição da Atividade</label>
                <textarea class="form-control mb-4" id="description" name="description" required rows="3"><%=activity.getDescription()%></textarea>
                <input type="submit" class="form-control btn btn-primary" value="Editar">
            </form>
        </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
