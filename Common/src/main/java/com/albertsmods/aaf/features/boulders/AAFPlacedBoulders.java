package com.albertsmods.aaf.features.boulders;

import com.albertsmods.aaf.AAFConstants;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class AAFPlacedBoulders {

    public static final PlacedFeature ANCIENT_DEBRIS_BOULDER = createPlacedFeature("ancient_debris_boulder",
            AAFConfiguredBoulders.ANCIENT_DEBRIS_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature ANDESITE_BOULDER = createPlacedFeature("andesite_boulder",
            AAFConfiguredBoulders.ANDESITE_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature BASALT_BOULDER = createPlacedFeature("basalt_boulder",
            AAFConfiguredBoulders.BASALT_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature BEDROCK_BOULDER = createPlacedFeature("bedrock_boulder",
            AAFConfiguredBoulders.BEDROCK_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature BLACKSTONE_BOULDER = createPlacedFeature("blackstone_boulder",
            AAFConfiguredBoulders.BLACKSTONE_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature AMETHYST_BOULDER = createPlacedFeature("amethyst_boulder",
            AAFConfiguredBoulders.AMETHYST_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature BLUE_ICE_BOULDER = createPlacedFeature("blue_ice_boulder",
            AAFConfiguredBoulders.BLUE_ICE_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature BONE_BLOCK_BOULDER = createPlacedFeature("bone_block_boulder",
            AAFConfiguredBoulders.BONE_BLOCK_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature CALCITE_BOULDER = createPlacedFeature("calcite_boulder",
            AAFConfiguredBoulders.CALCITE_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature CLAY_BOULDER = createPlacedFeature("clay_boulder",
            AAFConfiguredBoulders.CLAY_BOULDER.placed(CountPlacement.of(2),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature COARSE_DIRT_BOULDER = createPlacedFeature("coarse_dirt_boulder",
            AAFConfiguredBoulders.COARSE_DIRT_BOULDER.placed(CountPlacement.of(2),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature COBBLED_DEEPSLATE_BOULDER = createPlacedFeature("cobbled_deepslate_boulder",
            AAFConfiguredBoulders.COBBLED_DEEPSLATE_BOULDER.placed(CountPlacement.of(2),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static final PlacedFeature COBBLESTONE_BOULDER = createPlacedFeature("cobblestone_boulder",
            AAFConfiguredBoulders.COBBLESTONE_BOULDER.placed(CountPlacement.of(2),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    public static <PF extends PlacedFeature> PF createPlacedFeature(String id, PF placedFeature) {
        ResourceLocation AAFID = new ResourceLocation(AAFConstants.MOD_ID, id);
        if (BuiltinRegistries.PLACED_FEATURE.keySet().contains(AAFID))
            throw new IllegalStateException("Placed Feature ID: \"" + AAFID.toString() + "\" already exists in the Placed Features registry!");

        Registry.register(BuiltinRegistries.PLACED_FEATURE, AAFID, placedFeature);
        return placedFeature;
    }
}
