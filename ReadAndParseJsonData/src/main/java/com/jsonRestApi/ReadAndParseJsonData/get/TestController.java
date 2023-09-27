package com.jsonRestApi.ReadAndParseJsonData.get;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @GetMapping("/")
    public List<Todos> getJson(){
        List<Todos> list =  fetchDataFromApi();
        return list;
    }

    private List<Todos> fetchDataFromApi() {
        List<Todos> todosList = new ArrayList<>();
        String jsonResponse;
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://dummyjson.com/todos");
        try {
            HttpResponse response = httpClient.execute(httpGet);
            jsonResponse = EntityUtils.toString(response.getEntity());

            //parsing json Data
            ObjectMapper objectMapper = new ObjectMapper();
            TodosWrapper todosWrapper = objectMapper.readValue(jsonResponse,TodosWrapper.class);
            todosList = todosWrapper.getTodos();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return todosList;
    }
}

