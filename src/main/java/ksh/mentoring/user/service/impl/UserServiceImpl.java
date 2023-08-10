package ksh.mentoring.user.service.impl;

import ksh.mentoring.common.exception.BizException;
import ksh.mentoring.user.dto.UserRegisterRequest;
import ksh.mentoring.user.entity.User;
import ksh.mentoring.user.model.UserDuty;
import ksh.mentoring.user.model.UserRole;
import ksh.mentoring.user.repository.UserRepository;
import ksh.mentoring.user.service.UserService;
import ksh.mentoring.util.PasswordUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    /**
     * 회원가입 메서드
     */
    @Override
    public void register(UserRegisterRequest request) {
        log.info("UserServiceImpl.register() called.");
        Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());

        if (optionalUser.isPresent()) {
            throw new BizException("이미 가입된 이메일 입니다.");
        }

        String encryptPassword = PasswordUtils.encryptedPassword(request.getPassword());
        String nickname = request.getNickname() != null ? request.getNickname() : request.getName();

        User user = User.builder()
                .email(request.getEmail())
                .password(encryptPassword)
                .name(request.getName())
                .nickname(nickname)
                .role(UserRole.valueOf(request.getRole()))
                .duty(UserDuty.valueOf(request.getDuty()))
                .build();

        userRepository.save(user);
    }
}
