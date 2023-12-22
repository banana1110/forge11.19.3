package net.banana.nigamod.datagen;

import net.banana.nigamod.NigaMod;
import net.banana.nigamod.block.ModBlocks;
import net.banana.nigamod.item.ModItem;
import net.banana.nigamod.util.ModTags;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
private static final List<ItemLike> NIGA_SMELTABLES = List.of(ModItem.Niga_Ingot.get(),
        ModBlocks.NIGA_ORE.get(), ModBlocks.DEEPSLATE_NIGA_ORE.get());





    public ModRecipeProvider(PackOutput output){
        super   (output);
    }



    @Override
    protected void  buildRecipes(Consumer<FinishedRecipe> consumer){
        oreSmelting(consumer, List.of(ModItem.Niga_Ingot.get()), RecipeCategory.MISC,
                ModItem.Ligma.get(), 0.8f, 150, "ligma");
        oreSmelting(consumer, NIGA_SMELTABLES, RecipeCategory.MISC,
                ModItem.Niga_Ingot.get(), 0.8f, 150, "niga_ingot");
ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NIGA_BLOCK.get())
        .pattern("SSS")
        .pattern("SSS")
        .pattern("SSS")
        .define('S',ModItem.Niga_Ingot.get())
        .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
        .save(consumer);
ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItem.Niga_Ingot.get(), 9)
        .requires(ModBlocks.NIGA_BLOCK.get())
        .unlockedBy(getHasName(ModBlocks.NIGA_BLOCK.get()),has(ModBlocks.NIGA_BLOCK.get()))
        .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGA_PLANKS.get(), 4)
                .requires(ModBlocks.NIGA_LOG.get())
                .unlockedBy(getHasName(ModBlocks.NIGA_LOG.get()),has(ModBlocks.NIGA_LOG.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItem.NIGA_SWORD.get())
                .pattern(" S")
                .pattern(" S")
                .pattern(" E")
                .define('E',  Items.STICK)
                .define('S', ModItem.Niga_Ingot.get())
                .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_PICKAXE.get())
                .pattern("SSS")
                .pattern(" E ")
                .pattern(" E ")
                .define('E',  Items.STICK)
                .define('S', ModItem.Niga_Ingot.get())
                .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_SHOVEL.get())
                .pattern(" S")
                .pattern(" E")
                .pattern(" E")
                .define('E',  Items.STICK)
                .define('S', ModItem.Niga_Ingot.get())
                .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_AXE.get())
                .pattern(" SS")
                .pattern(" SE")
                .pattern("  E")
                .define('E',  Items.STICK)
                .define('S', ModItem.Niga_Ingot.get())
                .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItem.NIGA_SWORD1.get())
                .pattern(" S")
                .pattern(" S")
                .pattern(" R")
                .define('R', ModItem.NIGA_STICK.get())
                .define('S', ModItem.Niga_Ingot.get())
                .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_PICKAXE1.get())
                .pattern("SSS")
                .pattern(" R ")
                .pattern(" R ")
                .define('R', ModItem.NIGA_STICK.get())
                .define('S', ModItem.Niga_Ingot.get())
                .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_SHOVEL1.get())
                .pattern(" S")
                .pattern(" R")
                .pattern(" R")
                .define('R',  ModItem.NIGA_STICK.get())
                .define('S', ModItem.Niga_Ingot.get())
                .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_AXE1.get())
                .pattern(" SS")
                .pattern(" SR")
                .pattern("  R")
                .define('R',  ModItem.NIGA_STICK.get())
                .define('S', ModItem.Niga_Ingot.get())
                .unlockedBy(getHasName(ModItem.Niga_Ingot.get()),has(ModItem.Niga_Ingot.get()))
                .save(consumer);
       ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItem.NIGA_STICK.get(), 4 )
               .pattern("R")
               .pattern("R")
               .define('R', ModBlocks.NIGA_PLANKS.get())
               .unlockedBy(getHasName(ModBlocks.NIGA_PLANKS.get()),has(ModBlocks.NIGA_PLANKS.get()))
               .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_WOODEN_AXE.get())
                .pattern(" SS")
                .pattern(" SR")
                .pattern("  R")
                .define('R',  ModItem.NIGA_STICK.get())
                .define('S', ModBlocks.NIGA_PLANKS.get())
                .unlockedBy(getHasName(ModItem.NIGA_STICK.get()),has(ModItem.NIGA_STICK.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_WOODEN_SHOVEL.get())
                .pattern(" S")
                .pattern(" R")
                .pattern(" R")
                .define('R',  ModItem.NIGA_STICK.get())
                .define('S', ModBlocks.NIGA_PLANKS.get())
                .unlockedBy(getHasName(ModItem.NIGA_STICK.get()),has(ModItem.NIGA_STICK.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_WOODEN_SWORD.get())
                .pattern(" S")
                .pattern(" S")
                .pattern(" R")
                .define('R',  ModItem.NIGA_STICK.get())
                .define('S', ModBlocks.NIGA_PLANKS.get())
                .unlockedBy(getHasName(ModItem.NIGA_STICK.get()),has(ModItem.NIGA_STICK.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NIGA_WOODEN_PICKAXE.get())
                .pattern("SSS")
                .pattern(" R ")
                .pattern(" R ")
                .define('R',  ModItem.NIGA_STICK.get())
                .define('S', ModBlocks.NIGA_PLANKS.get())
                .unlockedBy(getHasName(ModItem.NIGA_STICK.get()),has(ModItem.NIGA_STICK.get()))
                .save(consumer);







    }
    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }
    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_).group(p_251450_).unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, new ResourceLocation(NigaMod.MOD_ID,getItemName( p_250066_)) + p_249236_ + "_" + getItemName(itemlike));
        }

    }
    protected static void planksFromLogs(Consumer<FinishedRecipe> p_259910_, ItemLike p_259193_, TagKey<Item> p_259818_, int p_259807_) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, p_259193_, p_259807_).requires(p_259818_).group("planks").unlockedBy("has_logs", has(p_259818_)).save(p_259910_);
    }
    protected static void planksFromLog(Consumer<FinishedRecipe> p_259712_, ItemLike p_259052_, TagKey<Item> p_259045_, int p_259471_) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, p_259052_, p_259471_).requires(p_259045_).group("planks").unlockedBy("has_log", has(p_259045_)).save(p_259712_,new ResourceLocation(NigaMod.MOD_ID));
    }

}
