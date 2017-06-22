package io.github.gregsen.apokrinomai.reader;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Reader {

    List<String> getFilePaths();

    String getContent(String filePath);
}
