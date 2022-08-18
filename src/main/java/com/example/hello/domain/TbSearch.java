package com.example.hello.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class TbSearch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String search;

    @Builder
    public TbSearch(String search){
        this.search = search;
    }
}
