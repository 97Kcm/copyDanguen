package com.dangeun.dto;

import lombok.*;

import java.io.File;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    private Integer no;
    private UserDTO user;
    private String title;
    private String address;
    private String extraAddress;
    private Integer price;
    private String category;
    private String content;
    private Date nowDate;
    private List<FileDTO> productImages;

}
