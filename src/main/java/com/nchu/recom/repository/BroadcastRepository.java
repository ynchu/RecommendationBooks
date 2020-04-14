package com.nchu.recom.repository;

import com.nchu.recom.domain.Broadcast;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BroadcastRepository extends CrudRepository<Broadcast, String> {
    /**
     * 根据id查找通知
     *
     * @param id id
     * @return Broadcast
     */
    @Query("SELECT * FROM broadcast WHERE broadcastid = :condition;")
    public Broadcast findByBroadcastId(@Param("condition") String id);
}
