package space.leonyew.item;

import space.leonyew.ToDoList;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void initialize(){
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
    }
    // the registry method.
    public static Item register(Item item, String id){
        return (Item) Registry.register(Registries.ITEM, Identifier.of(ToDoList.MOD_ID,id), item);
    }

}
