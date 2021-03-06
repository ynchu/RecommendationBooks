package com.nchu.recom.service.impl;

import com.nchu.recom.domain.Broadcast;
import com.nchu.recom.repository.BroadcastRepository;
import com.nchu.recom.service.BroadcastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BroadcastServiceImpl implements BroadcastService {

    private BroadcastRepository broadcastRepository;

    @Autowired
    public BroadcastServiceImpl(BroadcastRepository broadcastRepository) {
        this.broadcastRepository = broadcastRepository;
    }

    /**
     * 查询所有通知
     *
     * @return Collection<Broadcast>
     */
    @Override
    public Collection<Broadcast> getAllBroadcasts() {
        return (Collection<Broadcast>) broadcastRepository.findAll();
    }

    /**
     * 根据id查找通知
     *
     * @param id id
     * @return Broadcast
     */
    @Override
    public Broadcast findById(String id) {
        return broadcastRepository.findByBroadcastId(id);
    }

    /**
     * 添加通知
     *
     * @param broadcast 通知实体
     * @return Boolean
     */
    @Override
    public Boolean insertBroadcast(Broadcast broadcast) {
        return broadcastRepository.insertBroadcast(broadcast.getId(), broadcast.getUserId(), broadcast.getContent(), broadcast.getTime());
    }

    /**
     * 修改通知
     *
     * @param broadcast 通知实体
     * @return Boolean
     */
    @Override
    public Boolean updateBroadcast(Broadcast broadcast) {
        return broadcastRepository.updateBroadcast(broadcast.getId(), broadcast.getUserId(), broadcast.getContent(), broadcast.getTime());
    }

    /**
     * 删除通知
     *
     * @param broadcast 通知实体
     * @return Boolean
     */
    @Override
    public Boolean deleteBroadcast(Broadcast broadcast) {
        return broadcastRepository.deleteBroadcast(broadcast.getId());
    }

}
