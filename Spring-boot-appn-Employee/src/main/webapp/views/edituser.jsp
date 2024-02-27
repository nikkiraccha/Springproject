<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<table border="1"> 
<tr> 
    <th>ID</th> 
    <th>NAME</th> 
    <th>DESIGNATIION</th> 
    <th>EMAIL</th> 
    <th>MOBILE</th> 
    <th>GENDER</th> 
    <th>CITY</th> 
    <th>STATE</th>
    <th>COUNTRY</th>
    <th>ADDRESS</th> 
</tr> 
<c:forEach var="emp" items="${emps}"> 
    <tr>   
        <td>${emp.id}</td>   
        <td>${emp.ename}</td>    
        <td>${emp.designation}</td>  
        <td>${emp.email}</td>  
        <td>${emp.mobile}</td>  
        <td>${emp.gender}</td> 
        <td>${emp.city}</td> 
        <td>${emp.state}</td> 
        <td>${emp.country}</td> 
        <td>${emp.address}</td>  
        <td> 
            <a href="/delete/${emp.id}">Delete</a> 
        </td> 
        <td> 
            <a href="/edit/${emp.id}">Edit</a> 
        </td> 
        </td>  
         </tr>   
</c:forEach> 
</table>

7

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
  <body bgcolor="pink"> 
        <h1>Edit Employee details Details Here</h1>   
       <form:form method="GET" action="/editandsave">     
        <table >     
        <tr>   
        <td></td>     
         <td><form:hidden path="id" /></td>   
         </tr>   
         <tr>     
            <td>Name :</td>     
            <td><form:input path="ename" /></td>   
           </tr>   
         <tr>     
          <td>Designation : </td>    
          <td><form:input path="designation"  /></td>   
         </tr>   
         <tr>     
          <td>Eamil :</td>     
          <td><form:input path="email" /></td>   
         </tr>  
         <tr>     
            <td>Mobile :</td>     
            <td><form:input path="mobile" /></td>   
           </tr>   
           <tr>     
            <td>Gender :</td>     
            <td><form:input path="gender" /></td>   
           </tr>   
           <tr>     
            <td>City :</td>     
            <td><form:input path="city" /></td>   
           </tr> 
           <tr>     
            <td>State :</td>     
            <td><form:input path="state" /></td>   
           </tr>  
           <tr>     
            <td>Country :</td>     
            <td><form:input path="country" /></td>   
           </tr> 
           <tr>     
            <td>Address :</td>     
            <td><form:input path="address" /></td>   
           </tr>     
         <tr>     
          <td> </td>     
          <td><input type="submit" value="EditSave" /></td>     
         </tr>     
        </table>     
       </form:form>   
       
       </body>