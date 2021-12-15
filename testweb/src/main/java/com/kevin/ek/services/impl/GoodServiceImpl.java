package com.kevin.ek.services.impl;

import com.kevin.ek.model.Good;
import com.kevin.ek.services.GoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author TX
 * @date 2020/5/28 15:05
 */
@Service
public class GoodServiceImpl implements GoodService {


    private Logger logger = LoggerFactory.getLogger(GoodServiceImpl.class);

    @Override
    public Good getGoodByIdForUpt(int id) {
        return null;
    }
}
