package io.github.itstaylz.mapgl.gl;

import io.github.itstaylz.mapgl.gl.enums.GlBufferType;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GlState {

    private final Map<GlBufferType, Integer> boundedBuffers = new HashMap<>();
    private Color clearColor = Color.BLACK;
    private int boundedVertexArray = 0;

    public void setClearColor(Color color) {
        this.clearColor = color;
    }

    public Color getClearColor() {
        return this.clearColor;
    }

    public void setBoundedArrayBuffer(GlBufferType bufferType, int id) {
        if (id == 0)
            this.boundedBuffers.remove(bufferType);
        else
            this.boundedBuffers.put(bufferType, id);
    }

    public int getBoundedArrayBuffer(GlBufferType bufferType) {
        return this.boundedBuffers.getOrDefault(bufferType, 0);
    }

    public void setBoundedVertexArray(int vao) {
        this.boundedVertexArray = vao;
    }

    public int getBoundedVertexArray() {
        return boundedVertexArray;
    }
}
