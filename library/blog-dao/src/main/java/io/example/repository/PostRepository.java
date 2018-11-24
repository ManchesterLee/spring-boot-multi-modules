package io.example.repository;

import io.example.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2018/11/24
 */
@Component
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByTitleLike(String title);

}
