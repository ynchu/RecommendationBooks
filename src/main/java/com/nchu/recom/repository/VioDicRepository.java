package com.nchu.recom.repository;

import com.nchu.recom.domain.VioDic;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface VioDicRepository extends CrudRepository<VioDic, String> {
    /**
     * 根据关键字查询违规词
     *
     * @param keyword 关键字
     * @return Collection<VioDic>
     */
    @Query("SELECT * FROM vio_dic WHERE vio_word LIKE :keyword;")
    Collection<VioDic> findByKeyword(@Param("keyword") String keyword);

    /**
     * 添加违规词
     *
     * @param vioWord 违规词
     * @return Boolean
     */
    @Modifying
    @Query("INSERT vio_dic(vio_word) VALUES (:vioWord);")
    Boolean insertVioDic(@Param("vioWord") String vioWord);

    /**
     * 修改违规词
     *
     * @param oldVioWord 原来的违规词
     * @param newVioWord 新的违规词
     * @return Boolean
     */
    @Modifying
    @Query("UPDATE vio_dic SET vio_word = :newVioWord WHERE vio_word = :oldVioWord;")
    Boolean updateVioDic(@Param("oldVioWord") String oldVioWord, @Param("newVioWord") String newVioWord);
}
