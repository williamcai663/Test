<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <script type="text/javascript" src="../js/jquery.min.js"></script>
  <script type="text/javascript">
     $(function(){
    	 var books=["computer","biology","english"];    	 
    	/*  $.each(books,function(index,value){
    		 alert(index);
    	 });
    	
    	 $( "li" ).each(function( index ) {
       	  
        	 console.log( index + ": " + $(this).text());
        	});
    	 
    	 $("button").click(show);
         
    	    
         function show(){
        	 alert("haha");
         }
         
         $('form').submit(function() {
        	 var ta=$(this).serializeArray();
        	  console.log(ta);
        	  console.log($.param(ta));
        	  var ser=$(this).serialize();
        	  console.log(ser);
        	  return false;
        	}); */
         var param={ a: [2,3,4] };
         var results=$.param(param);
         $("#result").text(results);
         var bookstr={"book":books,"param":param};
         console.log(bookstr);
        var str=JSON.stringify(bookstr);
        console.log(str);
         //var obj = jQuery.parseJSON(str);
         /* var mybook='{"book":books}';
         var obj=$.parseJSON(mybook);
         console.log(obj); */
        // var obj = jQuery.parseJSON( '{ "name": "John" }' );
         //console.log(obj);
         
         var mystr='{"book":["computer","biology","english"],"param":{"a":[2,3,4]}}';
         console.log("mystr"+mystr);
         var tesx={json:mystr};
         console.log("tesx"+$.param(tesx));
         $.ajax({        	 
        	 url:'<%=request.getContextPath()%>'+"/ssh/test.action",
        	 data:$.param(tesx),
        	 success:function(result){
        		 alert(result);
        		 console.log(result);
        		 var obj=$.parseJSON(result);
        		 console.log(obj);
        		/* console.log(result.result);
        		 var ox=$.parseJSON(result.json);
        		 console.log(ox); 
        		 console.log(ox.book); */
        	 }
         });
     });
     
     /* $("div button").on("click",function(){
    	 alert("yes");
     }); */
    
  </script>
</head>
<body>
    <div>
      <button>click me</button>
    </div>
    <ul>
    <li>foo</li>
    <li>bar</li>
</ul>
   <form>
      name:<input name="user" /><br>
      pwd:<input name="pwd" />
       <input type="submit"/>
   </form>
   <div id="result"></div>
</body>
</html>