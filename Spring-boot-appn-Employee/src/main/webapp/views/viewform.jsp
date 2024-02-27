<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<table border="1"> 
<tr> 
    <th>EMPID</th> 
    <th>EMP NAME</th> 
    <th>DESIGNATION</th> 
    <th>EMAIL</th> 
    <th>MOBILE</th> 
    <th>GENDER</th> 
    <th>CITY</th> 
    <th>STATE</th> 
    <th>COUNTRY</th> 
    <th>ADDRESS</th> 
    <th>EDIT</th> 
    <th>DELETE</th> 
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
            <a href="/edit/${emp.id}">EDIT</a> 
        </td> 
        <td> 
            <a href="/delete/${emp.id}">DELETE</a> 
        </td> 
        </td>  
         </tr>   
</c:forEach> 
</table>
