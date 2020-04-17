package com.nchu.recom.service;

import com.nchu.recom.domain.BroadcastLink;

import java.util.Collection;

public interface BroadcastLinkService {
    /**
     * 查找所有书籍
     *
     * @return Collection<BroadcastLink>
     */
    Collection<BroadcastLink> getAllBroadcastLink();

    /**
     * 根据用户id查找所有的通知
     *
     * @param userId 用户id
     * @return Collection<BroadcastLink>
     */
    Collection<BroadcastLink> findByUserId(int userId);

    /**
     * 插入通知连接
     *
     * @param broadcastLink 通知连接实体类
     * @return Boolean
     */
    Boolean insertBroadcastLink(BroadcastLink broadcastLink);

    /**
     * 删除通知连接
     *
     * @param broadcastLink 通知连接实体类
     * @return Boolean
     */
    Boolean deleteBroadcastLink(BroadcastLink broadcastLink);
}
