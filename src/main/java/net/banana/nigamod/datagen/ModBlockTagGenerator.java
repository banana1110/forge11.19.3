package net.banana.nigamod.datagen;

import net.banana.nigamod.NigaMod;
import net.banana.nigamod.block.ModBlocks;
import net.banana.nigamod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NigaMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.NIGA_ORE.get(),
                        ModBlocks.DEEPSLATE_NIGA_ORE.get(),
                        ModBlocks.LIGMA_BLOCK.get(),
                        ModBlocks.CANDICE_BLOCK.get(),
                        ModBlocks.NIGA_BLOCK.get());



this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
        .add(ModBlocks.NIGA_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_NIGA_TOOL)
                .add(ModBlocks.LIGMA_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_NIGA_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_NIGA_TOOL)
                .add(ModBlocks.CANDICE_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_NIGA_TOOL)
                .add(ModBlocks.NIGA_BLOCK.get());







    }
}
