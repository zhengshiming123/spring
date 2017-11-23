<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>测试MVC传参</title>
</head>
<body>

<form action="<c:url value="/user/su"></c:url> " >
	第一个参数: <input name="a" type="text" >
	第二个参数: <input name="b" type="text" >
	<td colspan="2"><input type="submit" name="提交"/></td>
</form>
  <form method="post" action="<c:url value="/user/su.html"/>">
    <table>
	    <tr>
	       <td>用户名：</td>
	       <td><input type="text" name="userName"  value="${user.userName}"/></td>
	    </tr>
	    <tr>
	     <td>密码：</td>
	       <td><input type="password" name="password" value="${user.password}"/></td>
	    </tr>
	    <tr>
	     <td>姓名：</td>
	       <td><input type="text" name="realName" value="${user.realName}"/></td>
	    </tr>
	    <tr>
	     <td>生日：</td>
	       <td><input type="text" name="realName" value="${user.birthday}"/></td>
	    </tr>
	    	    	    	    <tr>
	     <td>工资：</td>
	       <td><input type="text" name="realName" value="${user.salary}"/></td>
	    </tr>
	    <tr>
	     <td colspan="2"><input type="submit" name="提交"/></td>
	    </tr>	    
    </table>
  </form>
</body>
</html>