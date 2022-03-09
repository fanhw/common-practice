package com.fhw.practice.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-10 00:07
 */


public class LogCostFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Execute cost=" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {

    }
}
