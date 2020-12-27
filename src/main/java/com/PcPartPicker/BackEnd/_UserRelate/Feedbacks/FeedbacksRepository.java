package com.PcPartPicker.BackEnd._UserRelate.Feedbacks;


import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FeedbacksRepository extends Repository<Feedbacks, Integer>, JpaSpecificationExecutor<Feedbacks> {

    /**
     * Save a {@link Feedbacks} to the data store, either inserting or updating it.
     * @param feedbacks the {@link Feedbacks} to save
     */
    void save(Feedbacks feedbacks);

    @Query("SELECT DISTINCT feedback from Feedbacks feedback WHERE feedback.post.id= :postid")
    List<Feedbacks> findByPostID(@Param("postid") Integer postid);
}
