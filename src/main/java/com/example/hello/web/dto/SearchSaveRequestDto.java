package com.example.hello.web.dto;


import com.example.hello.domain.TbSearch;
import com.example.hello.service.search.SearchService;
import lombok.*;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SearchSaveRequestDto {
    private int id;
    private String search;
    private int cnt;
    

    @Builder
    public SearchSaveRequestDto(int id,String search,int cnt){
        this.id = id;
        this.search = search;
        this.cnt = cnt;
    }

    public TbSearch toEntity(){

        return TbSearch.builder()
                .id(id)
                .search(search)
                .cnt(cnt)
                .build();
    }
}
