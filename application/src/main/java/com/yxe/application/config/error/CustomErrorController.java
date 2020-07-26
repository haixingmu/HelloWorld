package com.yxe.application.config.error;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.yxe.application.exception.Result;

@RequestMapping("")
@Controller
public class CustomErrorController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @GetMapping(ERROR_PATH)
    @ResponseBody
    public String error(HttpServletRequest request) {
        Enumeration<String> attributes = request.getAttributeNames();

        Map<String, Object> map = new HashMap<String, Object>();
        while (attributes.hasMoreElements()) {
           String name = attributes.nextElement();
           if (name.startsWith("java")) {
               // spring本身的属性不宜对外暴露，切记！
               Object value = request.getAttribute(name);
               map.put(name, value);
           }
        }
        return JSON.toJSON(new Result<Map<String, Object>>(404, "404异常", map)).toString();
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}