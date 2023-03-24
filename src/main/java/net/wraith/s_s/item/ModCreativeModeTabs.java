package net.wraith.s_s.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wraith.s_s.SubterraneanSecrets;

@Mod.EventBusSubscriber(modid = SubterraneanSecrets.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab SUBTERRANEAN_SECRETS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        SUBTERRANEAN_SECRETS_TAB = event.registerCreativeModeTab(new ResourceLocation(SubterraneanSecrets.MOD_ID, "subterranean_secrets_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.MALACHITE.get()))
                        .title(Component.translatable("creativemodetab.subterranean_secrets_tab")));
    }
}
