package com.fhw.practice.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-10 00:18
 */



@WebFilter(urlPatterns = "/*",filterName = "LogCostFilter2")
public class LogCostFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("LogFilter2 Execute cost=" + (System.currentTimeMillis() - start));
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {

    }
}
