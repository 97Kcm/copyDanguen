package com.dangeun.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class MessageDTO {
    private String name;
    private String nowDate;
    private String message;

}
