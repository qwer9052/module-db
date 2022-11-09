package com.module.db.user.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.module.db.user.entity.TbUser;
import com.querydsl.core.annotations.QueryProjection;
import lombok.*;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TbUserDto {

    private Long userId;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String pwd;

    private String email, name;

    private LocalDateTime creDt;

    private LocalDateTime updDt;

    @QueryProjection
    public TbUserDto(String name, Long userId){
        this.name = name;
        this.userId = userId;
    }


}
