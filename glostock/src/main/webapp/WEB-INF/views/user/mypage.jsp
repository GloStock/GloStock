<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%@ include file="../include/header.jsp" %>

<div class="main-wrapper">
        <div class="app">
            <!--HEADER-->
            <header class="header">
                <div class="header-block header-block-search">
                    12:12:12
                </div>
                <div class="header-block header-block-nav">
                    <ul class="nav-profile">
                        <li class="profile dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button">
                                <span class="name">
                                    Здравствуйте, Ирина
                                </span>
                            </a>
                            <div class="dropdown-menu profile-dropdown-menu">
                                <a class="dropdown-item" href="#"> <i class="fa fa-gear icon"></i>Сделать запись</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#"><i class="fa fa-power-off icon"></i>Выйти</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </header>
            <!--HEADER-->
            <!--SIDEBAR-->
            <aside class="sidebar">
                <div class="sidebar-container">
                    <div class="sidebar-header">
                        <div class="brand">
                            <div class="logo">
                                <span class="l l1"></span>
                                <span class="l l2"></span>
                                <span class="l l3"></span>
                                <span class="l l4"></span>
                                <span class="l l5"></span>
                            </div>
                            Бухгалтерия
                        </div>
                    </div>
                    <nav class="menu">
                        <ul class="nav metismenu">
                            <li class="active">
                                <a href="#"> <i class="fa fa-building-o"></i> Счет </a>
                            </li>
                            <li>
                                <a href="#"> <i class="fa fa-flash"></i> История </a>
                            </li>
                            <li>
                                <a href="#"> <i class="fa fa-archive"></i> Планирование </a>
                            </li>
                            <li>
                                <a href="#"> <i class="fa fa-plus-square"></i> Запись </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </aside>
            <!--SIDEBAR-->
            <!--CONTENT-->
            <article class="content dashboard-page">
                <div class="title-block">
                    <h3 class="title pull-left">
                        글로스탁 <span class="sparkline bar"></span>
                    </h3>
                </div>
                <section class="section">
                    <div class="row">
                        <div class="col col-xs-12 col-sm-12 col-md-6 col-xl-6 history-col">
                            <div class="card">
                                <div class="card-block">
                                    <div class="title-block" style="border-bottom: 1px solid green">
                                        <h4 class="title">Загальні відомості</h4>
                                    </div>
                                    <p>
                                        <span style="font-weight:600;">Ім'я: </span>Піддубняк Андрій
                                    </p>
                                    <p>
                                        <span style="font-weight:600;">Логін:  </span>apoddubnjak4@gmail.com
                                    </p>
                                    <p>
                                        <span style="font-weight:600;">Пароль: </span>password
                                    </p>
                                    <p>
                                        <span style="font-weight:600;">Посада: </span>посада
                                    </p>

                                </div>
                            </div>
                        </div>
                        <div class="col col-xs-12 col-sm-12 col-md-6 col-xl-6 history-col">
                            <div class="card">
                                <div class="card-block">
                                    <div class="title-block" style="border-bottom: 1px solid green">
                                        <h4 class="title">Редагувати дані</h4>
                                    </div>
                                    <p>
                                        <span style="font-weight:600;margin-right:35px;">Ім'я: </span>
                                        <input type="text" value="Піддубняк Андрій">
                                    </p>
                                    <p>
                                        <span style="font-weight:600;margin-right:22px;">Логін:  </span>
                                        <input type="text" value="apoddubnjak4@gmail.com">
                                    </p>
                                    <p>
                                        <span style="font-weight:600;margin-right:5px;">Пароль: </span>
                                        <input type="text" value="password">
                                    </p>
                                    <p>
                                        <span style="font-weight:600;margin-right:7px;">Посада: </span>
                                        <input type="text" value="посада">
                                    </p>
                                    <a href="#" class="btn btn-primary-outline">Редагувати</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </article>
            <!--CONTENT-->
        </div>
    </div>




 <%@ include file="../include/footer.jsp" %>
</body>
</html>