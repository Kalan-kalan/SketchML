package org.dma.sketchml.sketch.base;

import java.util.stream.IntStream;

public interface BinaryEncoder {
    void encode(int[] values);

    void encode(IntStream stream);

    int[] decode();

    int memoryBytes();

}
