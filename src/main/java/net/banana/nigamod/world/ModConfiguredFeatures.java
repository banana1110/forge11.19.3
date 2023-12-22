package net.banana.nigamod.world;

import net.banana.nigamod.NigaMod;
import net.banana.nigamod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> NIGA_KEY = registerKey("niga");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NIGA_ORE_KEY = registerKey("niga_ore");

    public static void  bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context){
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldNigaOres=List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.NIGA_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_NIGA_ORE.get().defaultBlockState()));

        register(context, NIGA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NIGA_LOG.get()),
                new StraightTrunkPlacer(5,6,3),
                BlockStateProvider.simple(ModBlocks.NIGA_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2),ConstantInt.of(0),4),
                new TwoLayersFeatureSize(1,0,2)).build());

        register(context, OVERWORLD_NIGA_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNigaOres, 10));

    }



    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(NigaMod.MOD_ID, name));

    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key ,F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }}
