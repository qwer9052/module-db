package com.module.db.post.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
@Builder(builderMethodName = "TbPostHistoryBuilder")
public class TbPostHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postHistoryId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId")
    private TbPost tbPost;

    @ColumnDefault("0")
    @Builder.Default
    private Long count = 0L;

    public void addCount() {
        this.count++;
    }


}
