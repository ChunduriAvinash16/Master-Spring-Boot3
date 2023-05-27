<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

    <body>
     <div class="container">
        <p>Wlcome to Add todo page</p>
        <form:form method="post" modelAttribute="todo">
            <field-set>
                <form:label path="description">Description</form:label>
                <form:input type="text" required="required" path="description"/>
                <form:errors path="description" cssClass="text-warning"/>
            </field-set>
             <field-set>
                <form:label path="targetDate">targetDate</form:label>
                <form:input type="text" required="required" path="targetDate"/>
                <form:errors path="targetDate" cssClass="text-warning"/>
            </field-set>
            <form:input type="hidden" path="id"/>
            <form:input type="hidden" path="done"/>
            <input type="submit" class="btn btn-success"/>
        </form:form>
      </div>
      <%@ include file="common/footer.jspf" %>

 <script type="text/javascript">
            $('#targetDate').datepicker({
            	    format: 'yyyy-mm-dd'
            	});
       </script>



