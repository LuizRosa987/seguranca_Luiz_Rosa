package application.service;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.usernameNotFoundException;
import org.springframework.stereotype.Service;
import application.repository.UserRepository;


public class AppUserDetailsServece implements UserDetailsService{
    @Autowired
    private UserRepository UserRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws usernameNotFoundException{
        User user = userRepo.findByUsername(username);
        if (user==null){
            throw new usernameNotFoundException("Usuário Não Encontrado");

        }
        UserDetails = 
        org.springframework.security.core.userdetails.User.builder()
        .username(user.getUsername())
        .password(user.getPassword())
        .roles("User")
        .build();
    return UserDetails;
    }
    

}