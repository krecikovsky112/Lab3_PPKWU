# Lab3_PPKWU


API for displaying information about a given string, such as the number of digits, the number of special characters, etc. in three formats: JSON, XML and CSV.

<h2>Syntax</h2>

<h3>CSV</h3>
<h5>Request:</h5>

localhost:8081/string_utility_controller/string/sdsdaAAa/csv

<h5>Response:</h5>

lowerCase,upperCase,whiteSpaces,numbers,specialCharacters 6, 2, 0, 0, 0

<h3>JSON</h3>
<h5>Request:</h5>

localhost:8081/string_utility_controller/string/sdsdaAAa/json

<h5>Response:</h5>

{"upperCase":"2","lowerCase":"6","whiteSpaces":"0","numbers":"0","specialCharacters":"0"}

<h3>XML</h3>
<h5>Request:</h5>

localhost:8081/string_utility_controller/string/sdsdaAAa/xml

<h5>Response:</h5>

6 2 0 0 0
