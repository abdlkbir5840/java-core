package com.org.webstorageapplication.dto;

import lombok.*;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {
    private int  id;
    private String  userName;
    private String  email;
}
