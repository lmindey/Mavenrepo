package foodpanda.webapp.common.spring.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import foodpanda.webapp.business.model.User;

public class AuthenticationHolder {
   public User getAuthenticatedUser() {
      Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
      if (authentication != null) {
         if (authentication.getPrincipal() instanceof UserDetailsImpl) {
            return ((UserDetailsImpl) authentication.getPrincipal()).getUser();
         }
      }
      return null;
   }
}
