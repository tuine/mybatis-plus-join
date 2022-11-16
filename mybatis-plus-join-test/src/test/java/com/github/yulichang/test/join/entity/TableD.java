package com.github.yulichang.test.join.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("table_d")
public class TableD {

    @TableId
    private Integer id;

    private Integer cid;

    private String name;
}
