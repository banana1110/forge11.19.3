package net.banana.nigamod.datagen;

import net.banana.nigamod.block.ModBlocks;
import net.banana.nigamod.item.ModItem;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;


import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());


    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.LIGMA_BLOCK.get());
        dropSelf(ModBlocks.NIGA_BLOCK.get());
        add(ModBlocks.NIGA_ORE.get(),
                (block)-> createOreDrop(ModBlocks.NIGA_ORE.get(), ModItem.Niga_Ingot.get()));
        add(ModBlocks.DEEPSLATE_NIGA_ORE.get(),
                (block)-> createOreDrop(ModBlocks.DEEPSLATE_NIGA_ORE.get(), ModItem.Niga_Ingot.get()));
        dropSelf(ModBlocks.CANDICE_BLOCK.get());
this.add(ModBlocks.NIGA_LEAVES.get(), block ->
        createLeavesDrops(block, ModBlocks.NIGA_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.NIGA_WOOD.get());
        this.dropSelf(ModBlocks.NIGA_LOG.get());
        this.dropSelf(ModBlocks.NIGA_PLANKS.get());
        this.dropSelf(ModBlocks.STRIPPED_NIGA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_NIGA_WOOD.get());
        this.dropSelf(ModBlocks.NIGA_SAPLING.get());

    }
    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }


}
