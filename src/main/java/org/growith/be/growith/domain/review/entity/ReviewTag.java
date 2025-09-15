package org.growith.be.growith.domain.review.entity;

import jakarta.persistence.*;
import lombok.*;
import org.growith.be.growith.global.common.BaseEntity;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "review_tag")
public class ReviewTag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "review_tag_id")
    private Long id;

    private String name;
}
