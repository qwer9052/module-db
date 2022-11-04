package com.module.db.entity.post;


import com.module.db.base.BaseEntity;
import com.module.db.entity.user.TbUser;
import com.module.db.enums.post.PostType;
import com.module.db.enums.common.Del;
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
@Builder(builderMethodName = "TbBoardBuilder")
public class TbPost extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

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
    @JoinColumn(name = "user_id")
    private TbUser tbUser;



}
