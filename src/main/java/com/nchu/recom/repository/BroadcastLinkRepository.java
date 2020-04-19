package com.nchu.recom.repository;

import com.nchu.recom.domain.BroadcastLink;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BroadcastLinkRepository extends CrudRepository<BroadcastLink, Long> {
    /**
     * 查找所有的通知连接
     *
     * @return Iterable<BroadcastLink>
     */
    @Query("SELECT * FROM broad_link;")
    @Override
    Iterable<BroadcastLink> findAll();

    /**
     * 根据用户id查找自己的通知
     *
     * @param userId 用户id
     * @return Collection<BroadcastLink>
     */
    @Query("SELECT * FROM broad_link WHERE user_id = :userId;")
    Collection<BroadcastLink> findByUserId(@Param("userId") int userId);

    /**
     * 插入通知连接
     *
     * @param userId      用户id
     * @param broadcastId 通知id
     * @return Boolean
     */
    @Modifying
    @Query("INSERT broad_link(user_id, broadcast_id) VALUES (:userId, :broadcastId);")
    Boolean insertBroadcastLink(@Param("userId") int userId, @Param("broadcastId") String broadcastId);

    // TODO 更新方法暂时不需要

    /**
     * 删除通知连接
     *
     * @param userId      用户id
     * @param broadcastId 通知id
     * @return Boolean
     */
    @Modifying
    @Query("DELETE FROM broad_link WHERE user_id = :userId AND broadcast_id = :broadcastId;")
    Boolean deleteBroadcastLink(@Param("userId") int userId, @Param("broadcastId") String broadcastId);
}
