package com.nchu.recom.service;

import com.nchu.recom.domain.Broadcast;

import java.util.Collection;

public interface BroadcastService {
    /**
     * 查询所有通知
     *
     * @return Collection<Broadcast>
     */
    Collection<Broadcast> getAllBroadcasts();

    /**
     * 根据id查找通知
     *
     * @param id id
     * @return Broadcast
     */
    Broadcast findById(String id);

    /**
     * 添加通知
     *
     * @param broadcast 通知实体
     * @return Boolean
     */
    Boolean insertBroadcast(Broadcast broadcast);

    /**
     * 修改通知
     *
     * @param broadcast 通知实体
     * @return Boolean
     */
    Boolean updateBroadcast(Broadcast broadcast);

    /**
     * 删除通知
     *
     * @param broadcast 通知实体
     * @return Boolean
     */
    Boolean deleteBroadcast(Broadcast broadcast);
}

