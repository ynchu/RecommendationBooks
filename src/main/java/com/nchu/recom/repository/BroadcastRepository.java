package com.nchu.recom.repository;

import com.nchu.recom.domain.Broadcast;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface BroadcastRepository extends CrudRepository<Broadcast, String> {
    /**
     * 根据id查找通知
     *
     * @param id id
     * @return Broadcast
     */
    @Query("SELECT * FROM broadcast WHERE id = :id;")
    Broadcast findByBroadcastId(@Param("id") int id);

    /**
     * 插入通知
     *
     * @param userId  用户id
     * @param content 内容
     * @param time    时间
     * @return Boolean
     */
    @Modifying
    @Query("INSERT broadcast(user_id, content, time) VALUES (:userId, :content, :time);")
    Boolean insertBroadcast(@Param("userId") int userId,
                            @Param("content") String content,
                            @Param("time") Timestamp time);


    /**
     * 修改通知
     *
     * @param id      通知id
     * @param userId  用户id
     * @param content 通知内容
     * @param time    通知时间
     * @return Boolean
     */
    @Modifying
    @Query("UPDATE broadcast SET user_id = :userId, content = :content, time = :time WHERE id = :id;")
    Boolean updateBroadcast(@Param("id") int id,
                            @Param("userId") int userId,
                            @Param("content") String content,
                            @Param("time") Timestamp time);

    /**
     * 删除通知
     *
     * @param id 通知id
     * @return Boolean
     */
    @Modifying
    @Query("DELETE FROM broadcast WHERE id = :id;")
    Boolean deleteBroadcast(@Param("id") int id);
}
