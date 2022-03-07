<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.88.1">
    <title>My Portfolio | Glo Stock</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <meta name="theme-color" content="#7952b3">


    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }

        .follow-card {
            flex-direction: row !important;
            margin-bottom: 10px;
        }

        .card-header {
            background-color: white !important;
            border-bottom: 0px !important;
            margin: auto;
        }

        .card-title {
            border: 0;
        }

        .card-footer {
            border: 0 !important;
            background-color: white !important;
        }
        
    </style>


</head>
<body>

<%@ include file="../include/header.jsp" %>
<header>
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark" aria-label="Tenth navbar example">
            <div class="container-fluid">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample08" aria-controls="navbarsExample08" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample08">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="/user/feed">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/user/feed">My Feed</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/user/follow">My Following</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/user/service">My Service</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/user/portfolio">My Portfolio</a>
                        </li>
                    </ul>
                    <a class="btn btn-sm btn-outline-secondary" href="#">My Account</a>
                </div>
            </div>
        </nav>
    </div>
</header>

<main>

    <section class="py-5 text-center container">
        <div class="row py-lg-5">
            <div class="col-lg-6 col-md-8 mx-auto">
                <h1 class="fw-light">My Portfolio</h1>
                <p class="lead text-muted"></p>             
            </div>
        </div>
    </section>
	<div class="container">
	<table class="table">
  <thead class="table-success">
    <tr>
      <th scope="col">No.</th>
      <th scope="col">Ticker</th>
      <th scope="col">Transaction</th>
      <th scope="col">Date</th>
      <th scope="col">Price</th>
      <th scope="col" style="text-align:right;">Portfolio Name</th>
      <th style="text-align:center;"><form class="d-flex">
        <input class="rounded border-0" type="search" size="15" placeholder="Search" aria-label="Search">&nbsp;&nbsp;
        <button class="btn btn-outline-success btn-sm" type="submit">Search</button>
      </form></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td><input class="rounded-3 border-1" type="text" size="10" id="ticker"></td>
      <td><select class="btn btn-outline-secondary btn-sm" aria-label="Default select example" id="transaction">
			<option selected>Buy</option>
  			<option value="1">Sell</option>
  			<option value="2">Reserve</option>
		  </select>
	  </td>
      <td><input class="rounded-3 border-1" type="text" size="15" id="date"></td>
      <td><input class="rounded-3 border-1" type="text" size="15" id="price"></td>
      <td style="text-align:center;"><input type="button" value="Get Today's Price" class="btn btn-outline-success btn-sm"></td>
      <td style="text-align:center;"><input type="button" value="Clear Row" class="btn btn-outline-danger btn-sm"></td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td><input class="rounded-3 border-1" type="text" size="10" id="ticker"></td>
      <td><select class="btn btn-outline-secondary btn-sm" aria-label="Default select example" id="transaction">
			<option selected>Buy</option>
  			<option value="1">Sell</option>
  			<option value="2">Reserve</option>
		  </select>
	  </td>
      <td><input class="rounded-3 border-1" type="text" size="15" id="date"></td>
      <td><input class="rounded-3 border-1" type="text" size="15" id="price"></td>
      <td style="text-align:center;"><input type="button" value="Get Today's Price" class="btn btn-outline-success btn-sm"></td>
      <td style="text-align:center;"><input type="button" value="Clear Row" class="btn btn-outline-danger btn-sm"></td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td><input class="rounded-3 border-1" type="text" size="10" id="ticker"></td>
      <td><select class="btn btn-outline-secondary btn-sm" aria-label="Default select example" id="transaction">
			<option selected>Buy</option>
  			<option value="1">Sell</option>
  			<option value="2">Reserve</option>
		  </select>
	  </td>
      <td><input class="rounded-3 border-1" type="text" size="15" id="date"></td>
      <td><input class="rounded-3 border-1" type="text" size="15" id="price"></td>
      <td style="text-align:center;"><input type="button" value="Get Today's Price" class="btn btn-outline-success btn-sm"></td>
      <td style="text-align:center;"><input type="button" value="Clear Row" class="btn btn-outline-danger btn-sm"></td>
    </tr>
  </tbody>
</table>
	</div>
    <section class="py-5 text-center container">
        <div class="row py-lg-5">
            <div class="col-lg-6 col-md-8 mx-auto">
                <h1 class="fw-light">Today's Price</h1>
                <p class="lead text-muted">현재가격!</p>
            </div>
        </div>
    </section>

</main>

<%@include file="../include/footer.jsp"%>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>

