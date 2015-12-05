<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <s:form action="login" method="post">
        <table>
           <tr>
              <td>username:</td>
               <td> <s:textfield name="username"></s:textfield> </td>
           </tr>
           <tr>
              <td>password:</td>
               <td> <s:textfield name="password"></s:textfield> </td>
           </tr>
            <tr colspan="2">
               <s:submit></s:submit>
                 <s:reset></s:reset>
            </tr>
        </table>
    </s:form>
    <a href='<%=request.getContextPath()%>/ssh/add.action'>add user</a>
</body>
 <script type="text/javascript">
  var url="<%=request.getContextPath()%>/ssh/xhr.action";
   console.log("url="+url);
   window.onload=function(){
	   var req=new XMLHttpRequest();
	   req.onreadystatechange=function(){
		   if(req.readyState==4){
			   var text=req.responseText;
			   if(text=="" || req.status=='404'){
				   req.error();
			   }
			//   alert(req.responseText);
			 req.success(text);
		   }
	   };
	    req.error=function(){
	    	alert("error shows");
	    }
	    req.success=function(text){
	    	alert(text);
	    	var obj=eval('('+text+')');
	    	//var obj=eval(text);
	    	console.log(obj.name);
	    	
	    }
	    req.open("GET",url, true,null, null);
	    req.send(null);
   };
   
   console.log(Math.sqrt(4));
 </script>
</html>