package net.wraith.s_s.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> RAW_JASPER = ITEMS.register("raw_jasper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JASPER = ITEMS.register("jasper",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MALACHITE_PICKAXE = ITEMS.register("malachite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MALACHITE, 2, -2.8f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALACHITE_AXE = ITEMS.register("malachite_axe",
            () -> new AxeItem(ModToolTiers.MALACHITE, 5, -3f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALACHITE_SHOVEL = ITEMS.register("malachite_shovel",
            () -> new ShovelItem(ModToolTiers.MALACHITE, 1.5f, -3f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALACHITE_HOE = ITEMS.register("malachite_hoe",
            () -> new HoeItem(ModToolTiers.MALACHITE, 1, -3f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALACHITE_SWORD = ITEMS.register("malachite_sword",
            () -> new SwordItem(ModToolTiers.MALACHITE, 3, -2.4f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALACHITE_HELMET = ITEMS.register("malachite_helmet",
            () -> new ArmorItem(ModArmorMaterials.MALACHITE, EquipmentSlot.HEAD, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALACHITE_CHESTPLATE = ITEMS.register("malachite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MALACHITE, EquipmentSlot.CHEST, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALACHITE_LEGGINGS = ITEMS.register("malachite_leggings",
            () -> new ArmorItem(ModArmorMaterials.MALACHITE, EquipmentSlot.LEGS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALACHITE_BOOTS = ITEMS.register("malachite_boots",
            () -> new ArmorItem(ModArmorMaterials.MALACHITE, EquipmentSlot.FEET, new Item.Properties().stacksTo(1)));





    public static final RegistryObject<Item> JASPER_PICKAXE = ITEMS.register("jasper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.JASPER, 2, -2.8f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JASPER_AXE = ITEMS.register("jasper_axe",
            () -> new AxeItem(ModToolTiers.JASPER, 5, -3f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JASPER_SHOVEL = ITEMS.register("jasper_shovel",
            () -> new ShovelItem(ModToolTiers.JASPER, 1.5f, -3f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JASPER_HOE = ITEMS.register("jasper_hoe",
            () -> new HoeItem(ModToolTiers.JASPER, 1, -1f, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JASPER_SWORD = ITEMS.register("jasper_sword",
            () -> new SwordItem(ModToolTiers.JASPER, 3, -2.4f, new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
