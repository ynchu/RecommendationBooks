package com.nchu.recom.repository;

import com.nchu.recom.domain.BroadcastLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface BroadcastLinkRepository extends JpaRepository<BroadcastLink, Long> {
    /**
     * 查找所有的通知连接
     *
     * @return Iterable<BroadcastLink>
     */
    @Query(value = "SELECT * FROM broad_link;", nativeQuery = true)
//    @Query(value = "SELECT * FROM broad_link;")
    @Override
    default List<BroadcastLink> findAll() {
        return null;
    }

    /**
     * 根据用户id查找自己的通知
     *
     * @param userId 用户id
     * @return Collection<BroadcastLink>
     */
    @Query(nativeQuery = true, value = "SELECT * FROM broad_link WHERE user_id = :userId;")
//    @Query("SELECT * FROM broad_link WHERE user_id = :userId;")
    Collection<BroadcastLink> findByUserId(@Param("userId") int userId);

//    /**
//     * 插入通知连接
//     *
//     * @param userId      用户id
//     * @param broadcastId 通知id
//     * @return Boolean
//     */
//    @Modifying
//    @Query(nativeQuery = true, value = "INSERT broad_link(user_id, broadcast_id) VALUES (:userId, :broadcastId);")
////    @Query("INSERT broad_link(user_id, broadcast_id) VALUES (:userId, :broadcastId);")
//    Boolean insertBroadcastLink(@Param("userId") int userId, @Param("broadcastId") String broadcastId);
//
//    // TODO 更新方法暂时不需要
//
//    /**
//     * 删除通知连接
//     *
//     * @param userId      用户id
//     * @param broadcastId 通知id
//     * @return Boolean
//     */
//    @Modifying
//    @Query(nativeQuery = true, value = "DELETE FROM broad_link WHERE user_id = :userId AND broadcast_id = :broadcastId;")
////    @Query("DELETE FROM broad_link WHERE user_id = :userId AND broadcast_id = :broadcastId;")
//    Boolean deleteBroadcastLink(@Param("userId") int userId, @Param("broadcastId") String broadcastId);
}
