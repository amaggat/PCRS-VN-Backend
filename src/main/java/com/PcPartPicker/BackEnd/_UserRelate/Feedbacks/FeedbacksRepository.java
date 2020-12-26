package com.PcPartPicker.BackEnd._UserRelate.Feedbacks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FeedbacksRepository extends JpaRepository<Feedbacks, Integer>, JpaSpecificationExecutor<Feedbacks> {
}
