package com.albertsmods.aaf.features.trees;

import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class AAFTrees {

    public static void addSparseAzaleaTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AAFPlacedTrees.AZALEA_SPARSE);
    }
    public static void addAzaleaTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AAFPlacedTrees.AZALEA);
    }
    public static void addDenseAzaleaTrees(BiomeGenerationSettings.Builder gen) {
        gen.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, AAFPlacedTrees.AZALEA_DENSE);
    }
}
