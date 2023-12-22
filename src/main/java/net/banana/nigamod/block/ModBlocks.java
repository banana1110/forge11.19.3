package net.banana.nigamod.block;

import net.banana.nigamod.NigaMod;
import net.banana.nigamod.item.ModItem;
import net.banana.nigamod.world.Tree.NigaTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import javax.tools.Tool;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NigaMod.MOD_ID);

    public static final RegistryObject<Block> NIGA_BLOCK = registerBlock("niga_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> NIGA_ORE = registerBlock("niga_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_NIGA_ORE = registerBlock("deepslate_niga_ore",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> LIGMA_BLOCK = registerBlock("ligma_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(9f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CANDICE_BLOCK = registerBlock("candice_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIGA_LOG = registerBlock("niga_log",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NIGA_WOOD = registerBlock("niga_wood",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRIPPED_NIGA_LOG = registerBlock("stripped_niga_log",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(5f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> STRIPPED_NIGA_WOOD = registerBlock("stripped_niga_wood",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(5f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> NIGA_PLANKS = registerBlock("niga_planks",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(5f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> NIGA_LEAVES = registerBlock("niga_leaves",
            ()-> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .strength(5f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction){
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> NIGA_SAPLING = registerBlock("niga_sapling",
            ()-> new SaplingBlock(new NigaTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));



















    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return  toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItem.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }



    public static void  register (IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
