package com.datang.cn.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "loginFilter",urlPatterns = {"/selectByName","/selectName","/serviceExpenses","/serviceStore","/serviceSetting"})
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException { }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String providerId = (String) request.getSession().getAttribute("providerId");
        if (null == providerId) {
            response.sendRedirect("/login");
        }else {
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() { }
}
