package com.example.hello.domain.search;

import com.example.hello.domain.TbSearch;
import com.example.hello.web.dto.FoodRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TbSearchRepository extends JpaRepository<TbSearch, Long> {

}
