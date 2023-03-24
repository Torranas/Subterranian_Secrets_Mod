package net.wraith.s_s.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wraith.s_s.SubterraneanSecrets;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SubterraneanSecrets.MOD_ID);

    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MALACHITE = ITEMS.register("raw_malachite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MALACHITE_PICKAXE = ITEMS.register("malachite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MALACHITE, 2, 3f, new Item.Properties().stacksTo(1)));

    //public static final RegistryObject<Item> MALACHITE_AXE = ITEMS.register("malachite_axe",
      //      () -> new AxeItem(ModToolTiers.MALACHITE, 2, 3f, new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
