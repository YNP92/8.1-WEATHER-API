<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> <%@ page language="java"
contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Display API resutls</title>
    <link
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="stylesheet.css" />
  </head>
  <body>
    <h1>
      <span> &#x26C5;</span>Forecast for
      ${forecast.weatherLocation.cityState}<span> &#x26C5;</span>
    </h1>
    <h2 class="credit">
      <a ref href="${forecast.credit}">Credit</a><br />
      Last Updated: ${forecast.currentObservation.date}
    </h2>

    <div>
      Current Temp: ${forecast.currentObservation.temp} <span>&#8457;</span>
    </div>
    <div>
      Current Weather: ${forecast.currentObservation.weatherDescription}
    </div>
    <div>Current Wind Speed: ${forecast.currentObservation.winds} MPH</div>

    <table>
      <thead>
        <tr>
          <c:forEach var="days" items="${forecast.weatherTime.startPeriodName}">
            <th>${days}</th> </c:forEach
          ><br/>
        </tr>
      </thead>
      <tbody>
        <tr>
          <c:forEach var="days" items="${forecast.weatherTime.tempLabel}">
            <td>${days}</td>
          </c:forEach><br/>
        </tr>
        <tr>
          <c:forEach var="days" items="${forecast.weatherData.temperature}">
            <td>${days}</td> </c:forEach><br/>
        </tr>
        <tr>
          <c:forEach var="days" items="${forecast.weatherData.iconLink}">
            <td><img src= ${days} alt="Muster Been and Error"></td></c:forEach><br/>
        </tr>
        <tr>
          <c:forEach var="days" items="${forecast.weatherData.weatherLongDescrip}">
            <td>${days}</td></c:forEach><br/>
        </tr>
      </tbody>
    </table>

    <!-- <h2 class="subcat">Specialty Pizza</h2>
    <ul class="specialtypizza">
      <li>
        <a href="/specialtypizza?type=Meat Lover's&price=12.99" class="button"
          >Meat Lovers Pizza</a
        >
      </li>
      <li>
        <a href="/specialtypizza?type=Veggie Lover's&price=13.99" class="button"
          >Veggie Lovers Pizza</a
        >
      </li>
      <li>
        <a href="/specialtypizza?type=Blanco Pizza&price=14.99" class="button"
          >Blanco Pizza</a
        >
      </li>
    </ul>
    <h2 class="subcat">
      Custom Pizza
      <a href="/pizzabuilderform" class="button">Build my Pizza </a>
    </h2>
    <h2 class="subcat">
      Leave a Review
      <a href="/reviewform" class="button">We appreciate the Review</a>
    </h2> -->
  </body>
</html>
