package net.wraith.s_s.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.wraith.s_s.SubterraneanSecrets;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MALACHITE_TOOL
                = tag("needs_malachite_tool");
        public static final TagKey<Block> NEEDS_JASPER_TOOL
                = tag("needs_jasper_tool");

    }

    public static class Items{

        public static final TagKey<Item> IS_WOOD
                =tag2("is_wood");
    }



        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(SubterraneanSecrets.MOD_ID, name));
        }
        private static TagKey<Item> tag2(String name_2){
            return ItemTags.create(new ResourceLocation(SubterraneanSecrets.MOD_ID, name_2));
        }
        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

