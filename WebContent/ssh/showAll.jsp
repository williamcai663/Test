<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <center>
         <table>
            <thead>
              <tr>
                 <th>id</th>
                  <th>name</th>
                  <th>age</th>
                  <td>caozuo</td>
              </tr>              
            </thead>
            <tbody>
             <s:iterator value="#request.users" var="user">
                <tr>
                  <td><s:property value="#user.userid"></s:property></td>
                  <td><s:property value="#user.username"></s:property></td>
                  <td><s:property value="#user.age"></s:property></td>
                  <td>
                  <a href='delete.action?userid=<s:property value="#user.userid"></s:property>'>删除</a>
                  <a href='update.action?userid=<s:property value="#user.userid"></s:property>'>更新</a>
                  </td>
                </tr>
             </s:iterator>
            </tbody>
         </table>
          <a>新增</a>
  </center>
</body>
</html>