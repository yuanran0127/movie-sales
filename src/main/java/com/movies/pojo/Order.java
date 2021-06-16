package com.movies.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private static final long serialVersionUID = 1L;
    private int oid;  //订单编号
    private Movie m_id;   //购买的电影id
    private int u_id;   //购买电影的用户id
    private String odate; //订单创建日期
    private int onum;   //购买数量
    private int allPrice; //订单总价

}
