<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
  <title>File Upload</title>
 </head>
 <body bgcolor="#cccccc">
  <div style="padding-top: 30px; padding-left: 30px">
   <fieldset
    style="width: 600px; border-color: #000000; padding-left: 10px">
    <legend>
     <font size="-1" color="#000000"><b>�ϴ�ͼƬ</b> </font>
    </legend>
    <div class="ErrorDiv">
       <s:fielderror/>
     <s:actionerror/>
    </div>
    <s:form action="pic!upload.action" method="post" theme="simple" enctype="multipart/form-data">
     <table border="1" width="500px">
      <tr>
       <td class="tableTDCenter">
       	 ͼƬ·����
       </td>
       <td><s:file name="file"/></td>
      </tr>
      <tr>
      	<td>ͼƬ����</td>
      	<td><input type="text" name="picname"/></td>
      </tr>
      <tr>
     
      	<td>����</td>
      	<td><s:textarea name="picdes"></s:textarea></td>
      </tr>
      <tr>
       <td class="tableTDCenter" colspan="2">
        <s:submit value="�ύ" cssClass="button"></s:submit>
       </td>
      </tr>
     </table>
    </s:form>
   </fieldset>
  </div>
 </body>
</html>
