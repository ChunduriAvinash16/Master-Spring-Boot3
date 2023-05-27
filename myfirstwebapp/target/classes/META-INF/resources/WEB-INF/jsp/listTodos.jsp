<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
    <body>
     <div class="container">
       <h3> Your Todos </h3>
       <table class="table">
        <thead>
            <tr>
                <th>Description</th>
                <th>Target Date</th>
                <th> Is Done?</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
          <!--  <h4> Your Todos : ${todos} </h4> -->
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td>
                        <a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a>
                        <a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
       </table>
       <a href="add-todo" class="btn btn-primary">Add ToDo </a>
       </div>
<%@ include file="common/footer.jspf" %>
