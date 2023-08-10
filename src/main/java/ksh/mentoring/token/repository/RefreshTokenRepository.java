package ksh.mentoring.token.repository;

import ksh.mentoring.token.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshTokenRepository> findByUserId(Long userId);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
