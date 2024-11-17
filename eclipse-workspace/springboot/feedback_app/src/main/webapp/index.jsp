<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <%@include file="links.jsp" %>
    
  </head>
  <body>
  <%@include file="header.jsp" %>
    <div style="height: 80vh" class="content_container py-4 d-flex flex-column justify-content-center align-items-center">
    	<a href="<%= request.getContextPath() %>/feedback.jsp" class="btn btn-light">Give Feedback</a>
    	
    	<a href="<%= request.getContextPath() %>/servlet1" class="btn mt-5 btn-light">Go to servlet1</a>
    	
    	<a href="<%= request.getContextPath() %>/servlet2" class="btn mt-5 btn-light">Go to servlet2</a>
    	
    	
    </div>
   <%@include file="scripts.jsp" %>
  </body>
</html>