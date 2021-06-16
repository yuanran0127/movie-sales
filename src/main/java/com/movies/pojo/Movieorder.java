package com.movies.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author movies
 * @since 2021-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Movieorder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    /**
     * 购买的电影id
     */
    private Integer mId;

    /**
     * 购买电影的用户id
     */
    private Integer uId;

    /**
     * 订单创建日期
     */
    private String odate;

    /**
     * 购买数量
     */
    private Integer onum;


//    /*用户*/
//    private User user;
//    /**
//     * 电影
//     */
//    private Movie movie;

}
