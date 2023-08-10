package ksh.mentoring.user.service;

import ksh.mentoring.user.dto.UserRegisterRequest;
import ksh.mentoring.user.entity.User;

public interface UserService {
    /**
     * 회원 가입
     */
    public void register(UserRegisterRequest request);

}
