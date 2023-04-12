package com.module.db.post.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.module.db.common.enums.Del;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TbPostLikeDto {

    private Long postId;
    private Long postLikeId;
    private Long userId;
    private Del del;
    private LocalDateTime creDt;
    private LocalDateTime updDt;

}
