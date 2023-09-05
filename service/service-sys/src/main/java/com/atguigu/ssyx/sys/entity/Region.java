package com.atguigu.ssyx.sys.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 地区表
 * </p>
 *
 * @author XD
 * @since 2023-09-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Region对象", description="地区表")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "上级id")
    private Long parentId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标记（0:不可用 1:可用）")
    private Integer isDeleted;


}
