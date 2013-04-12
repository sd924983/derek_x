<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <link rel="stylesheet" href="../style/admin_style.css" type="text/css" />
    <script type="text/javascript" src="../Calender.js" ></script>
    <title>后台管理</title>

    <script type="text/javascript">
        function showdrop(drop) {
            var drop_div = document.getElementById(drop);
            drop_div.style.display = "inline";
        }
        function hidedrop(drop) {
            var drop_div = document.getElementById(drop);
            drop_div.style.display = "none";
        }
        
    </script>
</head>
<body>
    <form id="form1">
    <div class="header-wrap">
    <div id="header">
      <div id="logo">
        <a>后台管理系统</a>
      </div>
    <div id="top_quick_links">
   <div class="nowrap">		

			
	</div>
	</div>
	<ul id="menu">
	
	<li class="home"><a href="admin.aspx">首页</a></li>
	<li>
	    <a onMouseOver="showdrop('drop_order')" onMouseOut="hidedrop('drop_order')">用户管理</a>
	    <div onMouseOver="showdrop('drop_order')" onMouseOut="hidedrop('drop_order')" id="drop_order" class="dropdown-column">
	    <div class="col">
	    <ul>
	    <li class="view_orders">
	    <a href="admin_vieworder.aspx">
	    <span>用户CRUD操作</span>
	    <span class="hint">对于用户的增删改查</span>
	    </a></li>
	    <li class="sale_report"> 
	    <a href="admin_tj.aspx">
	    <span>用户权限变更</span>
	    <span class="hint">更改用户权限</span>
	    </a></li>
	    </ul>
	    </div>
	    </div>
	</li>
	
	    </ul>
	    </div>
	    </div>
	</li>
	</ul>
    </div>
    </div>
    <div class="mainbox-breadcrumbs"></div>
    <div id="main_column">



<div>
<div class="mainbox-title-container">
     <div class="mainbox-title">
    用户管理
    </div>
    </div>
    <div class="mainbox-body">
    <table cellpadding="0" cellspacing="0" border="0" width="1160px" class="table-fixed">
    <tbody>
    <tr>
    <td width="1160px">
      <div class="statistics-box-order">
        <div class="statistics-body-order">
        
            
            
            <div class="vieworder_row_top head">
               <div class="vieworder_box_200_40">用户系统编号</div>
		<div class="vieworder_box_200_40">用户账户名</div>

                               
            </div>
            <div class="vieworder_row_top">
              <div class="vieworder_box_200_40">

		<input type="text">
              
                 
              </div>
              <div class="vieworder_box_200_40" >
                
		<input type="text">
                
              </div>
       


              <img class="search-go" src="../images/search_go.gif" />

            </div>
            
            <div class="table_border">

            <div class="vieworder_row_top">
              <div class="vieworder_box_80_40">编号</div>
              <div class="vieworder_box_80_40">用户名</div>
              <div class="vieworder_box_80_40"><a>所属组名</a></div>
              <div class="vieworder_box_80_40"><a>真实姓名</a></div>
              <div class="vieworder_box_150_40"><a>性别</a></div>
              <div class="vieworder_box_150_40">电话</div>
              <div class="vieworder_box_150_40"><a>被访问次数</a></div>
              <div class="vieworder_box_150_40"><a>其他</a></div>

              <div class="vieworder_box_80_40"></div>
           </div>
           <s:url namespace="/user" action="manage_list" id="list"></s:url>
           <s:iterator>
	  <div class="vieworder_row item">
              <div class="vieworder_box_80_40"><a><s:property value="userID"/></a></div>
              <div class="vieworder_box_80_40"><a><s:property value="account"/></a></div>
              <div class="vieworder_box_80_40"><a><s:property value="usergroup.groupId"/></a></div>
              <div class="vieworder_box_80_40"><a><s:property value="realname"/></a></div>
              <div class="vieworder_box_150_40"><a><s:property value="gender"/></a></div>
              <div class="vieworder_box_150_40"><a><s:property value="tel"/></a></div>
              <div class="vieworder_box_150_40"><a><s:property value="visitor"/></a></div>
              <div class="vieworder_box_150_40"><s:a href="" </div>
             
              <div class="vieworder_box_80_40"></div>
		
          </div>   
	</s:iterator value="#request.searchList">
       




            </div>
            

            
        </div>
      </div>
    </td>
    </tr>
    </tbody>
    </table>
    </div>
</div>



        </div>
    </form>
</body>
</html>
