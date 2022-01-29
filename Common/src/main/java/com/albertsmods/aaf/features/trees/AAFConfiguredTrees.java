package com.albertsmods.aaf.features.trees;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;

public class AAFConfiguredTrees {

    public static final ConfiguredFeature<?, ?> AZALEA_TREE = FeatureUtils.register("azalea_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder
                    (BlockStateProvider.simple(Blocks.OAK_LOG), new BendingTrunkPlacer
                            (4, 2, 0, 3, UniformInt.of
                                    (1, 2)), new WeightedStateProvider
                            (SimpleWeightedRandomList.<BlockState>builder().add
                                    (Blocks.AZALEA_LEAVES.defaultBlockState(), 3).add
                                    (Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 1)), new
                            RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2),
                            50), new TwoLayersFeatureSize(1, 0, 1)))
                    .dirt(BlockStateProvider.simple(Blocks.ROOTED_DIRT)).forceDirt().build()));
}
