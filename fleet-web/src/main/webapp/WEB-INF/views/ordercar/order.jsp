<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <div class="col-md-12"><h2><spring:message code="title.car.order"/></h2></div>
</div>
<div class="row">
 <div class="col-md-6">
        <img src="<%=request.getContextPath() %>/resources/img/logo/audi.jpg" class="img-responsive"/>
    </div>
    <div class="col-md-6">
        <h3>Congratulations on your new car!</h3>
    </div>
</div>
<div class="row">
    <form:form>
        <hr >
        <div class="col-sm-3 col-sm-offset-1">
            <p>${car.model.brand} ${car.model.name} (${car.model.type})</p>
        </div>

        <input type="button" value="Back to car detail"
               class="btn btn-danger" >
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </input>
        <input type="submit" value="Confirm" name="_e ventId_finish"
               class="btn btn-success" />
    </form:form>
</div>