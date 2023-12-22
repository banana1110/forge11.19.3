package net.banana.nigamod.item;

import net.banana.nigamod.NigaMod;
import net.banana.nigamod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier NIGA = TierSortingRegistry.registerTier(
new ForgeTier(6, 2500, 8f, 5f, 30,
        ModTags.Blocks.NEEDS_NIGA_TOOL, () -> Ingredient.of(ModItem.Niga_Ingot.get())),
            new ResourceLocation(NigaMod.MOD_ID, "niga_ingot"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier NIGA_WOOD = TierSortingRegistry.registerTier(
            new ForgeTier(1, 180, 5f, 1.5f, 9,
                    ModTags.Blocks.NEEDS_NIGA_WOODEN_TOOL, () -> Ingredient.of(ModItem.Niga_Ingot.get())),
            new ResourceLocation(NigaMod.MOD_ID, "niga_planks"), List.of(Tiers.STONE), List.of(Tiers.IRON)



    );



}
