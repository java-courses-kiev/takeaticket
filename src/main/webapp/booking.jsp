<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Take-a-ticket</title>
    <link rel="stylesheet" href="tak.css"/>
</head>
<body>
<header>

</header>

<div id="takOrderForm">
    <div id="takFormHeader">
        Make your order, please
    </div>
    <div id="takFormTable">
        <form id="mainForm" action="" method="post">
            <table>
                <tr>
                    <td class="fieldName">From</td>
                    <td><input type="text" name="station_from" class="textField" placeholder="Station from"/></td>
                    <td><input type="button" value="<-->" id="arrowButton" onclick=" "/></td>
                    <td class="fieldName">To</td>
                    <td><input type="text" name="station_to" class="textField" placeholder="Station to"/></td>
                </tr>
                <tr>
                    <td>Departure date:&nbsp;</td>
                    <td>
                        <input name="date_dep" value="03.19.2014" type="text"/>
                    </td>
                    <td>
                        +-
                        <select name="shiftDays">
                            <option value="1" selected="selected">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                        days
                    </td>
                </tr>
                <tr>
                    <td>Departure time from:&nbsp;</td>
                    <td><select name="time_dep">
                            <option value="00:00" selected="selected">12:00 am</option>
                            <option value="01:00">01:00am</option>
                            <option value="02:00">02:00am</option>
                            <option value="03:00">03:00am</option>
                            <option value="04:00">04:00am</option>
                            <option value="05:00">05:00am</option>
                            <option value="06:00">06:00am</option>
                            <option value="07:00">07:00am</option>
                            <option value="08:00">08:00am</option>
                            <option value="09:00">09:00am</option>
                            <option value="10:00">10:00am</option>
                            <option value="11:00">11:00am</option>
                            <option value="12:00">12:00pm</option>
                            <option value="13:00">01:00pm</option>
                            <option value="14:00">02:00pm</option>
                            <option value="15:00">03:00pm</option>
                            <option value="16:00">04:00pm</option>
                            <option value="17:00">05:00pm</option>
                            <option value="18:00">06:00pm</option>
                            <option value="19:00">07:00pm</option>
                            <option value="20:00">08:00pm</option>
                            <option value="21:00">09:00pm</option>
                            <option value="22:00">10:00pm</option>
                        <option value="23:00">11:00pm</option>
                    </select>
                    </td>
                <td>
                    <input type="checkbox" name="round_trip" value="1"/>&nbsp;Round trip
                </td>
                </tr>
                <tr>
                    <td colspan="5"><input type="submit" value="Search for trains" id="submitButton"/></td>
                </tr>
            </table>
        </form>
    </div>
</div>

</body>
</html>
