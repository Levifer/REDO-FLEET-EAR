<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.flowTitle.order"/></h2></div>
</div>
<div class="row">
    <div class="col-md-6">
        <img src="<%=request.getContextPath() %>/resources/img/logo/audi.jpg" class="img-responsive"/>
    </div>
    <div class="col-md-6">
        <h3>Congratulations on your new car!</h3>
        <p>Audi</p>
    </div>
</div>
<div class="row">
    <form:form>
        <input type="submit" value="Back to car detail" name="_eventId_back"
               class="btn btn-danger" />
        <input type="submit" value="Finish" name="_eventId_finish"
                       class="btn btn-success" />
    </form:form>
</div>