package com.nchu.recom.service;

import com.nchu.recom.domain.Broadcast;

import java.util.Collection;

public interface BroadcastService {
    /**
     * 查询所有通知
     *
     * @return Collection<Broadcast>
     */
    public Collection<Broadcast> getAllBroadcasts();

    /**
     * 根据id查找通知
     *
     * @param id id
     * @return Broadcast
     */
    public Broadcast findById(String id);
}
