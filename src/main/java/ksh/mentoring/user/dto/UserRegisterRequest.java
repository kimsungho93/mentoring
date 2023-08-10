package ksh.mentoring.user.dto;

import ksh.mentoring.common.entity.BaseEntity;
import ksh.mentoring.user.entity.User;
import ksh.mentoring.user.model.UserDuty;
import ksh.mentoring.user.model.UserRole;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterRequest extends BaseEntity {
    @Email(message = "이메일 형식에 맞게 입력해 주세요.")
    @NotBlank(message = "이메일은 필수 항목입니다.")
    private String email;

    @Size(min = 4, max = 20, message = "비밀번호는 4자 이상 20자 이하입니다.")
    @NotNull(message = "비밀호는 필수 항목입니다.")
    private String password;

    @Size(min = 2, max = 10, message = "이름은 2자 이상 10자 이하입니다.")
    @NotNull(message = "이름은 필수 항목입니다.")
    private String name;

    private String nickname;
    private String role;
    private String duty;

}


