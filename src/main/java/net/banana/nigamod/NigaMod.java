package net.banana.nigamod;

import com.mojang.logging.LogUtils;


import net.banana.nigamod.block.ModBlocks;
import net.banana.nigamod.item.ModCreativeModeTabs;
import net.banana.nigamod.item.ModFoods;
import net.banana.nigamod.item.ModItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.function.Supplier;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NigaMod.MOD_ID)
public class NigaMod {
    public static final String MOD_ID = "kk";
    private static final Logger LOGGER = LogUtils.getLogger();


    public NigaMod() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModCreativeModeTabs.register(modEventBus);

        ModItem.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItem.Niga_Ingot);

            event.accept(ModItem.Ligma);
           event.accept(ModItem.Candice);
        }

        if (event.getTab() == ModCreativeModeTabs.TUTORIAL_TAB.get()) {
            event.accept(ModItem.Niga_Ingot);
            event.accept(ModItem.Ligma);
            event.accept(ModBlocks.NIGA_BLOCK);
            event.accept(ModItem.Candice);
            event.accept(ModBlocks.LIGMA_BLOCK);
            event.accept(ModBlocks.CANDICE_BLOCK);
            event.accept(ModBlocks.NIGA_ORE);
            event.accept(ModBlocks.NIGA_LOG);
            event.accept(ModBlocks.NIGA_WOOD);
            event.accept(ModBlocks.STRIPPED_NIGA_WOOD);
            event.accept(ModBlocks.STRIPPED_NIGA_LOG);
            event.accept(ModBlocks.NIGA_PLANKS);
            event.accept(ModBlocks.NIGA_SAPLING);
            event.accept(ModBlocks.NIGA_LEAVES);
            event.accept(ModBlocks.DEEPSLATE_NIGA_ORE);
            event.accept(ModItem.NIGABERRY.get());
            event.accept(ModItem.NIGA_AXE);
            event.accept(ModItem.NIGA_SWORD);
            event.accept(ModItem.NIGA_PICKAXE);
            event.accept(ModItem.NIGA_SHOVEL);
                event.accept(ModItem.NIGA_STICK);
                event.accept(ModItem.NIGA_WOODEN_SWORD);
            event.accept(ModItem.NIGA_WOODEN_AXE);
            event.accept(ModItem.NIGA_WOODEN_PICKAXE);
            event.accept(ModItem.NIGA_WOODEN_SHOVEL);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.NIGA_BLOCK);
            event.accept(ModBlocks.LIGMA_BLOCK);
            event.accept(ModBlocks.CANDICE_BLOCK);
            event.accept(ModBlocks.STRIPPED_NIGA_WOOD);
            event.accept(ModBlocks.STRIPPED_NIGA_LOG);
            event.accept(ModBlocks.NIGA_PLANKS);

        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.NIGA_ORE);
            event.accept(ModBlocks.NIGA_LOG);
            event.accept(ModBlocks.NIGA_WOOD);
            event.accept(ModBlocks.NIGA_LEAVES);
            event.accept(ModBlocks.DEEPSLATE_NIGA_ORE);

        }
if (event.getTabKey()== CreativeModeTabs.INGREDIENTS){
   event.accept(ModItem.NIGABERRY.get());
}
if (event.getTabKey()== CreativeModeTabs.COMBAT){
    event.accept(ModItem.NIGA_AXE);
    event.accept(ModItem.NIGA_WOODEN_AXE);
    event.accept(ModItem.NIGA_SWORD);
    event.accept(ModItem.NIGA_WOODEN_SWORD);
}
if(event.getTabKey()==CreativeModeTabs.TOOLS_AND_UTILITIES){
    event.accept(ModItem.NIGA_PICKAXE);
    event.accept(ModItem.NIGA_SHOVEL);
    event.accept(ModItem.NIGA_WOODEN_PICKAXE);
    event.accept(ModItem.NIGA_WOODEN_SHOVEL);
}
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }

}

