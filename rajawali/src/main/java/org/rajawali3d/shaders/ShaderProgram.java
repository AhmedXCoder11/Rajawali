package org.rajawali3d.shaders;

public class ShaderProgram {
    private String vertexShader;
    private String fragmentShader;

    public ShaderProgram(String vertexShader, String fragmentShader) {
        this.vertexShader = vertexShader;
        this.fragmentShader = fragmentShader;
    }

    public String getVertexShader() { return vertexShader; }
    public String getFragmentShader() { return fragmentShader; }
}
