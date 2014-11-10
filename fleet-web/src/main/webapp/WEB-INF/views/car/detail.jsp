<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div class="row">
    <div class="col-sm-12"><h2>${carModel.brand} ${carModel.name} (${carModel.year.year}")</h2></div>
</div>
<div class="row">
    <div class="col-sm-3 col-xs-6">
        <img src="<%=request.getContextPath() %>/resources/img/logo/${fn:toLowerCase(carModel.brand)}.png" class="img-responsive"/>
    </div>
    <div class="col-sm-5">

        <form:form method="POST" commandName="options" action="selectOptions">
            <table>
                <tbody>
                <tr>
                    <td>
                        <ul>
                            <form:checkboxes element="li" items="${carModel.pack.options.option}" path="items" />
                        </ul>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" value="BUY ME"></td>
                </tr>
                </tbody>
            </table>
        </form:form>

    </div>

    <div class="col-sm-3 col-sm-offset-1">
        <form:form commandName="handleFormSubmission"  modelAttribute="carModel" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="submit" value="Order now!" class="btn btn-primary"/>
        </form:form>
    </div>

</div>