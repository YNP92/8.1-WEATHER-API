<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> <%@ page language="java"
contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Display Weather Search</title>
    <link
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="stylesheet.css" />
  </head>
  <body>
    <h1>Search Weather API</h1>
    <label for="APIform">Please enter a Lattitude and Longitude</label>
    <form class="APIform" method="post" action="/">
      <label for="latitude">Latitude</label>
      <input
        type="number"
        name="latitude"
        min="-90"
        max="90"
        step="0.0001"
        value="42.3314"
        required
      />
      <label for="longitude">Longitude</label>
      <input
        type="number"
        name="longitude"
        min="-180"
        max="180"
        step="0.0001"
        value="-83.0458"
        required
      />
      <input type="submit" value="Submit" />
    </form>
  </body>
</html>
