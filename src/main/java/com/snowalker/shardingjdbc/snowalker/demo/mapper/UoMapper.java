package com.snowalker.shardingjdbc.snowalker.demo.mapper;

import com.snowalker.shardingjdbc.snowalker.demo.entity.OrderInfo;
import com.snowalker.shardingjdbc.snowalker.demo.entity.UoInfo;

import java.util.List;

/**
 * @author snowalker
 * @version 1.0
 * @date 2019/3/3 22:40
 * @className OrderMapper
 * @desc
 */
public interface UoMapper {



    int addUo(UoInfo uoInfo);
    List<UoInfo> getUoInfo(UoInfo uoInfo);
}
