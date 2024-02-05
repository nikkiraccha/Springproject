<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1> BALANCE IS..</h1>
<table border="1">
<tr>
    <th>ACCOUNT NO</th>
    <th>NAME</th>
    <th>AMOUNT</th>
    <th>ADDRESS</th>
    <th>MOBILE</th>
    
</tr>

    <tr>  
        <td>${balance.accNo}</td>  
        <td>${balance.name}</td>   
        <td>${balance.amount}</td> 
        <td>${balance.address}</td> 
        <td>${balance.mobile}</td> 
         </tr>  

</table>