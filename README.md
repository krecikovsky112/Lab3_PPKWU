# Lab3_PPKWU


API for displaying information about a given string, such as the number of digits, the number of special characters, etc. in three formats: JSON, XML and CSV.

##Syntax

####CSV
Request:

localhost:8081/string_utility_controller/string/sdsdaAAa/csv

Response:

lowerCase,upperCase,whiteSpaces,numbers,specialCharacters 6, 2, 0, 0, 0

####JSON
Request:

localhost:8081/string_utility_controller/string/sdsdaAAa/json

Response:

{"upperCase":"2","lowerCase":"6","whiteSpaces":"0","numbers":"0","specialCharacters":"0"}

####XML
Request:

localhost:8081/string_utility_controller/string/sdsdaAAa/xml

Response:

6 2 0 0 0
