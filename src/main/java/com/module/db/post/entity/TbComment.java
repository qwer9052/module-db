package com.module.db.post.entity;

import com.module.db.base.BaseEntity;
import com.module.db.user.entity.TbUser;
import com.module.db.common.enums.Del;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DynamicInsert
@Builder(builderMethodName = "TbCommentBuilder")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class TbComment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column(nullable = false)
    private String content;

    @Column(columnDefinition = "TINYINT", nullable = false)
    @ColumnDefault("'0'")
    @Builder.Default
    private Del del = Del.N;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private TbUser tbUser;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "postId", nullable = false)
    private TbPost tbPost;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private TbComment parent;

    @Builder.Default
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TbComment> children = new ArrayList<>();

    public void updateParent(TbComment tbComment){
        this.parent = tbComment;
    }

}
