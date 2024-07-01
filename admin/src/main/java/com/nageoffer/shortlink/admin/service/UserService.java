package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.common.convention.result.Result;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserLoginReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    Boolean  hasUsername(String username);

    void register(UserRegisterReqDTO requestParam);

    void update( UserUpdateReqDTO requestParam);

    /**
     * 用户登陆， 返回token
     * @param requestParam
     * @return
     */

    UserLoginRespDTO login( UserLoginReqDTO requestParam);


    /**
     *
     * @param username
     * @param token
     * @return
     */
    Boolean checkLogin(String username, String token);

    /**
     * 用户退出登陆
     * @param username
     * @param token
     */
    void logout(String username, String token);

}
