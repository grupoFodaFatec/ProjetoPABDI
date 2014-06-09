package com.cereteste.interceptor;

import com.cereteste.pojo.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object controller) throws Exception {
        String uri = request.getRequestURI();
        System.out.println(uri);
        if(uri.startsWith("/resources") ||
                uri.equals("/") ||
                uri.equals("/index") ||
                uri.equals("/password") ||
                uri.equals("/user/add") ||
                uri.contains("/login") ||
                uri.contains("/favicon.ico") ||
                uri.equals("/user/create"))  {
            return true;
        }

        User u = (User)request.getSession().getAttribute("user");
        if (u == null) {
            response.sendRedirect("/login");
            return false;
        }
        else if(u != null) {
            if ((uri.equals("/adm") && u.getType() == 1) ||
                    (uri.equals("/main") && u.getType() == 0)) {
                response.sendRedirect("/login");
                return false;
            }
            if (uri.equals("/user/add")) {
                if (u.getType() == 0) response.sendRedirect("/adm");
                else response.sendRedirect("/main");
                return true;
            }
            return true;
        }

        response.sendRedirect("/login");
        return false;
    }
}