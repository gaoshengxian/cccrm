package cn.looip.wap.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.looip.wap.service.interfaces.WapService;

@Controller
@RequestMapping("/wap")
public class WapController {
  @Autowired
  private WapService wapservice;
}
