package io.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2018/11/24
 */
@Entity
@Table(name = "post")
@Data
public class Post {
    @Id
    private Long id;
    private String title;
    private String content;
}
