package net.wraith.s_s.datagen;

import net.wraith.s_s.SubterraneanSecrets;
import net.wraith.s_s.block.ModBlocks;
import net.wraith.s_s.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SubterraneanSecrets.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.MALACHITE);
        simpleItem(ModItems.JASPER);
        simpleItem(ModItems.RAW_MALACHITE);
        simpleItem(ModItems.RAW_JASPER);
        simpleItem(ModItems.MALACHITE_BOOTS);
        simpleItem(ModItems.MALACHITE_CHESTPLATE);
        simpleItem(ModItems.MALACHITE_LEGGINGS);
        simpleItem(ModItems.MALACHITE_HELMET);
        handheldItem(ModItems.MALACHITE_PICKAXE);
        handheldItem(ModItems.MALACHITE_AXE);
        handheldItem(ModItems.MALACHITE_SHOVEL);
        handheldItem(ModItems.MALACHITE_HOE);
        handheldItem(ModItems.MALACHITE_SWORD);
        saplingItem(ModBlocks.EBONY_SAPLING);
        handheldItem(ModItems.JASPER_PICKAXE);
        handheldItem(ModItems.JASPER_AXE);
        handheldItem(ModItems.JASPER_SHOVEL);
        handheldItem(ModItems.JASPER_HOE);
        handheldItem(ModItems.JASPER_SWORD);




    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SubterraneanSecrets.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SubterraneanSecrets.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(SubterraneanSecrets.MOD_ID,"item/" + item.getId().getPath()));
    }
}