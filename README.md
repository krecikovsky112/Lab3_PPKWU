# Lab3_PPKWU


API for displaying information about a given string, such as the number of digits, the number of special characters, etc. in three formats: JSON, XML and CSV.

<h2>Syntax</h2>

<h4>CSV</h4>
Request:

localhost:8081/string_utility_controller/string/sdsdaAAa/csv

Response:

lowerCase,upperCase,whiteSpaces,numbers,specialCharacters 6, 2, 0, 0, 0

<h4>JSON</h4>
Request:

localhost:8081/string_utility_controller/string/sdsdaAAa/json

Response:

{"upperCase":"2","lowerCase":"6","whiteSpaces":"0","numbers":"0","specialCharacters":"0"}

<h4>XML</h4>
Request:

localhost:8081/string_utility_controller/string/sdsdaAAa/xml

Response:

6 2 0 0 0
