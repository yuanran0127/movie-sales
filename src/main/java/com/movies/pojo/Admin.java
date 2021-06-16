package com.movies.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 管理员id
     */
        @TableId(value = "adm_id", type = IdType.AUTO)
      private Integer admId;

      /**
     * 管理员用户名
     */
       String admName;

      /**
     * 管理员密码
     */
      private String admPassword;


}
