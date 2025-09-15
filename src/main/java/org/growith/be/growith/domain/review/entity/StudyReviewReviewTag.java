package org.growith.be.growith.domain.review.entity;


import jakarta.persistence.*;
import lombok.*;
import org.growith.be.growith.global.common.BaseEntity;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "study_review_review_tag")
public class StudyReviewReviewTag extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "study_review_review_tag_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_review_id")
    private StudyReview studyReview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_tag_id")
    private ReviewTag reviewTag;
}
