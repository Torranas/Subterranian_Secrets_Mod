package net.wraith.s_s.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.wraith.s_s.SubterraneanSecrets;
import net.wraith.s_s.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static Tier MALACHITE;

    static {
        MALACHITE = TierSortingRegistry.registerTier(
                new ForgeTier(5, 1869, 8.5f, 3f, 13,
                        ModTags.Blocks.NEEDS_MALACHITE_TOOL, () -> Ingredient.of(ModItems.MALACHITE.get())),
                new ResourceLocation(SubterraneanSecrets.MOD_ID, "malachite"), List.of(Tiers.NETHERITE), List.of());


    }

    public static Tier JASPER;

    static {
        JASPER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 300, 10f, 4f, 20,
                        ModTags.Blocks.NEEDS_JASPER_TOOL, () -> Ingredient.of(ModItems.JASPER.get())),
                new ResourceLocation(SubterraneanSecrets.MOD_ID, "jasper"), List.of(Tiers.NETHERITE), List.of());
    }
}
