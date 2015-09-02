package com.vgrazi.bytecodeexplorer.structure.constantTypes;

import com.vgrazi.bytecodeexplorer.util.Utils;

import java.util.List;

/**
 * Created by vgrazi on 8/13/15.
 */
public class ConstantClass implements ConstantType {

    private int startByteIndex;
    private int nameIndex;

    public ConstantClass() {

    }

    /**
     * "tag item" is how the documentation refers to the type byte
     *
     * @return
     */
    @Override
    public byte getTag() {
        return 7;
    }

    public void setData(byte[] bytes, int index) {
        this.startByteIndex = index;
        this.nameIndex = Utils.getTwoBytes(bytes, index + 1);
    }

    @Override
    public String toString(List<ConstantType> constants) {
        return "Class\t\t\t#" + nameIndex;
    }

    /**
     * How many elements in this section, for example, constant pool has many elements.
     *
     * @return Number of elements in this section
     */
    @Override
    public int elementCount() {
        return 1;
    }

    /**
     * length in bytes of this section
     *
     * @return length in bytes of this section
     */
    @Override
    public int length() {
        return 3;
    }

    /**
     * Index to the first byte of this section relative to the constant pool
     *
     * @return
     */
    @Override
    public int getStartByteIndex() {
        return 0;
    }


    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}