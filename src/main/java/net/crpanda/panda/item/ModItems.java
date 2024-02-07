package net.crpanda.panda.item;

import net.crpanda.panda.Panda;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class ModItems {
    public static final Item PB_JAR = registerItem("pb_jar", new Item(new FabricItemSettings()));
    public static final Item PEANUT = registerItem("peanut", new Item(new FabricItemSettings()));
    public static final Item ROASTED_PEANUT = registerItem("roasted_peanut", new Item(new FabricItemSettings()));



    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(PB_JAR);
         entries.add(PEANUT);
         entries.add(ROASTED_PEANUT);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Panda.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Panda.LOGGER.info("Registering Mod Items for " + Panda.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
