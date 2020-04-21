package com.nchu.recom.service.impl;

import com.nchu.recom.domain.BroadcastLink;
import com.nchu.recom.repository.BroadcastLinkRepository;
import com.nchu.recom.service.BroadcastLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BroadcastLinkServiceImpl implements BroadcastLinkService {
    private BroadcastLinkRepository broadcastLinkRepository;

    @Autowired
    public BroadcastLinkServiceImpl(BroadcastLinkRepository broadcastLinkRepository) {
        this.broadcastLinkRepository = broadcastLinkRepository;
    }

    /**
     * 查找所有书籍
     *
     * @return Collection<BroadcastLink>
     */
    @Override
    public Collection<BroadcastLink> getAllBroadcastLink() {
        return broadcastLinkRepository.findAll();
    }

    /**
     * 根据用户id查找所有的通知
     *
     * @param userId 用户id
     * @return Collection<BroadcastLink>
     */
    @Override
    public Collection<BroadcastLink> findByUserId(int userId) {
        return broadcastLinkRepository.findByUserId(userId);
    }

    /**
     * 插入通知连接
     *
     * @param broadcastLink 通知连接实体类
     * @return Boolean
     */
    @Override
    public Boolean insertBroadcastLink(BroadcastLink broadcastLink) {
        return null;
//        return broadcastLinkRepository.insertBroadcastLink(broadcastLink.getUserId(), broadcastLink.getBroadcastId());
    }

    /**
     * 删除通知连接
     *
     * @param broadcastLink 通知连接实体类
     * @return Boolean
     */
    @Override
    public Boolean deleteBroadcastLink(BroadcastLink broadcastLink) {
//        return broadcastLinkRepository.deleteBroadcastLink(broadcastLink.getUserId(), broadcastLink.getBroadcastId());
        return null;
    }
}
