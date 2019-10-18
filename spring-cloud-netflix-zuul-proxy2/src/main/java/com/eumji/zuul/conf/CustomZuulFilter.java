package com.eumji.zuul.conf;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 前置过滤器配置
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/11
 * TIME: 15:47
 */
public class CustomZuulFilter extends ZuulFilter {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 过滤器类型
     * pre 事前
     * routing 路由请求时候调用
     * error 发生错误时候调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre" ;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否过来
     * 0 不过滤
     * 1 过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 拦截的具体操作
     * 验证token
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        String token = request.getParameter("token");
        logger.info("token:"+token);
        if (!token.equals("success_token")){
            //认证失败
            logger.error("token验证失败");
            HttpServletResponse response = ctx.getResponse();
            response.setCharacterEncoding("utf-8");  //设置字符集
            response.setContentType("text/html; charset=utf-8"); //设置相应格式
            response.setStatus(401);
            ctx.setSendZuulResponse(false); //不进行路由
            try {
                response.getWriter().write("token 验证失败"); //响应体
            } catch (IOException e) {
                e.printStackTrace();
            }
            ctx.setResponse(response);
            return null;
        }
        logger.info("token验证成功");
        return null;
    }
}
