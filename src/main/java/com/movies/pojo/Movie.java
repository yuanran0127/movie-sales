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
@AllArgsConstructor
@NoArgsConstructor
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Movie implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 电影id
     */
        @TableId(value = "m_id", type = IdType.AUTO)
      private Integer mId;

      /**
     * 电影名称
     */
      private String mName;

      /**
     * 电影描述
     */
      private String mDescription;

      /**
     * 电影上映时间
     */
      private String mDuration;

      /**
     *电影持续时间
     */
      private Integer mReleaseTime;

      /**
     * 电影类型
     */
      private String mType;

      /**
     * 电影地区
     */
      private String mArea;


    /**
     * 电影图片
     */
    private String mPhoto;

    /**
     * 电影价格
     */
    private int mPrice;


}
