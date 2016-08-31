package com.ehsy.common.controller;

import com.ehsy.common.model.OpcUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ehsy_it on 2016/8/10.
 */
@Controller
public class CommonController {

    @RequestMapping("/doLogin")
    public String doLogin(OpcUser opcUser, Model model) {
        UsernamePasswordToken token = new UsernamePasswordToken(opcUser.getUserName(), opcUser.getPassword());
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();
        String msg = "";
        try {
            subject.login(token);
            if (subject.isAuthenticated()) {
                return "redirect:/home";
            } else {
                return "common/login";
            }
        } catch (IncorrectCredentialsException e) {
            msg = "登录密码错误";
        } catch (ExcessiveAttemptsException e) {
            msg = "登录失败次数过多";
        } catch (LockedAccountException e) {
            msg = "帐号已被锁定";
        } catch (DisabledAccountException e) {
            msg = "帐号已被禁用";
        } catch (ExpiredCredentialsException e) {
            msg = "帐号已过期";
        } catch (UnknownAccountException e) {
            msg = "帐号不存在";
        } catch (UnauthorizedException e) {
            msg = "您没有得到相应的授权";
        }
        model.addAttribute("msg", msg);
        return "common/login";
    }

        @RequestMapping("/login")
    public String login (Model model){
        return "common/login";
    }

    @RequestMapping("home")
    public String home (Model model){
        return "home.comm";
    }

        @RequestMapping("/body1")
        public String a (Model model){
            model.addAttribute("name", "body1");
            return "body1.page";
        }

        @RequestMapping("/body2")
        public String b (Model model){
            model.addAttribute("name", "body2");
            return "body2.page";
        }

        @RequestMapping("/404")
        public String error404 (Model model){
            return "common/error/404";
        }

        @RequestMapping("/500")
        public String error500 (Model model){
            return "common/error/500";
        }

    }
