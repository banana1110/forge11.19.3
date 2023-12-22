package net.banana.nigamod.item;

import net.banana.nigamod.NigaMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
         DeferredRegister.create(ForgeRegistries.ITEMS, NigaMod.MOD_ID);

    public static final RegistryObject<Item> Niga_Ingot = ITEMS.register("niga_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Ligma = ITEMS.register("ligma",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Candice = ITEMS.register("candice",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NIGA_STICK = ITEMS.register("niga_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIGABERRY = ITEMS.register("nigaberry",
            () -> new Item(new Item.Properties().food(ModFoods.NIGABERRY)));

    public static final RegistryObject<Item> NIGA_SWORD = ITEMS.register("niga_sword",
            () -> new SwordItem(ModToolTiers.NIGA, 8,3,  new Item.Properties()));

    public static final RegistryObject<Item> NIGA_SWORD1 = ITEMS.register("niga_sword1",
            () -> new SwordItem(ModToolTiers.NIGA, 8,3,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_WOODEN_SWORD = ITEMS.register("niga_wooden_sword",
            () -> new SwordItem(ModToolTiers.NIGA_WOOD, 4,1,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_PICKAXE = ITEMS.register("niga_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NIGA, 4,2,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_PICKAXE1 = ITEMS.register("niga_pickaxe1",
            () -> new PickaxeItem(ModToolTiers.NIGA, 4,2,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_WOODEN_PICKAXE = ITEMS.register("niga_wooden_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NIGA_WOOD, 2,1,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_AXE = ITEMS.register("niga_axe",
            () -> new AxeItem(ModToolTiers.NIGA, 6,5,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_AXE1 = ITEMS.register("niga_axe1",
            () -> new AxeItem(ModToolTiers.NIGA, 6,5,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_WOODEN_AXE = ITEMS.register("niga_wooden_axe",
            () -> new AxeItem(ModToolTiers.NIGA_WOOD, 2,3,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_SHOVEL = ITEMS.register("niga_shovel",
            () -> new ShovelItem(ModToolTiers.NIGA, 3,2,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_SHOVEL1 = ITEMS.register("niga_shovel1",
            () -> new ShovelItem(ModToolTiers.NIGA, 3,2,  new Item.Properties()));
    public static final RegistryObject<Item> NIGA_WOODEN_SHOVEL = ITEMS.register("niga_wooden_shovel",
            () -> new ShovelItem(ModToolTiers.NIGA_WOOD, 1,1,  new Item.Properties()));


    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
