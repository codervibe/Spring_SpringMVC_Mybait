<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by Administrator on 2020/7/18  0018by IntelliJ IDEA.
  User: Administrator Date: 2020/7/18  0018 Time: 10:09
  DateTime:2020/07/18 10:09
  Description:
  Others:
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>This is Success.jsp</h2>

<%--${list}--%>
<c:forEach items="${list}" var="user">
    ${user.username}
    ${user.password}
</c:forEach>
</body>
</html>
