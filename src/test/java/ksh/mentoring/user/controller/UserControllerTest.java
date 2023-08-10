package ksh.mentoring.user.controller;

import ksh.mentoring.user.entity.User;
import ksh.mentoring.user.model.UserDuty;
import ksh.mentoring.user.model.UserRole;
import ksh.mentoring.user.repository.UserRepository;
import ksh.mentoring.user.service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @DisplayName("회원가입 성공")
    @Test
    void register_success() {
        //given
        User user = User.builder()
                .email("test@gmail.com")
                .password("1234")
                .name("홍길동")
                .nickname("멋쟁이")
                .role(UserRole.MENTOR)
                .duty(UserDuty.BACKEND)
                .build();

        //when
        userRepository.save(user);

        //then
        Optional<User> findUser = userRepository.findByEmail(user.getEmail());
        Assertions.assertThat(findUser.isPresent()).isTrue();

    }


}