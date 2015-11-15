package com.vgrazi.bytecodeexplorer.structure;

import com.vgrazi.bytecodeexplorer.utils.Utils;

/**
 * Created by vgrazi on 8/13/15.
 */
public class BuildSection implements ClassFileSection {
    private final int build;
    private int startByte;

    public BuildSection(byte[] bytes, int startByte) {
        this.startByte = startByte;
        build = Utils.getTwoBytes(bytes, getStartByteIndex());
    }

    @Override
    public int elementCount() {
        return 1;
    }

    @Override
    public int length() {
        return 2;
    }

    @Override
    public int getStartByteIndex() {
        return startByte;
    }
}