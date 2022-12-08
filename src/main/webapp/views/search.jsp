<%--
  Created by IntelliJ IDEA.
  User: phamthanh
  Date: 08/12/2022
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/DictionaryController/result" method="post">
    <input type="text" name="valueInput" placeholder="enter your word...">
    <input type="submit">
</form>
<p>Result: ${result} </p>
</body>
</html>
