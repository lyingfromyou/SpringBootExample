package com.lying.examplefreemarker.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {
    private Long id;
    private Integer provinceId;
    private String cityName;
    private String description;
}
