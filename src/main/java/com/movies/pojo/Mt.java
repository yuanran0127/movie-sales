package com.movies.pojo;

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
@AllArgsConstructor
@NoArgsConstructor
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Mt implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 电影名称
     */
        private String mName;

      /**
     * 类型名称
     */
      private String tName;


}
