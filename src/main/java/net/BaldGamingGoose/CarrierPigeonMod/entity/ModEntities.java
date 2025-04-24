package net.BaldGamingGoose.CarrierPigeonMod.entity;

import net.BaldGamingGoose.CarrierPigeonMod.CarrierPigeonMod;
import net.BaldGamingGoose.CarrierPigeonMod.entity.custom.PigeonEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CarrierPigeonMod.MOD_ID);
    public static final RegistryObject<EntityType<PigeonEntity>> CARRIER_PIGEON =
            ENTITIES.register("carrier_pigeon", () ->
                    EntityType.Builder.<PigeonEntity>of(PigeonEntity::new, MobCategory.CREATURE)
                            .sized(0.5f, 0.9f)
                            .build("carrier_pigeon"));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
