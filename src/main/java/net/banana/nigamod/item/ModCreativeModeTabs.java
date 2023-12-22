package net.banana.nigamod.item;

import net.banana.nigamod.NigaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

@Mod.EventBusSubscriber(modid = NigaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            NigaMod.MOD_ID);

public static RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TAB.register("tutorial_tab", ()->
        CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.Niga_Ingot.get()))
                .title(Component.translatable("creativemodetab.tutorial_tab"))
                .displayItems((pParameters, pOutput)-> {
pOutput.accept(ModItem.Niga_Ingot.get());






                })


                .build());

    public static  void  register(IEventBus eventBus){
    CREATIVE_MODE_TAB.register(eventBus);
    }
}