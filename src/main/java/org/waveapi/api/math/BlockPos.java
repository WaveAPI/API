package org.waveapi.api.math;

public class BlockPos {

    public BlockPos (int x, int y, int z) {}

    public BlockPos (Vector3 vector3) {}

    public int getX() {return 0;}
    public int getY() {return 0;}
    public int getZ() {return 0;}

    public BlockPos setX(int x) {return java.util.Objects.requireNonNull(null);}
    public BlockPos setY(int y) {return java.util.Objects.requireNonNull(null);}
    public BlockPos setZ(int z) {return java.util.Objects.requireNonNull(null);}

    public BlockPos addX(int x) {return java.util.Objects.requireNonNull(null);}
    public BlockPos addY(int y) {return java.util.Objects.requireNonNull(null);}
    public BlockPos addZ(int z) {return java.util.Objects.requireNonNull(null);}

    public BlockPos add(int x, int y, int z) {return java.util.Objects.requireNonNull(null);}

    public BlockPos add(BlockPos pos) {return java.util.Objects.requireNonNull(null);}

    public Vector3 toVector3() {return java.util.Objects.requireNonNull(null);}

}
