<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
    <h2>User Registration Form</h2>
    <form action="regform" method="post">
    
        <label for="name">  Name:  </label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="email">   Email:    </label>
        <input type="email" id="email" name="email" required><br><br>
        
        <label for="password">   Password:   </label>
        <input type="password" id="password" name="password" required><br><br>
        
        <label for="gender">  Gender:  </label>
        <input type="radio" id="genderMale" name="gender" value="male"><br><br>
        <label for="genderMale">  Male  </label>
        
        <input type="radio" id="genderFemale" name="gender" value="female">
        <label for="genderFemale">  Female  </label><br>
        
        <label for="city">  City:  </label>
        <select id="city" name="city">
            <option value=" disabled selected">Select City</option>
            <option value="Pune">  Pune  </option>
            <option value="Mumbai">  Mumbai  </option>
            <option value="Nashik">  Nashik  </option>
            <option value="Hyderabad">  Hyderabad  </option>
            <option value="Bangalore">  Bangalore  </option>
        </select><br><br>
        
        <input type="submit" value="Register">
    </form>
</body>
</html>
