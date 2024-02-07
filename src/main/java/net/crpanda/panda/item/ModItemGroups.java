package net.crpanda.panda.item;

import net.crpanda.panda.Panda;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
public static final ItemGroup PB_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Panda.MOD_ID, "peanut_butter"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.peanut_butter"))
                .icon(() -> new ItemStack(ModItems.PEANUT)).entries((displayContext, entries) -> {
                    entries.add(ModItems.PEANUT);
                    entries.add(ModItems.ROASTED_PEANUT);
                    entries.add(ModItems.PB_JAR);


                }).build());
public static void registerItemGroups() {

    Panda.LOGGER.info("Registering Item Groups for " + Panda.MOD_ID);
}

}
