<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>No.Obat</th>
                <th>Nama Obat</th>
                <th>Harga</th>
                <th>Stok</th>
                <th>Tgl Kadaluarsa</th>
                <th>Kategori</th>
                <th colspan="2" >Action</th>
            </tr>
            <c:forEach var="list" items="${list}">
                <tr>
                    <td>${list.kode}</td>
                    <td>${list.nama}</td>
                    <td>${list.harga}</td>
                    <td>${list.stok}</td>
                    <td>${list.tgl}</td>
                    <td>${list.kategori}</td>
                    <c:url var="delete" value="/deleteObat.htm">
                        <c:param name="id" value="${list.kode}"/>
                    </c:url>
                    <c:url var="update" value="/updateList.htm">
                        <c:param name="kode" value="${list.kode}"/>
                    </c:url>
                    <td><a href="${delete}" title="Delete">Delete</a></td>
                    <td><a href="${update}" title="Delete">Update</a></td>
                </tr>
            </c:forEach>
        </table>
        <c:url var="add" value="addData.htm"></c:url>
        <a href="${add}" id="buttonAdd" title="Add">Add Data</a>

    </body>
</html>