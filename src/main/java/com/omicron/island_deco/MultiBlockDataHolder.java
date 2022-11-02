package com.omicron.island_deco;

public class MultiBlockDataHolder {
    public final int amount;
    public final int[] multiBlockX;
    public final int[] multiBlockY;
    public final int[] multiBlockZ;

    public MultiBlockDataHolder(int amount, int[] multiBlockX, int[] multiBlockY, int[] multiBlockZ) {
        this.amount = amount;
        this.multiBlockX = multiBlockX;
        this.multiBlockY = multiBlockY;
        this.multiBlockZ = multiBlockZ;
    }
}
