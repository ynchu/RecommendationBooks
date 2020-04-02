package com.nchu.recom.domain;

import com.nchu.recom.execption.BroadcastNoFoundException;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Administrator
 */
@Component
public class BroadcastFactory {
    /**
     * 生成用于测试的广播通知信息
     *
     * @return List<Broadcast> 广播通知信息列表
     */
    public List<Broadcast> getBroadcasts() {
        List<Broadcast> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Broadcast broadcast = new Broadcast();
            broadcast.setUserId("172011" + String.format("%02d", i + 1));
            broadcast.setBroadcastId(UUID.randomUUID().toString());
            broadcast.setContent("内容" + String.format("%02d", i + 1));
            broadcast.setTime(new Timestamp(System.currentTimeMillis()));
            list.add(broadcast);
        }
        return list;
    }

    /**
     * 根据id精确查找广播通知
     *
     * @param id 通知id
     * @return Broadcast 广播通知
     * @throws Exception 广播通知找不到异常
     */
    public Broadcast findById(String id) throws Exception {
        List<Broadcast> list = getBroadcasts();
        Broadcast broadcast = list.stream().filter(e -> e.getBroadcastId().equals(id))
                .findFirst().orElse(null);
        if (broadcast == null) {
            throw new BroadcastNoFoundException();
        }
        return broadcast;
    }
}
