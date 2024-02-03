package com.example.myproductservice.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyFilter implements Filter {
 private Logger logger = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         HttpServletRequest request = (HttpServletRequest) servletRequest;

        logger.info("request received for the path : {}",request.getRequestURI());
        filterChain.doFilter(servletRequest,servletResponse);

        HttpServletResponse response = (HttpServletResponse) servletResponse;
        logger.info("returning response: {} to client",response);


    }
}
