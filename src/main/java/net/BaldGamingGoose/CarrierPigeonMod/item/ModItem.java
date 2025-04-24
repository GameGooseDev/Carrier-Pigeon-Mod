package net.BaldGamingGoose.CarrierPigeonMod.item;

import net.BaldGamingGoose.CarrierPigeonMod.CarrierPigeonMod;
import net.BaldGamingGoose.CarrierPigeonMod.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CarrierPigeonMod.MOD_ID);

    public static final RegistryObject<SpawnEggItem> CARRIER_PIGEON_EGG =
            ITEMS.register("carrier_pigeon_egg", () ->
                    new ForgeSpawnEggItem(ModEntities.CARRIER_PIGEON,0xaaaaaa, 0x444444,
                            new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
