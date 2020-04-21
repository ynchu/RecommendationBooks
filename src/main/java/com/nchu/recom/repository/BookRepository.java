package com.nchu.recom.repository;

import com.nchu.recom.domain.Book;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    /**
     * 根据名称搜索书籍
     *
     * @param name 书籍名称
     * @return Collection<User>
     */
    @Query("SELECT * FROM book WHERE name LIKE :name;")
    Collection<Book> findByName(@Param("name") String name);

    @Modifying
    @Query("UPDATE book \n" +
            "SET name      = :name,\n" +
            "    publish   = :publish,\n" +
            "    isbn      = :isbn,\n" +
            "    writer    = :writer,\n" +
            "    local_url = :localUrl,\n" +
            "    price     = :price,\n" +
            "    type      = :type,\n" +
            "    upper     = :upper,\n" +
            "    viewed    = :viewed,\n" +
            "    cover     = :cover,\n" +
            "    status    = :status \n" +
            "WHERE id = :id;")
    Boolean updateBook(@Param("id") int id,
                       @Param("name") String name,
                       @Param("publish") String publish,
                       @Param("isbn") String isbn,
                       @Param("writer") String writer,
                       @Param("localUrl") String localUrl,
                       @Param("price") Float price,
                       @Param("type") String type,
                       @Param("upper") String upper,
                       @Param("viewed") int viewed,
                       @Param("cover") String cover,
                       @Param("status") int status);

    // TODO 其他操作

//    @Modifying
//    @Query("update book set name=:name, publish=:publish, isbn=:isbn, writer=:writer, " +
//            "local_url=:url, price=:price, type=:type, upper=:upper, viewed=:viewed," +
//            "cover=:cover, status=:status where id=:id")
//    boolean updateBook(@Param("id") int id,
//                    @Param("name") String name,
//                    @Param("publish") String publish,
//                    @Param("isbn") String isbn,
//                    @Param("writer") String writer,
//                    @Param("url") String url,
//                    @Param("price") double price,
//                    @Param("type") String type,
//                    @Param("upper") String upper,
//                    @Param("viewed") int viewed,
//                    @Param("cover") String cover,
//                    @Param("status") int status);
}
