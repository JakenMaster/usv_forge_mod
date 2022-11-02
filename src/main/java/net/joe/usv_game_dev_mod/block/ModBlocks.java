package net.joe.usv_game_dev_mod.block;

import net.joe.usv_game_dev_mod.USVMod;
import net.joe.usv_game_dev_mod.block.custom.ModFlammableRotatedPillarBlock;
import net.joe.usv_game_dev_mod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, USVMod.MOD_ID);

    public static final RegistryObject<Block> TITANIA_WOOD = registerBlock("titania_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).requiresCorrectToolForDrops()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TITANIA_LOG = registerBlock("titania_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).requiresCorrectToolForDrops()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_TITANIA_WOOD = registerBlock("stripped_titania_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).requiresCorrectToolForDrops()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_TITANIA_LOG = registerBlock("stripped_titania_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).requiresCorrectToolForDrops()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_PLANKS = registerBlock("titania_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).
                    requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
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
            },
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_LEAVES = registerBlock("titania_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).
                    requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
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
            }, CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_SLAB = registerBlock("titania_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).
                    requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
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
            },
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_STAIRS = registerBlock("titania_stairs",
            () -> new StairBlock(TITANIA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).
                    requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
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
            },
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_FENCE = registerBlock("titania_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).
                    requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
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
            },
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_FENCE_GATE = registerBlock("titania_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).
                    requiresCorrectToolForDrops()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
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
            },
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_BUTTON = registerBlock("titania_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).
                    requiresCorrectToolForDrops()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_PRESSURE_PLATE = registerBlock("titania_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).requiresCorrectToolForDrops()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> TITANIA_SAPLING = registerBlock("titania_sapling",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING).requiresCorrectToolForDrops()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {

        BLOCKS.register(eventBus);
    }
}
