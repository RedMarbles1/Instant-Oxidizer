package net.redmarbles1.instantoxidizer.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.redmarbles1.instantoxidizer.InstantOxidizer;

public class InstantOxidizerItem {
    public static final Item OXIDIZER = registerItem("oxidizer",
            new Item(new FabricItemSettings().maxCount(16)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(InstantOxidizer.MOD_ID, name), item);
    }
    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, OXIDIZER);
    }
    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        InstantOxidizer.LOGGER.info("Registering Mod Items for" + InstantOxidizer.MOD_ID);
        addItemsToItemGroup();
    }
}
