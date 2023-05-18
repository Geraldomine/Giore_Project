package giore.repositories;

import giore.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<User, Long> {
    User findByEmail(String email);

    User save(User user);
}