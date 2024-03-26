package com.example.Music_play.modelMessage;

import com.example.Music_play.model.User;
import com.example.Music_play.modelDTO.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserMessage {
    private UserDTO userDTO;

    private String message;

    private List<UserDTO> userDTOS;
}
