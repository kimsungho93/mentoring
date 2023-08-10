package ksh.mentoring.user.repository;

import ksh.mentoring.user.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshTokenRepository> findByUserId(Long userId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
