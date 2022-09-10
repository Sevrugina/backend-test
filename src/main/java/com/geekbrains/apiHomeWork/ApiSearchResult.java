package com.geekbrains.apiHomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ApiSearchResult {
    private Long id;
    private String name;
    private Measures measures;
    private String[] usages;
    private String[] usageRecipeIds;
    private Boolean pantryItem;
    private String aisle;
    private Float cost;
    private Long ingredientId;
}
