package com.module.db.post.entity;


import com.module.db.base.BaseEntity;
import com.module.db.user.entity.TbUser;
import com.module.db.post.enums.PostType;
import com.module.db.common.enums.Del;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@Builder(builderMethodName = "TbPostBuilder")
public class TbPost extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String title;

    @Column(columnDefinition = "LONGTEXT")
    private String content;

    @Column(columnDefinition = "TINYINT")
    @ColumnDefault("'0'")
    private PostType postType;

    @Column(columnDefinition = "TINYINT")
    @ColumnDefault("'0'")
    private Del del;

    @Builder.Default
    @OneToMany(mappedBy = "tbPost")
    List<TbPostLike> postLikes = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private TbUser tbUser;



}
