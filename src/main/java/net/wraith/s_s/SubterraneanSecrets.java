package net.wraith.s_s;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.wraith.s_s.block.ModBlocks;
import net.wraith.s_s.item.ModCreativeModeTabs;
import net.wraith.s_s.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SubterraneanSecrets.MOD_ID)
public class SubterraneanSecrets {
    public static final String MOD_ID = "s_s";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SubterraneanSecrets() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.MALACHITE);
            event.accept(ModItems.RAW_MALACHITE);
            event.accept(ModItems.JASPER);
            event.accept(ModItems.RAW_JASPER);
        }
        if (event.getTab() == ModCreativeModeTabs.SUBTERRANEAN_SECRETS_TAB) {
            event.accept(ModItems.MALACHITE);
            event.accept(ModItems.RAW_MALACHITE);
            event.accept(ModItems.JASPER);
            event.accept(ModItems.RAW_JASPER);
            event.accept(ModItems.MALACHITE_PICKAXE);
            event.accept(ModItems.MALACHITE_AXE);
            event.accept(ModItems.MALACHITE_SHOVEL);
            event.accept(ModItems.MALACHITE_HOE);
            event.accept(ModItems.MALACHITE_SWORD);
            event.accept(ModItems.MALACHITE_HELMET);
            event.accept(ModItems.MALACHITE_CHESTPLATE);
            event.accept(ModItems.MALACHITE_LEGGINGS);
            event.accept(ModItems.MALACHITE_BOOTS);
            event.accept(ModItems.JASPER_PICKAXE);
            event.accept(ModItems.JASPER_AXE);
            event.accept(ModItems.JASPER_SHOVEL);
            event.accept(ModItems.JASPER_HOE);
            event.accept(ModItems.JASPER_SWORD);
            event.accept(ModBlocks.MALACHITE_BLOCK);
            event.accept(ModBlocks.MALACHITE_ORE);
            event.accept(ModBlocks.DEEPSLATE_MALACHITE_ORE);
            event.accept(ModBlocks.NETHERRACK_MALACHITE_ORE);
            event.accept(ModBlocks.ENDSTONE_MALACHITE_ORE);
            event.accept(ModBlocks.JASPER_ORE);
            event.accept(ModBlocks.DEEPSLATE_JASPER_ORE);
            event.accept(ModBlocks.NETHERRACK_JASPER_ORE);
            event.accept(ModBlocks.ENDSTONE_JASPER_ORE);
            event.accept(ModBlocks.EBONY_LEAVES);
            event.accept(ModBlocks.EBONY_LOG);
            event.accept(ModBlocks.EBONY_WOOD);
            event.accept(ModBlocks.EBONY_PLANKS);
            event.accept(ModBlocks.STRIPPED_EBONY_LOG);
            event.accept(ModBlocks.STRIPPED_EBONY_WOOD);
            event.accept(ModBlocks.EBONY_SAPLING);
        }
        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.MALACHITE_BLOCK);
            event.accept(ModBlocks.JASPER_BLOCK);
            event.accept(ModItems.RAW_JASPER);
            event.accept(ModBlocks.EBONY_LEAVES);
            event.accept(ModBlocks.EBONY_LOG);
            event.accept(ModBlocks.EBONY_WOOD);
            event.accept(ModBlocks.EBONY_PLANKS);
            event.accept(ModBlocks.STRIPPED_EBONY_LOG);
            event.accept(ModBlocks.STRIPPED_EBONY_WOOD);
            event.accept(ModBlocks.EBONY_SAPLING);

        }
        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.MALACHITE_ORE);
            event.accept(ModBlocks.DEEPSLATE_MALACHITE_ORE);
            event.accept(ModBlocks.NETHERRACK_MALACHITE_ORE);
            event.accept(ModBlocks.ENDSTONE_MALACHITE_ORE);
            event.accept(ModBlocks.JASPER_ORE);
            event.accept(ModBlocks.DEEPSLATE_JASPER_ORE);
            event.accept(ModBlocks.NETHERRACK_JASPER_ORE);
            event.accept(ModBlocks.ENDSTONE_JASPER_ORE);
            event.accept(ModBlocks.EBONY_LEAVES);
            event.accept(ModBlocks.EBONY_LOG);
            event.accept(ModBlocks.EBONY_WOOD);
            event.accept(ModBlocks.EBONY_PLANKS);
            event.accept(ModBlocks.STRIPPED_EBONY_LOG);
            event.accept(ModBlocks.STRIPPED_EBONY_WOOD);
            event.accept(ModBlocks.EBONY_SAPLING);
        }

        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.MALACHITE_PICKAXE);
            event.accept(ModItems.MALACHITE_AXE);
            event.accept(ModItems.MALACHITE_SHOVEL);
            event.accept(ModItems.MALACHITE_HOE);
            event.accept(ModItems.MALACHITE_SWORD);
            event.accept(ModItems.JASPER_PICKAXE);
            event.accept(ModItems.JASPER_AXE);
            event.accept(ModItems.JASPER_SHOVEL);
            event.accept(ModItems.JASPER_HOE);
            event.accept(ModItems.JASPER_SWORD);
        }
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
