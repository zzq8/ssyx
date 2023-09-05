package com.atguigu.ssyx.sys.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 城市仓库关联表
 * </p>
 *
 * @author XD
 * @since 2023-09-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="RegionWare对象", description="城市仓库关联表")
public class RegionWare implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "开通区域id")
    private Long regionId;

    @ApiModelProperty(value = "区域名称")
    private String regionName;

    @ApiModelProperty(value = "仓库")
    private Long wareId;

    @ApiModelProperty(value = "仓库名称")
    private String wareName;

    @ApiModelProperty(value = "状态（0：未开通 1：已开通）")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标记（0:不可用 1:可用）")
    private Integer isDeleted;


}
