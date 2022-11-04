package com.module.db.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDto {
    private LocalDateTime creDt;
    private LocalDateTime updDt;

    public BaseDto(){

    }
}
