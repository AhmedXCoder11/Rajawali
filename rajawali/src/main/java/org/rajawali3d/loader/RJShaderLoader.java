package org.rajawali3d.loader;

import org.rajawali3d.shaders.ShaderProgram;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RJShaderLoader {
    public static ShaderProgram loadRJShader(String vertexPath, String fragmentPath) throws Exception {
        String vertexCode = new String(Files.readAllBytes(Paths.get(vertexPath)));
        String fragmentCode = new String(Files.readAllBytes(Paths.get(fragmentPath)));
        return new ShaderProgram(vertexCode, fragmentCode);
    }
}
