package com.lying.examplemongodb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class User {

    @Id
    private Long id;

    private String username;
    private Integer age;


}
