<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<div id="main">
    <div id="tray" class="topbar" style="width:auto;">
        <tiles:insertAttribute name="header" />
    </div>

    <div id="wrapper">
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
                <tiles:insertAttribute name="menu" />
            </div>
        </nav>
        <div id="page-wrapper" class="gray-bg dashoard-1">
            <tiles:insertAttribute name="body" />
            <div class="row">
                <div class="col-lg-12">
                    <div class="footer">
                        <div class="pull-right">
                            <tiles:insertAttribute name="footer" />
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>





