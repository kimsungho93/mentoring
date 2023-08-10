//package ksh.mentoring.common.filter;
//
//import ksh.mentoring.util.TokenProvider;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@RequiredArgsConstructor
//public class TokenAuthenticationFilter extends OncePerRequestFilter {
//
//    private final TokenProvider tokenProvider;
//    private final static String HEADER_AUTHORIZATION = "Authorization";
//    private final static String TOKEN_PREFIX = "Bearer";
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String authorizationHeader =request.getHeader(HEADER_AUTHORIZATION);
//        String token = getAccessToken(authorizationHeader);
//    }
//
//    private String getAccessToken(String authorizationHeader) {
//        if (authorizationHeader != null && authorizationHeader.startsWith(TOKEN_PREFIX)) {
//            return authorizationHeader.substring(TOKEN_PREFIX.length());
//        }
//        return null;
//    }
//}
