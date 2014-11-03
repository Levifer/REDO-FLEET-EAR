<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
    <div class="col-md-12"><h2>LOGIN TO ORDER!</h2></div>
</div>
<div class="row">
    <h2>Some day, you can log in here to order your car.</h2>
</div>
<c:if test="${loggedIn.equals('no')}">
    <div class="row">
        <div class="alert alert-danger"><spring:message code="error.onLogin"/></div>
    </div>
</c:if>
<div class="row">
    <form role="form">
        <div class="form-group">
            <label for="email">Title</label>
            <input class="form-control" type="email" path="email"
                        id="email" name="email"/>
        </div>
        <div class="form-group">
            <label for="password">ISBN</label>
            <input class="form-control" type="password" path="password" id="password"
                        name="password"/>
        </div>
        <div class="form-group">
            <input type="submit" value="Back" name="_eventId_back"
                   class="btn btn-danger"/>
            <input type="submit" value="Login!" name="_eventId_login"
                   class="btn btn-primary"/>
        </div>
    </form>
</div>
