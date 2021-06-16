package com.movies.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author movies
 * @since 2021-05-13
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)

public class Type implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 类型id
     */
        @TableId(value = "t_id", type = IdType.AUTO)
      private Integer tId;

      /**
     * 类型名称
     */
      private String tName;


}
