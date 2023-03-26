package net.wraith.s_s.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.wraith.s_s.block.ModBlocks;
import net.wraith.s_s.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        add(ModBlocks.MALACHITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.MALACHITE_ORE.get(), ModItems.RAW_MALACHITE.get()));
        add(ModBlocks.DEEPSLATE_MALACHITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_MALACHITE_ORE.get(), ModItems.RAW_MALACHITE.get()));
        add(ModBlocks.NETHERRACK_MALACHITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERRACK_MALACHITE_ORE.get(), ModItems.RAW_MALACHITE.get()));
        add(ModBlocks.ENDSTONE_MALACHITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_MALACHITE_ORE.get(), ModItems.RAW_MALACHITE.get()));
        add(ModBlocks.JASPER_ORE.get(),
                (block) -> createOreDrop(ModBlocks.JASPER_ORE.get(), ModItems.RAW_JASPER.get()));
        add(ModBlocks.DEEPSLATE_JASPER_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_JASPER_ORE.get(), ModItems.RAW_JASPER.get()));
        add(ModBlocks.NETHERRACK_JASPER_ORE.get(),
                (block) -> createOreDrop(ModBlocks.NETHERRACK_JASPER_ORE.get(), ModItems.RAW_JASPER.get()));
        add(ModBlocks.ENDSTONE_JASPER_ORE.get(),
                (block) -> createOreDrop(ModBlocks.ENDSTONE_JASPER_ORE.get(), ModItems.RAW_JASPER.get()));

        this.dropSelf(ModBlocks.MALACHITE_BLOCK.get());
        this.dropSelf(ModBlocks.JASPER_BLOCK.get());
        this.dropSelf(ModBlocks.EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_WOOD.get());
        this.dropSelf(ModBlocks.EBONY_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        this.dropSelf(ModBlocks.EBONY_SAPLING.get());

        this.add(ModBlocks.EBONY_LEAVES.get(), (block) ->
                createLeavesDrops(block, ModBlocks.EBONY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
