package com.module.db.post.entity;

import com.module.db.base.BaseEntity;
import com.module.db.common.enums.Del;
import com.module.db.user.entity.TbUser;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
@Builder(builderMethodName = "TbPostLikeBuilder")
public class TbCommentLike extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentLikeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commentId")
    private TbComment tbComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private TbUser tbUser;

    @Column(columnDefinition = "TINYINT", nullable = false)
    @ColumnDefault("'0'")
    @Builder.Default
    private Del del = Del.N;

    public void setDel(Del del){
        this.del = del;
    }

}
