package net.banana.nigamod.util;

import net.banana.nigamod.NigaMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block>  NEEDS_NIGA_TOOL =tag("needs_niga_tool");
        public static final TagKey<Block>  NEEDS_NIGA_WOODEN_TOOL =tag("needs_niga_wooden_tool");


        private static TagKey<Block> tag(String name) {
return BlockTags.create(new ResourceLocation(NigaMod.MOD_ID, name));

        }
    }
    public static class Items{

        private static TagKey<Item> tag(String name){
return ItemTags.create(new ResourceLocation(NigaMod.MOD_ID, name));

        }
    }



}
