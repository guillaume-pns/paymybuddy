<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <html lang="en">

    <head>

      <title>log in</title>
      <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
      <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet"
        crossorigin="anonymous">
           <!-- Bootstrap core CSS -->
                <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="index.css" rel="stylesheet">
    </head>

    <body class="text-center" cz-shortcut-listen="true">
      <div class="container">

        <form class="form-signin" method="post" action="test" name = "f">

                  <h4 class="logo">Pay My Budy</h4>
                  </br>
                  <h2 class="form-connection-heading">Please enter an email addresse</h2>
                  </br>
                  <p>
                    <label for="email" class="sr-only">Email</label>
                    <input type="email" id="email" name="email" class="form-control" placeholder="Email"
                      required=""/>

                  </p>
                 <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
                  </br>
                </form>
      </div>
    </body>

    </html>