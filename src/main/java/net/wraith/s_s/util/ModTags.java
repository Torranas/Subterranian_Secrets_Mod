package net.wraith.s_s.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.wraith.s_s.SubterraneanSecrets;


public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_MALACHITE_TOOL
                = tag("needs_malachite_tool");
        public static final TagKey<Block> NEEDS_JASPER_TOOL
                = tag("needs_jasper_tool");


        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(SubterraneanSecrets.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
