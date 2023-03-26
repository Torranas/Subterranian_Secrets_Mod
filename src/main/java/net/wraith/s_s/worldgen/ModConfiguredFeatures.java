package net.wraith.s_s.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.wraith.s_s.SubterraneanSecrets;
import net.wraith.s_s.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> EBONY_KEY = registerKey("ebony");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MALACHITE_ORE_KEY = registerKey("malachite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_MALACHITE_ORE_KEY = registerKey("end_malachite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_MALACHITE_ORE_KEY = registerKey("nether_malachite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_JASPER_ORE_KEY = registerKey("jasper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_JASPER_ORE_KEY = registerKey("end_jasper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_JASPER_ORE_KEY = registerKey("nether_jasper_ore");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stonereplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslatereplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackreplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstonereplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldMalachiteOres = List.of(OreConfiguration.target(stonereplaceables,
                ModBlocks.MALACHITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslatereplaceables, ModBlocks.DEEPSLATE_MALACHITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldJasperOres = List.of(OreConfiguration.target(stonereplaceables,
                        ModBlocks.JASPER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslatereplaceables, ModBlocks.DEEPSLATE_JASPER_ORE.get().defaultBlockState()));

        register(context, EBONY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.EBONY_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.simple(ModBlocks.EBONY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, OVERWORLD_MALACHITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMalachiteOres, 10));
        register(context, END_MALACHITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstonereplaceables,
                ModBlocks.ENDSTONE_MALACHITE_ORE.get().defaultBlockState(), 10));
        register(context, NETHER_MALACHITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackreplaceables,
                ModBlocks.NETHERRACK_MALACHITE_ORE.get().defaultBlockState(), 10));
        register(context, OVERWORLD_JASPER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldJasperOres, 10));
        register(context, END_JASPER_ORE_KEY, Feature.ORE, new OreConfiguration(endstonereplaceables,
                ModBlocks.ENDSTONE_JASPER_ORE.get().defaultBlockState(), 10));
        register(context, NETHER_JASPER_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackreplaceables,
                ModBlocks.NETHERRACK_JASPER_ORE.get().defaultBlockState(), 10));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(SubterraneanSecrets.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

