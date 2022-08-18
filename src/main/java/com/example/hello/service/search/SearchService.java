package com.example.hello.service.search;

import com.example.hello.domain.search.TbSearchRepository;
import com.example.hello.utils.NaverApiSearch;
import com.example.hello.web.dto.SearchSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class SearchService {

    private final TbSearchRepository tbSearchRepository;

    @Transactional
    public Long save(SearchSaveRequestDto requestDto) {
        return tbSearchRepository.save(requestDto.toEntity()).getId();
    }
    public String news(SearchSaveRequestDto requestDto){
        return NaverApiSearch.newApi(requestDto.getSearch());
    }

}
