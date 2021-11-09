package com.example.demo;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("string_utility_controller/")
public class UtilityStringController {

    private final String lowerCaseAPI = "http://localhost:8080/string_analyzer/lower_case/";
    private final String upperCaseAPI = "http://localhost:8080/string_analyzer/upper_case/";
    private final String whiteSpacesApi = "http://localhost:8080/string_analyzer/white_spaces/";
    private final String numbersAPI = "http://localhost:8080/string_analyzer/numbers/";
    private final String specialCharactersAPI = "http://localhost:8080/string_analyzer/special_characters/";

    @GetMapping("string/{text}/{format}")
    public String getStatistics(@PathVariable("format") String format,
                                @PathVariable("text") String text){

        StringBuilder stats = new StringBuilder();
        RestTemplate restTemplate = new RestTemplate();

        if(format.equals("csv")){
            return getStringCSV(text, stats, restTemplate);
        }
        else if(format.equals("json")){
            return getJsonObject(text, restTemplate);
        }
        return "Test";
    }

    private String getStringCSV(String text, StringBuilder stats, RestTemplate restTemplate) {
        stats.append("LowerCase: ");
        stats.append(restTemplate.getForObject(lowerCaseAPI+ text,String.class)).append(", ");
        stats.append("UpperCase: ");
        stats.append(restTemplate.getForObject(upperCaseAPI+ text,String.class)).append(", ");
        stats.append("White spaces: ");
        stats.append(restTemplate.getForObject(whiteSpacesApi+ text,String.class)).append(", ");
        stats.append("Numbers: ");
        stats.append(restTemplate.getForObject(numbersAPI+ text,String.class)).append(", ");
        stats.append("Special characters: ");
        stats.append(restTemplate.getForObject(specialCharactersAPI+ text,String.class));

        return String.valueOf(stats);
    }

    private String getJsonObject(String text, RestTemplate restTemplate) {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("lowerCase", restTemplate.getForObject(lowerCaseAPI + text, String.class));
        jsonObject.put("upperCase", restTemplate.getForObject(upperCaseAPI + text, String.class));
        jsonObject.put("whiteSpaces", restTemplate.getForObject(whiteSpacesApi + text, String.class));
        jsonObject.put("numbers", restTemplate.getForObject(numbersAPI + text, String.class));
        jsonObject.put("specialCharacters", restTemplate.getForObject(specialCharactersAPI + text, String.class));

        return jsonObject.toJSONString();
    }
}
