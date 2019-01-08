package com.zbl.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhaobaolong
 * @Title: Product
 * @ProjectName mall-parent
 * @Description: TODO
 * @date 2019/1/89:53
 */
@Data
@Accessors(chain = true)
public class Product {
	private Integer id;
	private String name;

}
