<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div align="center">
       <h1>Employee Registration </h1>
       <hr>
       <form action="registered" method="post">
          
         Name: <input type=text name=name><br><br>
         Date of Birth <input type=Date name=dob><br><br>

         Gender : <div>
            <input type=radio name=gender value="m" id=male>Male
            <input type=radio name=gender value="f" id=female>Female
            <input type=radio name=gender value="o" id=other>Other</div>
            <br><br>
         Address :<input type=text name=address><br><br>

         city: <input type=text name=city><br><br>

         state: <input type=text name=state><br><br>


         Username : <input  type=text name=username><br><br>

         Password : <input type=password name=password><br><br>


         <input type=submit value=Submit>
         <input type=reset value=Reset>
       
       </form>
   
   
   </div>
    

</body>
</html>