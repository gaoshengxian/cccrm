package cn.looip.wap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.looip.wap.repository.dao.WapDao;
import cn.looip.wap.service.interfaces.WapService;

public class WapServiceImpl implements WapService {
    @Autowired
	private WapDao wapdao;
}
