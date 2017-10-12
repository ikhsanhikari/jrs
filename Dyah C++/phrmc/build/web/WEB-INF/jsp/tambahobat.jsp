<%-- 
    Document   : tambah
    Created on : Sep 5, 2017, 11:05:12 PM
    Author     : premium
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add</h1>
        <form:form action="saveObat.htm" modelAttribute="ObatDto" method="POST">
            <table>
                <tr>
                    <td>ID_Obat</td>
                    <td>:</td>
                    <td><form:input path="kode" placeholder="ID Obat"/></td>
                </tr>
                <tr>
                    <td>Nama Obat</td>
                    <td>:</td>
                    <td><form:input path="nama" placeholder="Nama Obat"/></td>
                </tr>
                <tr>
                    <td>Harga</td>
                    <td>:</td>
                    <td><form:input path="harga" placeholder="Harga"/></td>
                </tr>
                <tr>
                    <td>Stok</td>
                    <td>:</td>
                    <td><form:input path="stok" placeholder="Stok Obat"/></td>
                </tr>

                <tr>
                    <td>Tanggal Kadaluarsa</td>
                    <td>:</td>
                    <td><form:input path="tgl" placeholder="Tanggal Kadaluarsa"/></td>
                </tr>
                <tr>

                    <td>Kategori</td>
                    <td>:</td>
                    <td><form:select path="kategori">
                        <option value="kapsul">Kapsul</option>
                        <option value="sirup">Sirup</option>
                        <option value="pil">Pil</option>
                </form:select></td>
        </tr>
    </table>
    <input type="submit" value="Save" />    
</form:form>
<a href="index.htm" title="Kembali">Kembali</a>
</body>
</html>
