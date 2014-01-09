package com.joetheperson.bananamod;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderBanana extends WorldProvider {
    private final String dimensionName = "Bananaland";
    @Override
    public String getDimensionName() {
        return dimensionName;
    }

    @Override
    protected void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.desert, 0, 0);
        this.dimensionId = BananaMod.bananaDimensionID;
    }

    @Override
    public IChunkProvider createChunkGenerator() {
        return new ChunkProviderBanana(worldObj, worldObj.getSeed(), true);
    }
}
