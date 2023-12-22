package net.banana.nigamod.datagen;

import net.banana.nigamod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.banana.nigamod.NigaMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super   (output, NigaMod.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels(){
        blockWithItem(ModBlocks.NIGA_BLOCK);
        blockWithItem(ModBlocks.LIGMA_BLOCK);
        blockWithItem(ModBlocks.CANDICE_BLOCK);
        blockWithItem(ModBlocks.NIGA_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_NIGA_ORE);

        logBlock(((RotatedPillarBlock) ModBlocks.NIGA_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.NIGA_WOOD.get()), blockTexture(ModBlocks.NIGA_LOG.get()), blockTexture(ModBlocks.NIGA_LOG.get()));
axisBlock(((RotatedPillarBlock)ModBlocks.STRIPPED_NIGA_LOG.get()), new ResourceLocation(NigaMod.MOD_ID, "block/stripped_niga_log"),
        new ResourceLocation(NigaMod.MOD_ID, "block/stripped_niga_log_top"));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_NIGA_WOOD.get()), new ResourceLocation(NigaMod.MOD_ID, "block/stripped_niga_log"),
                new ResourceLocation(NigaMod.MOD_ID, "block/stripped_niga_log"));
        blockWithItem(ModBlocks.NIGA_PLANKS);
        blockWithItem(ModBlocks.NIGA_LEAVES);
        saplingBlock(ModBlocks.NIGA_SAPLING);

        simpleBlockItem(ModBlocks.NIGA_LOG.get(), models().withExistingParent("kk:niga_log","minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.NIGA_WOOD.get(), models().withExistingParent("kk:niga_wood","minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_NIGA_WOOD.get(), models().withExistingParent("kk:stripped_niga_wood","minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_NIGA_LOG.get(), models().withExistingParent("kk:stripped_niga_log","minecraft:block/cube_column"));

    }
    private void  blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void saplingBlock(RegistryObject<Block> blockRegistryObject){
        simpleBlockItem(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
