package net.silentchaos512.tutorial.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.silentchaos512.tutorial.TutorialMod;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_TEORITE = forge("ores/teorite_ore");
        public static final ITag.INamedTag<Block> ORES_TITANIUM = forge("ores/titanium_ore");

        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_TEORITE = forge("storage_blocks/teorite_block");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(TutorialMod.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        /*----------------------------   Ores   ------------------------------*/
        public static final ITag.INamedTag<Item> ORES_TEORITE = forge("ores/teorite_ore");
        public static final ITag.INamedTag<Item> ORES_TITANIUM = forge("ores/titanium_ore");

        /*----------------------------   Storage_blocks   ------------------------------*/
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_TEORITE = forge("storage_blocks/teorite_block");

        /*----------------------------   Ingots  ------------------------------*/
        public static final ITag.INamedTag<Item> INGOTS_TEORITE = forge("ingots/teorite_ingot");
        public static final ITag.INamedTag<Item> INGOTS_TITANIUM = forge("ingots/titanium_ingot");

        /*----------------------------   Equipments   ------------------------------*/
        public static final ITag.INamedTag<Item> SWORD_TEORITE = forge("equipment/teorite_sword");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(TutorialMod.MOD_ID, path).toString());
        }
    }
}
