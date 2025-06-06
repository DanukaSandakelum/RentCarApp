package com.Code_With_Danuka.service.auth;
import com.Code_With_Danuka.repostory.userRepostory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;





import com.Code_With_Danuka.dto.SingupRequest;
import com.Code_With_Danuka.dto.UserDto;
import com.Code_With_Danuka.entity.User;
import com.Code_With_Danuka.enums.UserRole;

@Service



@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final userRepostory userRepository;

    @Override
    public UserDto createCustomer(SingupRequest signupRequest) {
        User newUser = new User();
        newUser.setName(signupRequest.getName());
        newUser.setEmail(signupRequest.getEmail());
        newUser.setPassword(signupRequest.getPassword());
        newUser.setUserRole( UserRole.CUSTOMER);
        User createdUser = userRepository.save(newUser);

        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }

}