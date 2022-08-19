package com.example.hello.web;


import com.example.hello.domain.TbSearch;
import com.example.hello.service.food.FoodService;
import com.example.hello.service.search.SearchService;

import com.example.hello.web.dto.FoodRequestDto;
import com.example.hello.web.dto.SearchSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SearchController {
    private final SearchService searchService;
    private final  FoodService foodService;

    @PostMapping("/api/v1/search")
    public Long save(@RequestBody SearchSaveRequestDto requestDto){
        return searchService.save(requestDto);
    }

    @PostMapping("/api/v1/news")
    public String news(@RequestBody SearchSaveRequestDto requestDto){
        return searchService.news(requestDto);
    }

    @PostMapping("/api/v1/searchlist")
    public SearchSaveRequestDto searchlist(@RequestBody SearchSaveRequestDto requestDto){
        return searchService.findAll(requestDto);
    }

    @PostMapping("/api/v1/foodtest")
    public FoodRequestDto foodtest(@RequestBody FoodRequestDto requestDto){
        return foodService.findALong(requestDto);
    }


}
