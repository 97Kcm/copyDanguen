package com.dangeun.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;

@Getter
@Setter
@ToString
public class FileDTO {
    @ToString.Exclude
    private byte[] data;
    private Integer no;
    private MultipartFile file;
    @ToString.Exclude
    private String fileUrl;

    public void setFile(MultipartFile file) {
        this.file = file;
        try{
            data = file.getBytes();
        }catch (Exception e){}
    }

    public void setData(byte[] data) {
        this.data = data;
        if (this.data != null) {
            String base64 = Base64.getEncoder().encodeToString(this.data);
            fileUrl = "data:image/*;base64," + base64;
        }
    }
}
