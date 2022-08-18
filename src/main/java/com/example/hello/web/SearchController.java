package com.example.hello.web;


import com.example.hello.search.SearchService;

import com.example.hello.web.dto.SearchSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SearchController {
    private final SearchService searchService;


    @PostMapping("/api/v1/search")
    public Long save(@RequestBody SearchSaveRequestDto requestDto){
        return searchService.save(requestDto);
    }

   // @PostMapping("/api/v1/news")
   // public String save(@RequestBody SearchSaveRequestDto requestDto){
   //     return NaverApiSearch.newApi(String json);
   // }


}
