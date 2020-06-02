package com.snowalker.shardingjdbc.snowalker.demo.service;

import com.snowalker.shardingjdbc.snowalker.demo.entity.OrderInfo;
import com.snowalker.shardingjdbc.snowalker.demo.entity.UoInfo;
import com.snowalker.shardingjdbc.snowalker.demo.mapper.OrderMapper;
import com.snowalker.shardingjdbc.snowalker.demo.mapper.UoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author snowalker
 * @version 1.0
 * @date 2019/3/3 22:39
 * @className
 * @desc
 */
@Service(value = "uoService")
public class UoServiceImpl implements UoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UoServiceImpl.class);

    @Autowired
    UoMapper uoMapper;


    @Override
    public int addOrder(UoInfo uoInfo) {
        LOGGER.info("订单入库开始，orderinfo={}", uoInfo.toString());
        return uoMapper.addUo(uoInfo);
    }

    @Override
    public List<UoInfo> getUoInfo(UoInfo uoInfo) {
        return uoMapper.getUoInfo(uoInfo);
    }
}
