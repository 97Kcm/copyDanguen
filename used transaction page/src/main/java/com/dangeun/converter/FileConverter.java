package com.dangeun.converter;


import com.dangeun.dto.FileDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class FileConverter implements Converter<MultipartFile, List<FileDTO>> {
    @Override
    public List<FileDTO> convert(MultipartFile source) {
        FileDTO fileDTO = new FileDTO();
        fileDTO.setFile(source);
        return List.of(fileDTO);

    }
}