package net.wraith.s_s.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wraith.s_s.block.ModBlocks;
import net.wraith.s_s.SubterraneanSecrets;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SubterraneanSecrets.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.MALACHITE_BLOCK);
        blockWithItem(ModBlocks.JASPER_BLOCK);
        blockWithItem(ModBlocks.MALACHITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MALACHITE_ORE);
        blockWithItem(ModBlocks.NETHERRACK_MALACHITE_ORE);
        blockWithItem(ModBlocks.ENDSTONE_MALACHITE_ORE);
        blockWithItem(ModBlocks.JASPER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_JASPER_ORE);
        blockWithItem(ModBlocks.NETHERRACK_JASPER_ORE);
        blockWithItem(ModBlocks.ENDSTONE_JASPER_ORE);

        logBlock(((RotatedPillarBlock) ModBlocks.EBONY_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.EBONY_WOOD.get(), blockTexture(ModBlocks.EBONY_LOG.get()), blockTexture(ModBlocks.EBONY_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_EBONY_LOG.get(), new ResourceLocation(SubterraneanSecrets.MOD_ID, "block/stripped_ebony_log"),
                new ResourceLocation(SubterraneanSecrets.MOD_ID, "block/stripped_ebony_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_EBONY_WOOD.get(), new ResourceLocation(SubterraneanSecrets.MOD_ID, "block/stripped_ebony_log"),
                new ResourceLocation(SubterraneanSecrets.MOD_ID, "block/stripped_ebony_log"));

        blockWithItem(ModBlocks.EBONY_PLANKS);
        blockWithItem(ModBlocks.EBONY_LEAVES);
        saplingBlock(ModBlocks.EBONY_SAPLING);

        simpleBlockItem(ModBlocks.EBONY_LOG.get(), models().withExistingParent("s_s:ebony_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.EBONY_WOOD.get(), models().withExistingParent("s_s:ebony_wood", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_EBONY_LOG.get(), models().withExistingParent("s_s:stripped_ebony_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_EBONY_WOOD.get(), models().withExistingParent("s_s:stripped_ebony_wood", "minecraft:block/cube_column"));

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
