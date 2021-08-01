package com.zx.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "product_info")
public class ProductInfo {
    @TableId(value = "product_id", type = IdType.INPUT)
    private String productId;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 单价
     */
    @TableField(value = "product_price")
    private BigDecimal productPrice;

    /**
     * 库存
     */
    @TableField(value = "product_stock")
    private Integer productStock;

    /**
     * 描述
     */
    @TableField(value = "product_description")
    private String productDescription;

    /**
     * 小图
     */
    @TableField(value = "product_icon")
    private String productIcon;

    /**
     * 商品状态,0正常1下架
     */
    @TableField(value = "product_status")
    private Integer productStatus;

    /**
     * 类目编号
     */
    @TableField(value = "category_type")
    private Integer categoryType;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;
}