package net.banana.nigamod.datagen;

import net.banana.nigamod.NigaMod;
import net.banana.nigamod.block.ModBlocks;
import net.banana.nigamod.item.ModItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.HangingEntityItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, NigaMod.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels(){
        simpleItem(ModItem.Candice);
        simpleItem(ModItem.Ligma);
        simpleItem(ModItem.Niga_Ingot);
        saplingItem(ModBlocks.NIGA_SAPLING);
        simpleItem(ModItem.NIGABERRY);
        handheldItem(ModItem.NIGA_AXE);
        handheldItem(ModItem.NIGA_SWORD);
        handheldItem(ModItem.NIGA_PICKAXE);
        handheldItem(ModItem.NIGA_SHOVEL);
        simpleItem(ModItem.NIGA_STICK);
        handheldItem(ModItem.NIGA_SWORD1);
        handheldItem(ModItem.NIGA_PICKAXE1);
        handheldItem(ModItem.NIGA_AXE1);
        handheldItem(ModItem.NIGA_SHOVEL1);
        handheldItem(ModItem.NIGA_WOODEN_AXE);
        handheldItem(ModItem.NIGA_WOODEN_SHOVEL);
        handheldItem(ModItem.NIGA_WOODEN_SWORD);
        handheldItem(ModItem.NIGA_WOODEN_PICKAXE);

    }
    private ItemModelBuilder saplingItem(RegistryObject<Block> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NigaMod.MOD_ID, "block/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
        new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NigaMod.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(NigaMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
