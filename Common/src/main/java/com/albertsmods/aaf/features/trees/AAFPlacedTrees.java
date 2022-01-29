package com.albertsmods.aaf.features.trees;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class AAFPlacedTrees {

    public static final PlacedFeature AZALEA_SPARSE =
            PlacementUtils.register("azalea_sparse", AAFConfiguredTrees.AZALEA_TREE.placed(VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(1, 0.05f, 2))));

    public static final PlacedFeature AZALEA =
            PlacementUtils.register("azalea", AAFConfiguredTrees.AZALEA_TREE.placed(VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(2, 0.05f, 2))));

    public static final PlacedFeature AZALEA_DENSE =
            PlacementUtils.register("azalea_dense", AAFConfiguredTrees.AZALEA_TREE.placed(VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(4, 0.05f, 2))));

}
